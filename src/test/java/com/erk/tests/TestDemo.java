package com.erk.tests;

import org.testng.annotations.Test;

import com.erk.pages.Page;
import com.erk.testbase.TestBase;

public class TestDemo extends TestBase{
	
	
	@Test
	public void test() {
		extentLogger = report.createTest("My New Test");
		extentLogger.info("entering user credentials");
		Page page = new Page();
		page.username.sendKeys("sdvxbdfszcvf");
		
		
		
	}
	
	
	
	

}
