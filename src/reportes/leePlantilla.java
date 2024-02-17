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

public class leePlantilla {

    LocalDateTime fechaHoraActual = LocalDateTime.now();
    String formatoFechaHora = "dd-MM-yyyy";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatoFechaHora);
    String fechaHoraActualComoString = fechaHoraActual.format(formatter);
    String cadenaAleatoria = generarCadenaAleatoria(4);
    String path = "documentos-generados/perforacion/";
    private static leePlantilla instancia = new leePlantilla();
    private ArrayList<String> infoPerforacion = new ArrayList<>();
    ArrayList<String> dataTable = new ArrayList<>();
    ArrayList<String> imagePaths = new ArrayList<>();
    ArrayList<String> descs = new ArrayList<>();

    private leePlantilla() {
    }

    public static leePlantilla obtenerInstancia() {
        return instancia;
    }

    public void capturarDatosPerforacion(String datos[]) {
        Collections.addAll(infoPerforacion, datos);
    }

    public void llenadoTabla(ArrayList<String> data, ArrayList<String> images, ArrayList<String> desc) {
        if (dataTable != null && imagePaths != null && descs != null) {
            dataTable.addAll(data);
            imagePaths.addAll(images);
            descs.addAll(desc);

            leeDoc(infoPerforacion);
        } else {
            System.out.println("Alguno de los parámetros es null");
        }

    }

    public void leeDoc(ArrayList<String> infoDoc) {

        switch (infoDoc.get(0)) {
            case "perforacion":
                try {
                    FileInputStream fis = new FileInputStream("src/plantillas/perforacion.docx");
                    XWPFDocument document = new XWPFDocument(fis);

                    replaceText(document, "titulo", infoDoc.get(1));
                    replaceText(document, "companiaContra", infoDoc.get(2));
                    replaceText(document, "companiaSeriv", infoDoc.get(3));
                    replaceText(document, "Equiporieg", infoDoc.get(4));
                    replaceText(document, "nombreUno", infoDoc.get(5));
                    replaceText(document, "celularUno", infoDoc.get(6));
                    replaceText(document, "correoUno", infoDoc.get(7));
                    replaceText(document, "nombreDos", infoDoc.get(8));
                    replaceText(document, "celularDos", infoDoc.get(9));
                    replaceText(document, "correoDos", infoDoc.get(10));
                    replaceText(document, "nombreTres", infoDoc.get(11));
                    replaceText(document, "celularTres", infoDoc.get(12));
                    replaceText(document, "correoTres", infoDoc.get(13));
                    replaceText(document, "idpozo", infoDoc.get(14));
                    replaceText(document, "idmuni", infoDoc.get(15));
                    replaceText(document, "iddepa", infoDoc.get(16));
                    replaceText(document, "ubiPozo", infoDoc.get(17));
                    replaceText(document, "activdadEqui", infoDoc.get(18));
                    replaceText(document, "fechaIni", infoDoc.get(19));
                    replaceText(document, "fehaFin", infoDoc.get(20));
                    replaceText(document, "compaIns", infoDoc.get(21));
                    replaceText(document, "nameSuper", infoDoc.get(22));
                    replaceText(document, "celSuper", infoDoc.get(23));
                    replaceText(document, "nameAsis", infoDoc.get(24));
                    replaceText(document, "celAsis", infoDoc.get(25));
                    replaceText(document, "nameInspect", infoDoc.get(26));
                    replaceText(document, "celInspect", infoDoc.get(27));
                    replaceText(document, "Perf1", infoDoc.get(28));
                    replaceText(document, "Wk1", infoDoc.get(29));
                    replaceText(document, "Perf2", infoDoc.get(30));
                    replaceText(document, "Wk2", infoDoc.get(31));
                    replaceText(document, "Perf3", infoDoc.get(32));
                    replaceText(document, "Wk3", infoDoc.get(33));
                    replaceText(document, "Perf4", infoDoc.get(34));
                    replaceText(document, "Wk4", infoDoc.get(35));

                    replaceText(document, "VSEH1", infoDoc.get(36));
                    replaceText(document, "IVSEH2", infoDoc.get(37));
                    replaceText(document, "IVSEH3", infoDoc.get(38));
                    replaceText(document, "IVSEH4", infoDoc.get(39));

                    replaceText(document, "ICFR1", infoDoc.get(40));
                    replaceText(document, "ICFR2", infoDoc.get(41));
                    replaceText(document, "ICFR3", infoDoc.get(42));
                    replaceText(document, "ICFR4", infoDoc.get(43));

                    replaceText(document, "ERIAI1", infoDoc.get(44));
                    replaceText(document, "ERIAI2", infoDoc.get(45));
                    replaceText(document, "ERIAI3", infoDoc.get(46));
                    replaceText(document, "ERIAI4", infoDoc.get(47));

                    replaceText(document, "descImgUno", infoDoc.get(52));
                    replaceText(document, "descImgDos", infoDoc.get(53));
                    replaceText(document, "descImgTres", infoDoc.get(54));
                    replaceText(document, "descImgCuatro", infoDoc.get(55));
                   // replaceText(document, "IdProposito", infoDoc.get(56));

                    addTable(document, dataTable, imagePaths, descs);

                    String nameFile = path + "perforaccion-" + fechaHoraActualComoString + "-" + cadenaAleatoria + ".docx";
                    FileOutputStream fos = new FileOutputStream(nameFile);
                    document.write(fos);

                    fis.close();
                    fos.close();

                    insertImageWithApachePOI(nameFile, infoDoc.get(48), "idImgUno");
                    insertImageWithApachePOI(nameFile, infoDoc.get(49), "imgDos");
                    insertImageWithApachePOI(nameFile, infoDoc.get(50), "imgTres");
                    insertImageWithApachePOI(nameFile, infoDoc.get(51), "imgCuatro");

                    JOptionPane.showMessageDialog(null, "reporte crrado de forma correcta"+nameFile);
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
                System.out.println("Invalid day");
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
