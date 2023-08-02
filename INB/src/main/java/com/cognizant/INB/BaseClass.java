package com.cognizant.INB;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.ExtentTestManager;
import utilities.excelreadwrite;
import utilities.xpath_sub;


public class BaseClass {
	
	public static WebDriver driver;
	public static String url = "https://www.zigwheels.com/";
	public static WebDriverWait wait;
	
	@BeforeSuite(groups = { "Smoke", "Regression" })
	public void driverConfig() throws FileNotFoundException {

		ExtentTestManager.startTest("Driver Setup", "Taking user input and Setting up the driver");

		xpath_sub.readXpath(); // Reading from properties file
		excelreadwrite.readexcel(); // Reading from excel file

		// Providing Choice for browsers
		System.out.println("Enter Your Browser Choice:\n 1. Chrome\n 2. Edge");
		Scanner sc = new Scanner(System.in);
		int browser_choice = Integer.parseInt(sc.nextLine());
		if (browser_choice == 1) {
			driver = new ChromeDriver();
		} else if (browser_choice == 2) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Wrong Input");
			System.exit(0);
		}

		sc.close();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));    // Implicit wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));    // Explicit wait
		driver.get(url);
	}
	
	
	public static void scroll(int n) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0," + n + ")"); // Using JavaScript Executor to scroll
																						
	}

	public static void widHandle() {
		ArrayList<String> window_list = new ArrayList<String>(driver.getWindowHandles()); // Using Window handle to switch windows
		driver.switchTo().window(window_list.get(1));
	}
	

	@AfterSuite(groups = { "Smoke", "Regression" })
	public void quit() {
		driver.quit(); // closing all instances of Web browser
	}
}
