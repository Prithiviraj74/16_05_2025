package org.mytest.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sampletest {
	
	@BeforeClass
	public void bc() {
		System.out.println("@Beforeclass");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("@Beforemethod");
	}
	@Test
	public void tc() {
		System.out.println("@test");
	}
	
	
	}

}
