package reportes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import vistas.home;
import java.util.prefs.Preferences;
import models.certificadosVistaModel;
import models.modelHallazgosGen;
import models.modelResumen;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import vistas.perforacion.Menu;
import vistas.perforacion.Portada;
import vistas.perforacion.configuracionSistemas;

import vistas.perforacion.formularioPerforacion;
import vistas.perforacion.graficas;
import vistas.perforacion.hallazgosGenerales;
import vistas.perforacion.infoPerforacion;
import vistas.perforacion.resumenInspeccion;
import vistas.plantillas;

public class leePlantilla {

    LocalDateTime fechaHoraActual = LocalDateTime.now();
    String formatoFechaHora = "dd-MM-yyyy";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatoFechaHora);
    String fechaHoraActualComoString = fechaHoraActual.format(formatter);
    String cadenaAleatoria = generarCadenaAleatoria(4);
    String path = "documentos-generados/perforacion/";
    private static leePlantilla instancia = new leePlantilla();
    //private ArrayList<String> infoPerforacion = new ArrayList<>();
    ArrayList<String> dataTable = new ArrayList<>();
    ArrayList<String> imagePaths = new ArrayList<>();
    ArrayList<String> descs = new ArrayList<>();
    private ArrayList<modelHallazgosGen> hallazgosGen = new ArrayList<>();
    private ArrayList<modelHallazgosGen> hallazgosGenCerrados = new ArrayList<>();
    private ArrayList<modelHallazgosGen> hallazgosGenRel = new ArrayList<>();
    private ArrayList<modelHallazgosGen> hallazgosGenarles = new ArrayList<>();
    private ArrayList<certificadosVistaModel> certificados = new ArrayList<>();

    private leePlantilla() {
    }

    public static leePlantilla obtenerInstancia() {
        return instancia;
    }

    public void llenadoTabla() {
        Preferences preferencias = Preferences.userNodeForPackage(hallazgosGenerales.class);

        dataTable.addAll(capturarListaDePref(preferencias.get("sistemas", "")));
        imagePaths.addAll(capturarListaDePref(preferencias.get("imgs", "")));
        descs.addAll(capturarListaDePref(preferencias.get("descs", "")));
        capturaHallazgos();
        capturarCertificados();

        String response = leeDoc();
        graficas g = new graficas();
        g.setVisible(true);
        JOptionPane.showMessageDialog(null, response);

    }

    private void capturarCertificados() {
        Preferences prefs = Preferences.userNodeForPackage(hallazgosGenerales.class);
        int size = prefs.getInt("sizeCertificados", 0);
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                certificadosVistaModel c = new certificadosVistaModel();

                c.setEquipo(prefs.get("equipo" + i, ""));
                c.setFechaSerti(prefs.get("fechaCetificado" + i, ""));
                c.setVencimiento(prefs.get("vencimiento" + i, ""));
                c.setMt(prefs.getInt("mt" + 1, 0));
                c.setRefNorma(prefs.get("referenciaNorma" + i, ""));
                c.setComentarios(prefs.get("comentarios" + i, ""));
                c.setEstado(prefs.get("estado" + i, ""));

                certificados.add(c);

            }

        }
    }

    public void capturaHallazgos() {
        Preferences prefs = Preferences.userNodeForPackage(hallazgosGenerales.class);

        int sizeHallazgos = prefs.getInt("sizeHallazgos", 0);

        if (sizeHallazgos != 0) {
            for (int i = 0; i < sizeHallazgos; i++) {
                int tipoHallazgo = prefs.getInt("tipoHallazgo" + i, 0);

                modelHallazgosGen hallazgo = new modelHallazgosGen();
                hallazgo.setNombreSistem(prefs.get("nombreSistem" + i, ""));
                hallazgo.setNombreEquipo(prefs.get("nombreEquipo" + i, ""));
                hallazgo.setDesc(prefs.get("Desc" + i, ""));
                hallazgo.setImgUno(prefs.get("imgUno" + i, ""));
                hallazgo.setImgDos(prefs.get("imgDos" + i, ""));
                hallazgo.setImgTres(prefs.get("imgTres" + i, ""));
                hallazgo.setPrioridad(prefs.get("prioridad" + i, ""));
                hallazgo.setTipoHallazgo(tipoHallazgo);
                hallazgosGen.add(hallazgo);

            }

            for (int i = 0; i < hallazgosGen.size(); i++) {
                modelHallazgosGen hallazgo = hallazgosGen.get(i);
                System.out.println(hallazgo.getTipoHallazgo());
                switch (hallazgo.getTipoHallazgo()) {

                    case 0:
                        modelHallazgosGen hallazgoGeneral = new modelHallazgosGen();
                        hallazgoGeneral.setNombreSistem(hallazgo.getNombreSistem());
                        hallazgoGeneral.setNombreEquipo(hallazgo.getNombreEquipo());
                        hallazgoGeneral.setDesc(hallazgo.getDesc());
                        hallazgoGeneral.setImgUno(hallazgo.getImgUno());
                        hallazgoGeneral.setImgDos(hallazgo.getImgDos());
                        hallazgoGeneral.setImgTres(hallazgo.getImgTres());
                        hallazgoGeneral.setPrioridad(hallazgo.getPrioridad());
                        hallazgoGeneral.setTipoHallazgo(hallazgo.getTipoHallazgo());
                        hallazgosGenarles.add(hallazgoGeneral);

                        break;
                    case 1:
                        modelHallazgosGen hallazgoCerrado = new modelHallazgosGen();
                        hallazgoCerrado.setNombreSistem(hallazgo.getNombreSistem());
                        hallazgoCerrado.setNombreEquipo(hallazgo.getNombreEquipo());
                        hallazgoCerrado.setDesc(hallazgo.getDesc());
                        hallazgoCerrado.setImgUno(hallazgo.getImgUno());
                        hallazgoCerrado.setImgDos(hallazgo.getImgDos());
                        hallazgoCerrado.setImgTres(hallazgo.getImgTres());
                        hallazgoCerrado.setPrioridad(hallazgo.getPrioridad());
                        hallazgoCerrado.setTipoHallazgo(hallazgo.getTipoHallazgo());
                        hallazgosGenCerrados.add(hallazgoCerrado);

                        break;
                    case 2:
                        modelHallazgosGen hallazgoRelevante = new modelHallazgosGen();
                        hallazgoRelevante.setNombreSistem(hallazgo.getNombreSistem());
                        hallazgoRelevante.setNombreEquipo(hallazgo.getNombreEquipo());
                        hallazgoRelevante.setDesc(hallazgo.getDesc());
                        hallazgoRelevante.setImgUno(hallazgo.getImgUno());
                        hallazgoRelevante.setImgDos(hallazgo.getImgDos());
                        hallazgoRelevante.setImgTres(hallazgo.getImgTres());
                        hallazgoRelevante.setPrioridad(hallazgo.getPrioridad());
                        hallazgoRelevante.setTipoHallazgo(hallazgo.getTipoHallazgo());
                        hallazgosGenRel.add(hallazgoRelevante);
                        break;

                }

            }

        }

    }

    public static ArrayList<String> capturarListaDePref(String lista) {
        String[] data = lista.split(",");
        ArrayList<String> dataList = new ArrayList<>();
        for (String elemento : data) {
            dataList.add(elemento.trim());
            System.out.println(elemento);
        }
        return dataList;
    }

    public String
            leeDoc() {
        Preferences plantillas = Preferences.userNodeForPackage(plantillas.class
        );
        String Message = "";
        String Plantilla = plantillas.get("plantilla", " ");

        switch (Plantilla) {
            case "perforacion":
                try {
                FileInputStream fis = new FileInputStream("src/plantillas/perforacion.docx");
                XWPFDocument document = new XWPFDocument(fis);
                Preferences portada = Preferences.userNodeForPackage(Portada.class);
                Preferences vistaUno = Preferences.userNodeForPackage(formularioPerforacion.class);
                Preferences vistaDos = Preferences.userNodeForPackage(infoPerforacion.class);
                Preferences infoPer1 = Preferences.userNodeForPackage(infoPerforacion.class);
                Preferences prefsGraficas = Preferences.userNodeForPackage(graficas.class);

                replaceText(document, "titulo", portada.get("Titulo", " "));
                replaceText(document, "companiaContra", portada.get("Compañiacontratante", " "));
                replaceText(document, "companiaSeriv", portada.get("comapañiaservicio", " "));
                replaceText(document, "IDFECHADOC", portada.get("fechaDoc", " "));
                replaceText(document, "Equiporieg", vistaUno.get("equipoRieg", " "));

                replaceText(document, "nombreUno", vistaUno.get("nombre1", " "));
                replaceText(document, "celularUno", vistaUno.get("celular1", " "));
                replaceText(document, "correoUno", vistaUno.get("correo1", " "));
                replaceText(document, "nombreDos", vistaUno.get("nombre2", " "));
                replaceText(document, "celularDos", vistaUno.get("celular2", " "));
                replaceText(document, "correoDos", vistaUno.get("correo2", " "));
                replaceText(document, "nombreTres", vistaUno.get("nombre3", " "));
                replaceText(document, "celularTres", vistaUno.get("celular3", " "));
                replaceText(document, "correoTres", vistaUno.get("correo3", " "));

                replaceText(document, "Nombre4", vistaUno.get("nombre4", " "));
                replaceText(document, "Ceular4", vistaUno.get("celular4", " "));
                replaceText(document, "Correo4", vistaUno.get("correo4", " "));
                replaceText(document, "Nombre5", vistaUno.get("nombre5", " "));
                replaceText(document, "Ceular5", vistaUno.get("celular5", " "));
                replaceText(document, "Correo5", vistaUno.get("correo5", " "));
                replaceText(document, "Nombre6", vistaUno.get("nombre6", " "));
                replaceText(document, "Celular6", vistaUno.get("celular6", " "));
                replaceText(document, "Correo6", vistaUno.get("correo6", " "));

                replaceText(document, "idpozo", vistaUno.get("pozo", " "));
                replaceText(document, "idmuni", vistaUno.get("municipio", " "));
                replaceText(document, "iddepa", vistaUno.get("depa", " "));
                replaceText(document, "ubiPozo", vistaDos.get("ubiPozo", " "));
                replaceText(document, "activdadEqui", vistaDos.get("activdadEqui", " "));
                replaceText(document, "fechaIni", vistaDos.get("fechaIni", " "));
                replaceText(document, "fehaFin", vistaDos.get("fehaFin", " "));
                replaceText(document, "compaIns", vistaDos.get("compaIns", " "));
                replaceText(document, "nameSuper", vistaDos.get("nameSuper", " "));
                replaceText(document, "celSuper", vistaDos.get("celSuper", " "));
                replaceText(document, "nameAsis", vistaDos.get("nameAsis", " "));
                replaceText(document, "celAsis", vistaDos.get("celAsis", " "));
                replaceText(document, "nameInspect", vistaDos.get("nameInspect", " "));
                replaceText(document, "celInspect", vistaDos.get("celInspect", " "));
                llenadoResumen(document);

                replaceSelects(document, infoPer1.getInt("perf1", 0), "Perf1");
                replaceSelects(document, infoPer1.getInt("perf2", 0), "Perf2");
                replaceSelects(document, infoPer1.getInt("perf3", 0), "Perf3");
                replaceSelects(document, infoPer1.getInt("perf4", 0), "Perf4");
                replaceSelects(document, infoPer1.getInt("wk1", 0), "Wk1");
                replaceSelects(document, infoPer1.getInt("wk2", 0), "Wk2");
                replaceSelects(document, infoPer1.getInt("wk3", 0), "Wk3");
                replaceSelects(document, infoPer1.getInt("wk4", 0), "Wk4");

                replaceSelects(document, infoPer1.getInt("IVSEH1", 0), "IVPSEH1");
                replaceSelects(document, infoPer1.getInt("IVSEH2", 0), "IVSEH2");
                replaceSelects(document, infoPer1.getInt("IVSEH3", 0), "IVSEH3");
                replaceSelects(document, infoPer1.getInt("IVSEH4", 0), "IVSEH4");
                replaceSelects(document, infoPer1.getInt("ICFR1", 0), "ICFR1");
                replaceSelects(document, infoPer1.getInt("ICFR2", 0), "ICFR2");
                replaceSelects(document, infoPer1.getInt("ICFR3", 0), "ICFR3");
                replaceSelects(document, infoPer1.getInt("ICFR4", 0), "ICFR4");

                replaceSelects(document, infoPer1.getInt("ERIAI1", 0), "ERIAI1");
                replaceSelects(document, infoPer1.getInt("ERIAI2", 0), "ERIAI2");
                replaceSelects(document, infoPer1.getInt("ERIAI3", 0), "ERIAI3");
                replaceSelects(document, infoPer1.getInt("ERIAI4", 0), "ERIAI4");

                replaceText(document, "descImgUno", vistaDos.get("descripcionimagenuno", " "));
                replaceText(document, "descImgDos", vistaDos.get("descripcionimagedos", " "));
                replaceText(document, "descImgTres", vistaDos.get("descripcionimagentres", " "));
                replaceText(document, "descImgCuatro", vistaDos.get("descripcionimagencuatro", " "));
                replaceText(document, "IdProposito", vistaDos.get("propositoInspect", " "));

                //agregar datos a db de tabla de configuracion de sistemas
                addTable(document, dataTable, imagePaths, descs);
                addTableHallazgosGen(document, hallazgosGenRel, 1, "Id_tabla_rele");
                addTableHallazgosGen(document, hallazgosGenarles, 2, "Id_tabla_hallazgos_gen");
                addTableHallazgosGen(document, hallazgosGenCerrados, 2, "Id_tabla_hallazgos_cerrados");

                //certificados
                addTableCertificados(document, certificados, "ID_CERTIFICADOS_NDT_INSPECCION");

                String nameFile = path + "perforaccion-" + fechaHoraActualComoString + "-" + cadenaAleatoria + ".docx";
                FileOutputStream fos = new FileOutputStream(nameFile);
                document.write(fos);

                
               String img1  = prefsGraficas.get("graficoTorartaHallazgos", " ");
               String img3 =   prefsGraficas.get("graficoBarrasHallazgos", " ");
               String img2 =   prefsGraficas.get("graficoTortaCertificados", " ");
                    System.out.println(img1);
                
                
                
                insertImageWithApachePOI(nameFile, prefsGraficas.get("graficoTorartaHallazgos", " "), "idGraficaTortaHallazgos");
                insertImageWithApachePOI(nameFile, prefsGraficas.get("graficoBarrasHallazgos", " "), "idGraficaBarrasHallazgos");
                insertImageWithApachePOI(nameFile, prefsGraficas.get("graficoTortaCertificados", " "), "idGraficaCertificados");
                
                
                
                System.out.println("aaaaaaaaaaa" + prefsGraficas.get("graficoTorartaHallazgos", " no se encontro"));

                insertImageWithApachePOI(nameFile, vistaDos.get("imgUno", " "), "idImgUno");
                insertImageWithApachePOI(nameFile, vistaDos.get("imgDos", " "), "imgDos");
                insertImageWithApachePOI(nameFile, vistaDos.get("imgTres", " "), "imgTres");
                insertImageWithApachePOI(nameFile, vistaDos.get("imgCuatro", " "), "imgCuatro");

                fis
                        .close();
                fos.close();

                Message = "reporte creado de forma correcta" + " " + nameFile;
                return Message;

            } catch (IOException e) {
                Message = " Error al generar documento";

            }
            break;

            case "well services":
                try {

                FileInputStream fis = new FileInputStream("src/plantillas/WELLSERVICES.docx");
                XWPFDocument document = new XWPFDocument(fis);

                replaceText(document, "{reemplazar}", "TextoNuevo");

                FileOutputStream fos = new FileOutputStream("documento_modificado.docx");
                document.write(fos);

                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            break;

            case "workover":
                try {

                FileInputStream fis = new FileInputStream("src/plantillas/WORKOVER.docx");
                XWPFDocument document = new XWPFDocument(fis);

                replaceText(document, "{reemplazar}", "TextoNuevo");

                FileOutputStream fos = new FileOutputStream("documento_modificado.docx");
                document.write(fos);

                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            break;

            default:
                JOptionPane.showMessageDialog(null, "no se encontro plantilla");
        }

        return Message;

    }

    public void replaceSelects(XWPFDocument document, int value, String key) {
        if (value == 1) {
            replaceText(document, key, "x");
        } else {
            replaceText(document, key, " ");

        }
        //si es 1 se reemplaza por x y si no es vacio " "
    }

    public void llenadoResumen(XWPFDocument document) {
        Preferences resumen = Preferences.userNodeForPackage(resumenInspeccion.class
        );
        int size = Integer.parseInt(resumen.get("sizeResumen", "0"));
        ArrayList<modelResumen> data = new ArrayList();

        for (int i = 0;
                i < size;
                i++) {
            String name = "nameResumen" + i;
            String desc = "descResumen" + i;
            data.add(new modelResumen(resumen.get(name, " "), resumen.get(desc, " ")));
        }

        addTable2(document, data);
    }

    private static void addTable2(XWPFDocument document, ArrayList<modelResumen> data) {
        for (XWPFParagraph paragraph : document.getParagraphs()) {
            for (XWPFRun run : paragraph.getRuns()) {
                String text = run.getText(0);
                if (text != null && text.contains("idResumen")) {
                    text = text.replace("idResumen", "");
                    run.setText(text, 0);

                    createTableWithRows2(document, data, paragraph);

                    return;
                }
            }
        }
    }

    private static void createTableWithRows2(XWPFDocument document, ArrayList<modelResumen> data, XWPFParagraph paragraph) {
        XWPFTable table = document.insertNewTbl(paragraph.getCTP().newCursor());

        XWPFTableRow tableRowOne = table.getRow(0);
        tableRowOne.getCell(0).setText("NOMBRE");
        tableRowOne.addNewTableCell().setText("DESCRIPCION");

        for (int i = 0; i < data.size(); i++) {
            modelResumen info = data.get(i);

            XWPFTableRow tableRow = table.createRow();
            tableRow.getCell(0).setText(info.getName());
            tableRow.getCell(1).setText(info.getDesc());

        }
    }

    public static void insertImageWithApachePOI(String existingDocumentPath, String imagePath, String keyword) throws IOException {
        try (FileInputStream fis = new FileInputStream(existingDocumentPath)) {

            XWPFDocument doc = new XWPFDocument(fis);

            // Recorremos los párrafos en busca de la palabra clave
            for (XWPFParagraph paragraph : doc.getParagraphs()) {
                List<XWPFRun> runs = paragraph.getRuns();
                for (int i = 0; i < runs.size(); i++) {
                    XWPFRun run = runs.get(i);
                    String text = run.getText(0);
                    if (text != null && text.contains(keyword)) {
                        // Borramos la palabra clave existente
                        run.setText("", 0);

                        // Insertamos la imagen en lugar de la palabra clave
                        FileInputStream imageStream = new FileInputStream(imagePath);
                        try (InputStream pic = new FileInputStream(imagePath)) {
                            run.addPicture(pic, XWPFDocument.PICTURE_TYPE_JPEG, imagePath, Units.toEMU(400), Units.toEMU(200));
                        } catch (InvalidFormatException | IOException e) {
                            e.printStackTrace();
                        }

                        imageStream.close();
                    }
                }
            }
            System.out.println("Documento editado exitosamente: " + existingDocumentPath);

            try (FileOutputStream fos = new FileOutputStream(existingDocumentPath)) {
                doc.write(fos);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void replaceText(XWPFDocument document, String oldText, String newText) {
        // Reemplazo en párrafos
        for (XWPFParagraph paragraph : document.getParagraphs()) {
            for (XWPFRun run : paragraph.getRuns()) {
                String text = run.getText(0);
                if (text != null && text.contains(oldText)) {
                    text = text.replace(oldText, newText);

                    run.setText(text, 0);
                }
            }
        }

        // Reemplazo en tablas
        for (XWPFTable table : document.getTables()) {
            for (XWPFTableRow row : table.getRows()) {
                for (XWPFTableCell cell : row.getTableCells()) {
                    for (XWPFParagraph paragraph : cell.getParagraphs()) {
                        for (XWPFRun run : paragraph.getRuns()) {
                            String text = run.getText(0);
                            if (text != null && text.contains(oldText)) {
                                text = text.replace(oldText, newText);
                                run.setText(text, 0);

                            }
                        }
                    }
                }
            }
        }
    }

    private static void addTable(XWPFDocument document, ArrayList<String> dataTable, ArrayList<String> imagePaths, ArrayList<String> descs) {
        for (XWPFParagraph paragraph : document.getParagraphs()) {
            for (XWPFRun run : paragraph.getRuns()) {
                String text = run.getText(0);
                if (text != null && text.contains("Id_tabla_configuracion")) {
                    text = text.replace("Id_tabla_configuracion", "");
                    run.setText(text, 0);

                    createTableWithRows(document, dataTable, imagePaths, descs, paragraph);

                    return;
                }
            }
        }
    }

    private static void createTableWithRows(XWPFDocument document, ArrayList<String> dataTable, ArrayList<String> imagePaths, ArrayList<String> descs, XWPFParagraph paragraph) {
        XWPFTable table = document.insertNewTbl(paragraph.getCTP().newCursor());

        XWPFTableRow tableRowOne = table.getRow(0);
        tableRowOne.getCell(0).setText("TIPO SISTEMA");
        tableRowOne.addNewTableCell().setText("DESCRIPCION");
        tableRowOne.addNewTableCell().setText("IMAGEN");

        for (int i = 0; i < dataTable.size(); i++) {
            XWPFTableRow tableRow = table.createRow();
            tableRow.getCell(0).setText(dataTable.get(i));
            tableRow.getCell(1).setText(descs.get(i));

            XWPFTableCell imageCell = tableRow.getCell(2);
            try {
                addImage(document, imagePaths.get(i), imageCell);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void addImage(XWPFDocument document, String imagePath, XWPFTableCell cell) throws IOException {
        XWPFParagraph paragraph = cell.addParagraph();
        XWPFRun run = paragraph.createRun();
        try (InputStream imageStream = new FileInputStream(imagePath)) {
            run.addPicture(imageStream, XWPFDocument.PICTURE_TYPE_JPEG, imagePath, Units.toEMU(100), Units.toEMU(100));

        } catch (InvalidFormatException ex) {
            Logger.getLogger(leePlantilla.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String generarCadenaAleatoria(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        Random random = new Random();

        StringBuilder cadenaAleatoria = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            cadenaAleatoria.append(caracterAleatorio);
        }

        return cadenaAleatoria.toString();
    }

    //crear tablas de hallazgos con los arrays 
    private static void addTableHallazgosGen(XWPFDocument document, ArrayList<modelHallazgosGen> dataTable, int key, String keyTable) {

        try {
            for (XWPFParagraph paragraph : document.getParagraphs()) {
                for (XWPFRun run : paragraph.getRuns()) {
                    String text = run.getText(0);
                    if (text != null && text.contains(keyTable)) {
                        text = text.replace(keyTable, "");
                        run.setText(text, 0);

                        switch (key) {
                            case 1:
                                createTableWithRowsHallazgosGen(document, dataTable, paragraph);
                                break;
                            case 2:
                                createTableWithRowsHallazgosCerr(document, dataTable, paragraph);
                                break;

                        }

                        return;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("no se pudo agregar la tabla de hallazgos" + e.getMessage());
        }
    }

    private static void createTableWithRowsHallazgosGen(XWPFDocument document, ArrayList<modelHallazgosGen> dataTable, XWPFParagraph paragraph) {
        XWPFTable table = document.insertNewTbl(paragraph.getCTP().newCursor());

        XWPFTableRow tableRowOne = table.getRow(0);
        tableRowOne.getCell(0).setText("Nombre Equipo ");
        tableRowOne.addNewTableCell().setText("Sistema");
        tableRowOne.addNewTableCell().setText("Prioridad");
        tableRowOne.addNewTableCell().setText("Descripcion");

        tableRowOne.addNewTableCell().setText("Registros Fotograficos");

        for (int i = 0; i < dataTable.size(); i++) {
            modelHallazgosGen payload = dataTable.get(i);

            XWPFTableRow tableRow = table.createRow();
            tableRow.getCell(0).setText(payload.getNombreEquipo());
            tableRow.getCell(1).setText(payload.getNombreSistem());
            tableRow.getCell(2).setText(payload.getPrioridad());
            tableRow.getCell(3).setText(payload.getDesc());

            XWPFTableCell imageCell = tableRow.getCell(4);
            try {
                addImage(document, payload.getImgUno(), imageCell);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Obtener la celda de la prioridad (índice 2) y establecer el color según el valor de prioridad
            XWPFTableCell priorityCell = tableRow.getCell(2);
            switch (payload.getPrioridad()) {
                case "CRÍTICO/EJECUCIÓN INMEDIATA":
                    priorityCell.setColor("FF0000");
                    break;
                case "MAYOR/EJECUCIÓN DURANTE OPERACIÓN":
                    priorityCell.setColor("FFFF00");

                    break;
                case "MENOR":
                    priorityCell.setColor("00FF00");

                    break;

                case "EN BUEN ESTADO":
                    priorityCell.setColor("CCCCCC");
                    break;

                default:
                    break;
            }
        }
    }

    private static void createTableWithRowsHallazgosCerr(XWPFDocument document, ArrayList<modelHallazgosGen> dataTable, XWPFParagraph paragraph) {
        XWPFTable table = document.insertNewTbl(paragraph.getCTP().newCursor());

        XWPFTableRow tableRowOne = table.getRow(0);
        tableRowOne.getCell(0).setText("Nombre Equipo");
        tableRowOne.addNewTableCell().setText("Sistema");
        tableRowOne.addNewTableCell().setText("Descripcion");
        tableRowOne.addNewTableCell().setText("Prioridad");
        tableRowOne.addNewTableCell().setText("Antes");
        tableRowOne.addNewTableCell().setText("Despues");

        for (int i = 0; i < dataTable.size(); i++) {
            modelHallazgosGen payload = dataTable.get(i);

            XWPFTableRow tableRow = table.createRow();
            tableRow.getCell(0).setText(payload.getNombreEquipo());
            tableRow.getCell(1).setText(payload.getNombreSistem());
            tableRow.getCell(2).setText(payload.getDesc());
            tableRow.getCell(3).setText(payload.getPrioridad());

            XWPFTableCell imageCell = tableRow.getCell(4);
            XWPFTableCell imageCell2 = tableRow.getCell(5);
            try {
                addImage(document, payload.getImgUno(), imageCell);
                addImage(document, payload.getImgUno(), imageCell2);
            } catch (IOException e) {
                e.printStackTrace();
            }

            XWPFTableCell priorityCell = tableRow.getCell(2);
            switch (payload.getPrioridad()) {
                case "CRÍTICO/EJECUCIÓN INMEDIATA":
                    priorityCell.setColor("FF0000");
                    break;
                case "MAYOR/EJECUCIÓN DURANTE OPERACIÓN":
                    priorityCell.setColor("FFFF00");

                    break;
                case "MENOR":
                    priorityCell.setColor("00FF00");

                    break;

                case "EN BUEN ESTADO":
                    priorityCell.setColor("CCCCCC");
                    break;

                default:
                    break;
            }
        }
    }

    //crear tablas de hallazgos con los arrays 
    private static void addTableCertificados(XWPFDocument document, ArrayList<certificadosVistaModel> dataTable, String keyTable) {

        try {
            for (XWPFParagraph paragraph : document.getParagraphs()) {
                for (XWPFRun run : paragraph.getRuns()) {
                    String text = run.getText(0);
                    if (text != null && text.contains(keyTable)) {
                        text = text.replace(keyTable, "");
                        run.setText(text, 0);

                        createTableCertificadosWtiRows(document, dataTable, paragraph);

                        return;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("no se pudo agregar la tabla de hallazgos" + e.getMessage());
        }
    }

    private static void createTableCertificadosWtiRows(XWPFDocument document, ArrayList<certificadosVistaModel> dataTable, XWPFParagraph paragraph) {
        XWPFTable table = document.insertNewTbl(paragraph.getCTP().newCursor());

        XWPFTableRow tableRowOne = table.getRow(0);
        tableRowOne.getCell(0).setText("EQUIPO");
        tableRowOne.addNewTableCell().setText("FECHA CERTIFICADO");
        tableRowOne.addNewTableCell().setText("VENCIMIENTO");
        tableRowOne.addNewTableCell().setText("REFERENCIA A NORMA");
        tableRowOne.addNewTableCell().setText("MT");
        tableRowOne.addNewTableCell().setText("COMENTARIOS");

        for (int i = 0; i < dataTable.size(); i++) {
            certificadosVistaModel payload = dataTable.get(i);
            String mt = (payload.getMt() == 0) ? "NO" : "SI";

            XWPFTableRow tableRow = table.createRow();
            tableRow.getCell(0).setText(payload.getEquipo());
            tableRow.getCell(1).setText(payload.getFechaSerti());
            tableRow.getCell(2).setText(payload.getVencimiento());
            tableRow.getCell(3).setText(payload.getRefNorma());
            tableRow.getCell(4).setText(mt);
            tableRow.getCell(5).setText(payload.getComentarios());

            XWPFTableCell priorityCell = tableRow.getCell(5);
            switch (payload.getEstado()) {
                case "NO CONFORME":
                    priorityCell.setColor("FF0000"); // Rojo
                    break;
                case "ENTREGADO-PENDIENTE POR REVISAR":
                    priorityCell.setColor("FFFF00"); // Amarillo
                    break;
                case "APROBADO":
                    priorityCell.setColor("0000FF"); // Azul
                    break;
                case "SIN ENTREGAR":
                    priorityCell.setColor("FFFFFF"); // Blanco
                    break;
                default:
                    break;
            }
        }
    }

}
