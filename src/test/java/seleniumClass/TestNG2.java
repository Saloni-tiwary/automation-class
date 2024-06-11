package seleniumClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {
	@Test(priority=-10)
	public void test1() {
	System.out.println("Hey There ");	//1
	}
	
	@Test(priority=1)
	public void test2() {
		System.out.println("Hey There 2");	//4
		}
	
	@Test(priority=100)
	public void a() {
		System.out.println("Hey There a");	//5
		}
	
	@Test(priority=0)
	public void b() {
			System.out.println("Hey There b");	//2
			}
	//Incase the priority is not set the priority by default is set to 0
	@Test
	public void b1() {
		System.out.println("Hey There b1");	//3
		}

}
