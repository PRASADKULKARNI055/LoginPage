package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static String readData(String value) throws IOException {
		
		Properties properties=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Prime\\eclipse-workspace\\MavenProject\\src\\main\\java\\config\\config.properties");
        properties.load(file);
        return properties.getProperty(value);
	}
	
	public static String getExcelData(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Prime\\eclipse-workspace\\MavenProject\\Excel\\Book1.xlsx");
		Sheet s = WorkbookFactory.create(file).getSheet("Sheet1");
		return s.getRow(row).getCell(col).getStringCellValue();
		
	}
	
	
}
