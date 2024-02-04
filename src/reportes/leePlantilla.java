package reportes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class leePlantilla {

    public void leeDoc(String nombrePlantilla, String titulo, String companiaContra, String CompaniaServi, String EquipoRieg,
     String nombreUno,String celularUno,String correoUno,String nombreDos,String celularDos,String correoDos,String nombreTres,String celularTres,String correoTres
    ) {

        switch (nombrePlantilla) {
            case "perforacion":
        try {

                FileInputStream fis = new FileInputStream("src/plantillas/perforacion.docx");
                XWPFDocument document = new XWPFDocument(fis);

                replaceText(document, "titulo", titulo);
                replaceText(document, "companiaSeriv", CompaniaServi);
                replaceText(document, "equiporieg", EquipoRieg);
                replaceText(document, "companiaContra", companiaContra);
                
                
                  replaceText(document, "companiaSeriv2", CompaniaServi);
                replaceText(document, "equiporieg2", EquipoRieg);
                replaceText(document, "companiaContra2", companiaContra);
                
                replaceText(document, "nombreUno", nombreUno);
                replaceText(document, "celularUno", celularUno);
                replaceText(document, "correoUno", correoUno);
                
                replaceText(document, "nombreDos", nombreDos);
                replaceText(document, "celularDos",celularDos);
                replaceText(document, "correoDos", correoDos);
                
                replaceText(document, "nombreTres", nombreTres);
                replaceText(document, "celularTres", celularTres);
                replaceText(document, "correoTres", correoTres);
             
                
                

                FileOutputStream fos = new FileOutputStream("documento_modificado.docx");
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
        Iterator<XWPFParagraph> iter = document.getParagraphsIterator();
        while (iter.hasNext()) {
            XWPFParagraph paragraph = iter.next();

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
