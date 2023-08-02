package utilities;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import com.cognizant.INB.BaseClass;

public class CaptureScreenshot extends BaseClass {

	// Capture Full Screen Shot //
	public static void takeScreenShot() {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(f, new File(System.getProperty("user.dir") + "\\Screenshots\\screenshot-"
					+ System.currentTimeMillis() + ".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
