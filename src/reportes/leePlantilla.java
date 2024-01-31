package reportes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class leePlantilla {

    public void leeDoc() {
        try {
            FileInputStream fis = new FileInputStream("PLANTILLA.docx");
            XWPFDocument document = new XWPFDocument(fis);

            replaceText(document, "{reemplazar}", "TextoNuevo");

            FileOutputStream fos = new FileOutputStream("documento_modificado.docx");
            document.write(fos);

            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
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
