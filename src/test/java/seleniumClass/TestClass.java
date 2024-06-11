package seleniumClass;

import org.testng.annotations.*;

public class TestClass {
    
	@Test
	public void test1() {
	System.out.println("Hey There");	
	}
	@Test
	public void test2() {
		System.out.println("Hey There 2");	
		}
	@Test
	public void a() {
		System.out.println("Hey There a");	
		}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hey There BeforeMethod");	
		}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Hey There AfterMethod");	
		}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Hey There Before Test");	
		}
	@AfterTest
	public void afterTest() {
		System.out.println("Hey There After Test");	
		}
	@BeforeClass
	public void beforClass() {
		System.out.println("Hey There Before Class");	
		}
	@AfterClass
	public void afterClass() {
		System.out.println("Hey There After Class");	
		}
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("Hey There BeforeSuite");	
//		}
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("Hey There afterSuite");	
//		}
	
	
	
}
