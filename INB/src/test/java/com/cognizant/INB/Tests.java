package com.cognizant.INB;

import java.io.IOException;

import java.util.ArrayList;

import org.testng.annotations.Test;

import pages.hondaBikes;
import pages.loginGoogle;
import pages.usedCar;
import utilities.ExtentTestManager;

public class Tests extends BaseClass {

	public static ArrayList<String> window_list;

	@Test(priority = 1, groups = { "Smoke", "Regression" })
	public static void elementCall_newBike() {
		ExtentTestManager.startTest("Clicking New Bikes", "Clicking on New Bikes");
		hondaBikes.elementCall_newBike(driver); // Opening New bikes Drop down
	}

	@Test(priority = 2, groups = { "Smoke", "Regression" })
	public static void elementCall_upcomingBikes() {
		ExtentTestManager.startTest("Clicking Upcoming Bikes Option",
				"Clicking on upcoming bikes option in the dropdown");
		hondaBikes.elementCall_upcomingBikes(driver); // Opening Upcoming Bikes option from drop down
	}

	@Test(priority = 3, groups = { "Smoke", "Regression" })
	public static void elementCall_dropDown() {
		ExtentTestManager.startTest("Opening bike brand dropdown", "Opening bike brand dropdown to select Honda");
		hondaBikes.elementCall_dropDown(driver); // Opening bike brand drop down
	}

	@Test(priority = 4, groups = { "Smoke", "Regression" })
	public static void elementCall_hondaClick() {
		ExtentTestManager.startTest("Clicking on Honda Bikes", "Clicking on Honda Bikes Option in the dropdown");
		hondaBikes.elementCall_hondaClick(driver); // Clicking on Honda bike option
	}

	@Test(priority = 5, groups = { "Smoke", "Regression" })
	public static void elementCall_hondaScroll() {
		ExtentTestManager.startTest("Scrolling the page", "Scroll the upcoming bikes page");
		hondaBikes.elementCall_hondaScroll(driver); // Initiating Scroll function
	}

	@Test(priority = 6, groups = { "Smoke", "Regression" })
	public static void elementCall_list() {
		ExtentTestManager.startTest("Printing bike details under 4 Lakh",
				"Printing details of bikes under 4 Lakh in console");
		hondaBikes.underFourLakhBikes(driver); // Fetching Bike features within required range
	}

	@Test(priority = 7, groups = { "Regression" })
	public static void useCar_home() {
		ExtentTestManager.startTest("Click on Logo", "Clicking on Logo to go back to Homepage");
		usedCar.useCar_backhome(driver); // Calling home function
	}

	@Test(priority = 8, groups = { "Regression" })
	public static void useCar_usedCar() {
		ExtentTestManager.startTest("Clicking Used Car Dropdown", "Clicking on used car doprdown");
		usedCar.useCar_usedCar(driver); // Clicking Used Car drop down
	}

	@Test(priority = 9, groups = { "Regression" })
	public static void useCar_ChooseCity() {
		ExtentTestManager.startTest("Choosing required city from the dropdown",
				"Choosing Chennai as the required city from the dropdown");
		usedCar.useCar_chooseCity(driver); // Choosing required City
	}

	@Test(priority = 10, groups = { "Regression" })
	public static void useCar_scroll() {
		ExtentTestManager.startTest("Scrolling the page", "Scrolling the used car page");
		usedCar.useCar_pageScroll(); // Initiating Scroll function
	}

	@Test(priority = 11, groups = { "Regression" })
	public static void useCar_list() {
		ExtentTestManager.startTest("Printing popular brands", "Printing details of popular brands in console");
		usedCar.getPopularModels(driver); // Fetching popular models of Used Cars
	}

	@Test(priority = 12, groups = { "Regression" })
	public static void login_home() {
		ExtentTestManager.startTest("Clicking on logo", "Clicking on logo to open Homepage");
		loginGoogle.home(driver); // Calling home function
	}

	@Test(priority = 13, groups = { "Regression" })
	public static void loginClick() {
		ExtentTestManager.startTest("Clicking Login button", "Clicking Login button on Homepage");
		loginGoogle.loginClick(driver); // Clicking login Option
	}

	@Test(priority = 14, groups = { "Regression" })
	public static void googleClick() {
		ExtentTestManager.startTest("Clicking Google Login option", "Clicking on Google option to test Login");
		loginGoogle.googleClick(driver); // Choosing Google as Login Option
	}

	@Test(priority = 15, groups = { "Regression" })
	public static void windowHandle() {
		ExtentTestManager.startTest("Switching tabs", "Switching tabs using Window handle");
		loginGoogle.windowHandle(driver); // Initiating Window Handle Function
	}

	@Test(priority = 16, groups = { "Regression" })
	public static void emailClick() throws IOException {
		ExtentTestManager.startTest("Enter email", "Enter incorrect email fetched from excel file");
		loginGoogle.enterEmail(driver); // Fetching incorrect email data from excel to email Field
	}

	@Test(priority = 17, groups = { "Regression" })
	public static void nextButton() {
		ExtentTestManager.startTest("Clicking Next Button",
				"Clicking Next Button on Google Login to test incorrect data");
		loginGoogle.nextButton(driver); // Clicking next Button
	}

}