package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	@Test(groups={"Smoke"})
	public void demo() {
		System.out.println("test");
	}
	
	@AfterTest
	public void demo2() {
		System.out.println("test2");
	}
	
	@BeforeTest
	public void prerequisete() {
		System.out.println("I will executed first");
	}
	
	
	
}
