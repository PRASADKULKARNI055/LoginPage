package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static String readData(String value) throws IOException {
		
		Properties properties=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Prime\\eclipse-workspace\\MavenProject\\src\\main\\java\\config\\config.properties");
        properties.load(file);
        return properties.getProperty(value);
	}
}
