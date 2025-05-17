package org.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeClass
	private void bc() {
		System.out.println("@Beforeclass");
	}
	
	@BeforeMethod
	private void bm() {
		System.out.println("@Beforemethod");
	}
	@Test
	private void tc() {
		System.out.println("@test");
	}
	
	@AfterMethod
	private void af() {
		System.out.println("@Aftermethod");
	}
	@AfterClass
	private void ac() {
		System.out.println("@Afterclass");
	}

}
