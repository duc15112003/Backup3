package pri;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class functionlineCodePDF {
	
	public static void build() {
		Document doc = new Document();
		try {
			doc.open();
			PdfWriter.getInstance(doc, new FileOutputStream("C:\\.pdf"));
			doc.add(new Paragraph("hello"));
			doc.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		build();
	}

}
