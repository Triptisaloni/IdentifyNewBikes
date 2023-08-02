package utilities;

import java.util.Objects;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.cognizant.INB.BaseClass;

public class TestListener extends BaseClass implements ITestListener {

	public void onStart(ITestContext iTestContext) {
		iTestContext.setAttribute("WebDriver", driver);
	}

	public void onFinish(ITestContext iTestContext) {
		// Do tier down operations for ExtentReports reporting!
		ExtentManager.extentReports.flush();
	}

	public void onTestSuccess(ITestResult iTestResult) {
		// ExtentReports log operation for passed tests.
		ExtentTestManager.getTest().log(Status.PASS, "Test passed");
	}

	public void onTestFailure(ITestResult iTestResult) {
		// Take base64Screenshot screenshot for extent reports
		String base64Screenshot = "data:image/png;base64,"
				+ ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);

		// ExtentReports log and screenshot operations for failed tests.
		ExtentTestManager.getTest().log(Status.FAIL, "Test Failed", ExtentTestManager.getTest()
				.addScreenCaptureFromBase64String(base64Screenshot).getModel().getMedia().get(0));
	}

	public void onTestSkipped(ITestResult iTestResult) {
		// ExtentReports log operation for skipped tests.
		ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
	}

}
