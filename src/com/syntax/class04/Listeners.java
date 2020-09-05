package com.syntax.class04;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	// invoked when we start every @Test method
	public void onTestStart(ITestResult result) {
		System.out.println("Test Start " + result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed " + result.getName());
		System.out.println("Here will be adding code that takes screenshot for any passed test cases............");
	}
	
	public void onTestFailed(ITestResult result) {
		System.out.println("Test Failed " + result.getName());
		System.out.println("Here will be adding code that takes screenshot for any failed test cases............");
	}
	
	// invoked when we start <test> based on xml file
	public void onStart(ITestContext context) {
		System.out.println("Starting test inside xml " + context.getName());
	}
	
	public void onFinidh(ITestContext context) {
		System.out.println("Ending test inside xml " + context.getName());
	}
	
	
	
}
