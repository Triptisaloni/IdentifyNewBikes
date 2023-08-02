
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cognizant.INB.BaseClass;

import utilities.CaptureScreenshot;
import utilities.excelreadwrite;
import utilities.xpath_sub;

public class loginGoogle extends BaseClass {

	public static WebElement login;
	public static WebElement googleClick;
	public static WebElement emailField;
	public static WebElement nextButton;

	public static void home(WebDriver driver) {
		WebElement home = driver.findElement(By.xpath(xpath_sub.p.getProperty("home_XPath"))); // Calling home function
		home.click();
	}

	public static void loginClick(WebDriver driver) {

		login = driver.findElement(By.xpath(xpath_sub.p.getProperty("login_XPath"))); // Clicking login Option
		login.click();

	}

	public static void googleClick(WebDriver driver) {
		googleClick = driver.findElement(By.xpath(xpath_sub.p.getProperty("GoogleClick_XPath"))); // Choosing Google as
																									// Login Option
		googleClick.click();
	}

	public static void windowHandle(WebDriver driver) {
		widHandle(); // Initiating Window Handle Function
	}

	public static void enterEmail(WebDriver driver) {
		emailField = driver.findElement(By.xpath(xpath_sub.p.getProperty("emailField_XPath")));
		emailField.sendKeys(excelreadwrite.incorrect_email);
	}

	public static void nextButton(WebDriver driver) {
		nextButton = driver.findElement(By.xpath(xpath_sub.p.getProperty("nextField_XPath"))); // Fetching incorrect
																								// email data from excel
																								// to email Field
		nextButton.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath_sub.p.getProperty("error_XPath"))));
		CaptureScreenshot.takeScreenShot();
	}
}
