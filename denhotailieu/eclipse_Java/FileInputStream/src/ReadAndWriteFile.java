import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ReadAndWriteFile {
	
	 private final static String FILE_URL = "C:\\Users\\ADMIN\\Desktop\\write.txt";

	    public static void main(String[] args) throws IOException {
	      
	        File file = new File(FILE_URL);
	        FileOutputStream out = new FileOutputStream(file);
	        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out);

	        outputStreamWriter.write("\t\t\t\t\t\t\t\t\t");
	        outputStreamWriter.write("Hóa Đơn Bán Hàng");
	        outputStreamWriter.write("\n\n\n\n");
	        outputStreamWriter.write("\t\t\t\t\t\t\t\t\t");
	        outputStreamWriter.write("Shoes Manager Shop");
	        outputStreamWriter.write("\n\n");
	        outputStreamWriter.write("\t\t\t");
	        outputStreamWriter.write("Ngày:");
	        outputStreamWriter.write("\n");
	        outputStreamWriter.write("\t\t\t");
	        outputStreamWriter.write("Mã Nhân Viên:");
	        outputStreamWriter.write("\n");
	        outputStreamWriter.write("\t\t\t");
	        outputStreamWriter.write("Mã Khách Hàng:");
	        outputStreamWriter.write("\n\n\n\n");
	        outputStreamWriter.write("\t\t\t\t");
	        outputStreamWriter.write("STT");
	        outputStreamWriter.write("\t\t\t");
	        outputStreamWriter.write("Tên Sản Phẩm");
	        outputStreamWriter.write("\t\t\t");
	        outputStreamWriter.write("Số Lượng");
	        outputStreamWriter.write("\t\t\t");
	        outputStreamWriter.write("Thành Tiền");
	        outputStreamWriter.write("\n");
	        
	        outputStreamWriter.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
	        outputStreamWriter.write("Tổng Tiền:");
	        
	        
	        // Đây là phương thức quan trọng!
	        // Nó sẽ bắt chương trình chờ ghi dữ liệu xong thì mới kết thúc chương trình.
	        outputStreamWriter.flush();
	    }
}
