package com.syntax.class01_HWCW;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 {
//	Task 1: Executing different test based TestNG annotations
//
//	Create class that will have:
//	Before and After Class annotation
//	Before and After Method annotation
//	2 methods with Test annotation
//
//	Observe the results!
	
	@BeforeMethod
	public void before() {
		System.out.println("Hello");
	}
	
	@Test
	public void exhausted() {
		System.out.println("Tired going into work");
	}
	
	@Test
	public void happy() {
		System.out.println("Happy leaving work");
	}
	
	
	@AfterMethod
	public void after() {
		System.out.println("GoodBye");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("---- Good Morning greeting ----");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("---- Have a Good Afternoon  ----");
	}

}
