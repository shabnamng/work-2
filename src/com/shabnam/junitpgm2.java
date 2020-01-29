/**
 * 
 */
package com.shabnam;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Fidashameer
 *
 */
public class junitpgm2 {
	@BeforeClass
	public static void launch() {
		
	System.out.println("Before Class");
	System.setProperty("WebDriver.ChromeDriver", " C:\\Users\\Fidashameer\\eclipse\\jee-oxygen\\eclipse\\SampleApp\\driver\\chromedriver.exe");	

	}
	@AfterClass
	public static void quit() {
		System.out.println("After Class");

	}
	@Before
	public void date1() {
	System.out.println("Before1");

	}
	@After
	public void date2() {
		System.out.println("After1");
		// TODO Auto-generated method stub

	}
	@Test
	public void test() {
		// TODO Auto-generated method stub
System.out.println("test1");
	}
	@Test
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");

	}
	

}
