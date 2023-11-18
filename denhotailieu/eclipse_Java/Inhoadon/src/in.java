import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class in {
	
	public static void main(String[] args)  {
		
				
				// Tạo đối tượng tài liệu
				Document document = new Document(PageSize.A4, 50, 50, 50, 50);

				try {
					
					// Tạo đối tượng PdfWriter
								PdfWriter.getInstance(document, new FileOutputStream("D:\\.pdf"));

								// Mở file để thực hiện ghi
								document.open();
					
					PdfPTable t = new PdfPTable(3);
					t.setSpacingBefore(25);
					t.setSpacingAfter(25);

					PdfPCell c1 = new PdfPCell(new Phrase("Mã SP"));
					t.addCell(c1);
					PdfPCell c2 = new PdfPCell(new Phrase("Tên SP"));
					t.addCell(c2);
					PdfPCell c3 = new PdfPCell(new Phrase("Số Lượng"));
					t.addCell(c3);
					PdfPCell c4 = new PdfPCell(new Phrase("Giá Bán"));
					t.addCell(c3);
					PdfPCell c5 = new PdfPCell(new Phrase("Thành Tiền"));
					t.addCell(c3);

					t.addCell("khách hàng ");
					t.addCell("Phiếu nhập");
					t.addCell("Nhân viên");
					
					document.add(t);
					document.close();
				} catch (FileNotFoundException | DocumentException e) {
					e.printStackTrace();
				}
		
	}

}
