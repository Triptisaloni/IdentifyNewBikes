package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class xpath_sub {
	public static FileReader reader;
	public static Properties p = new Properties();

	public static void readXpath() throws FileNotFoundException {
		reader = new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\xpaths.properties");
		try {
			p.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
