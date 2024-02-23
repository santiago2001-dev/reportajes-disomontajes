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

    public void capturarDatosPerforacion(String datos[]) {
        // Collections.addAll(infoPerforacion, datos);
    }

    public void llenadoTabla(ArrayList<String> data, ArrayList<String> images, ArrayList<String> desc) {
        if (dataTable != null && imagePaths != null && descs != null) {
            dataTable.addAll(data);
            imagePaths.addAll(images);
            descs.addAll(desc);

            leeDoc();
        } else {
            System.out.println("Alguno de los parámetros es null");
        }

    }

    public void leeDoc() {
        Preferences plantillas = Preferences.userNodeForPackage(plantillas.class);

        String Plantilla = plantillas.get("plantilla", " ");
        
        switch (Plantilla) {
            case "perforacion":
                try {
                    FileInputStream fis = new FileInputStream("src/plantillas/perforacion.docx");
                    XWPFDocument document = new XWPFDocument(fis);
                    //instanciar todas las clases
                    Preferences vistaUno = Preferences.userNodeForPackage(formularioPerforacion.class);
                    Preferences vistaDos = Preferences.userNodeForPackage(infoPerforacion.class);

                    replaceText(document, "titulo", vistaUno.get("titulo", " "));
                    replaceText(document, "companiaContra", vistaUno.get("compniaCont", " "));
                    replaceText(document, "companiaSeriv", vistaUno.get("CompaniaServ", " "));
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

                    
      
                    //reemplazar ´por variables
                    //replaceText(document, "Perf1", infoDoc.get(28));
                    //replaceText(document, "Wk1", infoDoc.get(29));
                    //replaceText(document, "Perf2", infoDoc.get(30));
                    // replaceText(document, "Wk2", infoDoc.get(31));
                    // replaceText(document, "Perf3", infoDoc.get(32));
                    // replaceText(document, "Wk3", infoDoc.get(33));
                    //replaceText(document, "Perf4", infoDoc.get(34));
                    //replaceText(document, "Wk4", infoDoc.get(35));
                    //replaceText(document, "VSEH1", infoDoc.get(36));
                    //replaceText(document, "IVSEH2", infoDoc.get(37));
                    //replaceText(document, "IVSEH3", infoDoc.get(38));
                    //replaceText(document, "IVSEH4", infoDoc.get(39));
                    // replaceText(document, "ICFR1", infoDoc.get(40));
                    //replaceText(document, "ICFR2", infoDoc.get(41));
                    //replaceText(document, "ICFR3", infoDoc.get(42));
                    //replaceText(document, "ICFR4", infoDoc.get(43));
                    // replaceText(document, "ERIAI1", infoDoc.get(44));
                    //replaceText(document, "ERIAI2", infoDoc.get(45));
                    //replaceText(document, "ERIAI3", infoDoc.get(46));
                    //replaceText(document, "ERIAI4", infoDoc.get(47));
                    // replaceText(document, "descImgUno", infoDoc.get(52));
                    //replaceText(document, "descImgDos", infoDoc.get(53));
                    //replaceText(document, "descImgTres", infoDoc.get(54));
                    //replaceText(document, "descImgCuatro", infoDoc.get(55));
                    // replaceText(document, "IdProposito", infoDoc.get(56));
                    //addTable(document, dataTable, imagePaths, descs);
                    String nameFile = path + "perforaccion-" + fechaHoraActualComoString + "-" + cadenaAleatoria + ".docx";
                    FileOutputStream fos = new FileOutputStream(nameFile);
                    document.write(fos);

                    fis.close();
                    fos.close();

                    // insertImageWithApachePOI(nameFile, infoDoc.get(48), "idImgUno");
                    //insertImageWithApachePOI(nameFile, infoDoc.get(49), "imgDos");
                    //insertImageWithApachePOI(nameFile, infoDoc.get(50), "imgTres");
                    //insertImageWithApachePOI(nameFile, infoDoc.get(51), "imgCuatro");
                    try {
                        vistaUno.clear();
                        vistaDos.clear();

                        System.out.println("Todas las preferencias han sido eliminadas.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    JOptionPane.showMessageDialog(null, "reporte creado de forma correcta" + " " + nameFile);
                    home h = new home();
                    h.setVisible(true);

                } catch (IOException e) {
                    e.printStackTrace();
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
                    JOptionPane.showMessageDialog(null, "no se encontro plantilla" );
        }

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
