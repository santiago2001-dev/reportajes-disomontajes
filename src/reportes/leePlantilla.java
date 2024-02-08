package reportes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import java.util.ArrayList;
import java.util.Collections;

public class leePlantilla {

    LocalDateTime fechaHoraActual = LocalDateTime.now();
    String formatoFechaHora = "dd-MM-yyyy";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatoFechaHora);
    String fechaHoraActualComoString = fechaHoraActual.format(formatter);
    String cadenaAleatoria = generarCadenaAleatoria(4);
    String path = "documentos-generados/perforacion/";
    private static leePlantilla instancia = new leePlantilla();
    private ArrayList<String> infoPerforacion = new ArrayList<>();

    private leePlantilla() {
    }

    public static leePlantilla obtenerInstancia() {
        return instancia;
    }

    public void capturarDatosPerforacion(String datos[]) {
        Collections.addAll(infoPerforacion, datos);
    }

    public void llamadoDatos() {
        leeDoc(infoPerforacion);
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
                FileOutputStream fos = new FileOutputStream(path + "perforaccion-" + fechaHoraActualComoString + "-" + cadenaAleatoria + ".docx");
                document.write(fos);

                fis.close();
                fos.close();
                System.out.println("docuemento editado con exito");
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
