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

public class leePlantilla {

    LocalDateTime fechaHoraActual = LocalDateTime.now();
    String formatoFechaHora = "dd-MM-yyyy";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatoFechaHora);
    String fechaHoraActualComoString = fechaHoraActual.format(formatter);
    String cadenaAleatoria = generarCadenaAleatoria(4);
    String path = "documentos-generados/perforacion/";

    public void leeDoc(String[] infoDoc) {

        switch (infoDoc[0]) {
            case "perforacion":
        try {

                FileInputStream fis = new FileInputStream("src/plantillas/perforacion.docx");
                XWPFDocument document = new XWPFDocument(fis);

                replaceText(document, "titulo", infoDoc[1]);
                replaceText(document, "companiaContra", infoDoc[2]);
                replaceText(document, "companiaSeriv", infoDoc[3]);
                replaceText(document, "Equiporieg", infoDoc[4]);
                replaceText(document, "nombreUno", infoDoc[5]);
                replaceText(document, "celularUno", infoDoc[6]);
                replaceText(document, "correoUno", infoDoc[7]);
                replaceText(document, "nombreDos", infoDoc[8]);
                replaceText(document, "celularDos", infoDoc[9]);
                replaceText(document, "correoDos", infoDoc[10]);
                replaceText(document, "nombreTres", infoDoc[11]);
                replaceText(document, "celularTres", infoDoc[12]);
                replaceText(document, "correoTres", infoDoc[13]);
                replaceText(document, "idpozo", infoDoc[14]);
                replaceText(document, "idmuni", infoDoc[15]);
                replaceText(document, "iddepa", infoDoc[16]);

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
