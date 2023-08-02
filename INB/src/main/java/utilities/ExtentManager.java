package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentManager {
	public static final ExtentReports extentReports = new ExtentReports();
	
    public synchronized static ExtentReports createExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./Reports/extent-report.html");
        reporter.config().setReportName("Zigwheels Extent Report");
        reporter.config().enableOfflineMode(false);
        reporter.config().setTheme(Theme.DARK);
        extentReports.attachReporter(reporter);
        return extentReports;
    }
}
