package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cognizant.INB.BaseClass;


import utilities.CaptureScreenshot;
import utilities.xpath_sub;

public class usedCar extends BaseClass {

	public static void useCar_backhome(WebDriver driver) {
		WebElement home = driver.findElement(By.xpath(xpath_sub.p.getProperty("home_XPath"))); // Calling home function
		home.click();
	}

	public static void useCar_usedCar(WebDriver driver) {
		WebElement useCar = driver.findElement(By.xpath(xpath_sub.p.getProperty("useCar_XPath"))); // Clicking Used Car
																									// drop down
		Actions action = new Actions(driver);
		action.moveToElement(useCar).perform();
	}

	public static void useCar_chooseCity(WebDriver driver) {
		CaptureScreenshot.takeScreenShot();
		WebElement chennai = driver.findElement(By.xpath(xpath_sub.p.getProperty("chennai_XPath"))); // Choosing
																										// required City
		chennai.click();
	}

	public static void useCar_pageScroll() {
		scroll(900); // Initiating Scroll function
	}

	public static void getPopularModels(WebDriver driver) {
		ArrayList<String> models = new ArrayList<String>(); // Fetching popular models of Used Cars

		try {

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			CaptureScreenshot.takeScreenShot();
			List<WebElement> popularModels = driver
					.findElements(By.xpath(xpath_sub.p.getProperty("popularModels_XPath")));

			
			for (WebElement model : popularModels) {
				models.add(model.getText());
			}

			System.out.println();
			System.out.println("<===================== Used Cars ========================>");
			System.out.println();

			for (int i = 0; i < models.size(); i++) {
				System.out.println((i + 1) + " : " + models.get(i));
			}

			System.out.println();
			System.out.println("<========================================================>");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
