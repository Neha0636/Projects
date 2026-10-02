package com.Listeners;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {
    public static ExtentReports extent;
    public static ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        // Initialize the report file path when the suite starts
        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/TestReport.html");
        spark.config().setDocumentTitle("BlazeDemoReport");
        spark.config().setReportName("BlazeDemo Automation Report");
        spark.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Create a test entry in the report when each test starts
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "test pass: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "test failed: " + result.getThrowable());
    }

    @Override
    public void onFinish(ITestContext context) {
        // Crucial: This writes/saves the file to your project directory
        extent.flush();
    }
}