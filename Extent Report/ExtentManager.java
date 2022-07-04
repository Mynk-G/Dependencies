package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	public static ExtentReports extent;
	
	public static ExtentReports createInstance(String fileName) {
		ExtentSparkReporter spark = new ExtentSparkReporter(fileName);
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle(fileName);
		spark.config().setEncoding("utf-8");
		spark.config().setDocumentTitle(fileName);
		
		extent = new ExtentReports();
		
		extent.attachReporter(spark);
		extent.setSystemInfo("Automation Tester", "Mayank Gondaliya");
		extent.setSystemInfo("Email id", "mgondaliya@sparkcognition.com");
		
		return extent;
	}

}
