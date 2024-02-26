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
import vistas.perforacion.Menu;
import vistas.perforacion.Portada;

import vistas.perforacion.formularioPerforacion;
import vistas.perforacion.infoPerforacion;
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

    private leePlantilla() {
    }

    public static leePlantilla obtenerInstancia() {
        return instancia;
    }

    public void llenadoTabla(ArrayList<String> data, ArrayList<String> images, ArrayList<String> desc) {
        if (dataTable != null && imagePaths != null && descs != null) {
            dataTable.addAll(data);
            imagePaths.addAll(images);
            descs.addAll(desc);

            String response = leeDoc();
            JOptionPane.showMessageDialog(null, response);
            home h = new home();
            h.setVisible(true);

        } else {
            System.out.println("Alguno de los parámetros es null");
        }

    }

    public String leeDoc() {
        Preferences plantillas = Preferences.userNodeForPackage(plantillas.class);
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
                    String nameFile = path + "perforaccion-" + fechaHoraActualComoString + "-" + cadenaAleatoria + ".docx";
                    FileOutputStream fos = new FileOutputStream(nameFile);
                    document.write(fos);

                    fis.close();
                    fos.close();

                    insertImageWithApachePOI(nameFile, vistaDos.get("imgUno", " "), "idImgUno");
                    insertImageWithApachePOI(nameFile, vistaDos.get("imgDos", " "), "imgDos");
                    insertImageWithApachePOI(nameFile, vistaDos.get("imgTres", " "), "imgTres");
                    insertImageWithApachePOI(nameFile, vistaDos.get("imgCuatro", " "), "imgCuatro");
                    try {

                        conexion con = new conexion();
                        con.InsertDocument();
                        vistaUno.clear();
                        System.out.println("Todas las preferencias han sido eliminadas.");

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

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

    public static void insertImageWithApachePOI(String existingDocumentPath, String imagePath, String keyword) throws IOException {
        try ( FileInputStream fis = new FileInputStream(existingDocumentPath)) {
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
                        try {
                            run.addPicture(imageStream, XWPFDocument.PICTURE_TYPE_JPEG, imagePath, Units.toEMU(300), Units.toEMU(300));
                        } catch (InvalidFormatException ex) {
                            Logger.getLogger(leePlantilla.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        imageStream.close();
                    }
                }
            }
            System.out.println("Documento editado exitosamente: " + existingDocumentPath);

            try ( FileOutputStream fos = new FileOutputStream(existingDocumentPath)) {
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
        try ( InputStream imageStream = new FileInputStream(imagePath)) {
            run.addPicture(imageStream, XWPFDocument.PICTURE_TYPE_JPEG, imagePath, Units.toEMU(100), Units.toEMU(100));
        } catch (InvalidFormatException ex) {
            Logger.getLogger(leePlantilla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String generarCadenaAleatoria(int longitud) {
        // Caracteres posibles para la cadena aleatoria
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Crear un objeto Random
        Random random = new Random();

        // StringBuilder para construir la cadena aleatoria
        StringBuilder cadenaAleatoria = new StringBuilder(longitud);

        // Generar caracteres aleatorios
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            cadenaAleatoria.append(caracterAleatorio);
        }

        return cadenaAleatoria.toString();
    }

}
