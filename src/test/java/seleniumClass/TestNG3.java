package seleniumClass;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG3 {
	@Test(priority=-10,description= "Verify the test case" )
	public void test1() {
	System.out.println("Hey There ");	//1
	}
	//1st way -- remove the Test annotation
	public void test2() {
		System.out.println("Hey There 2");	//4
		}
	//2nd way put enabled attribute false
	@Test(priority=100, enabled = false )
	public void a() {
		System.out.println("Hey There a");	//5
		}
	
	@Test(priority=0,invocationCount=2)
	public void b() {
			System.out.println("Hey There b");	//2
			}
	//Incase the priority is not set the priority by default is set to 0
	@Test
	public void b1() {
		System.out.println("Hey There b1");	//3
		}
	@Test
	public void b2() {
		System.out.println("Hey There b2");	//3
		}
	//never used 3rd way
	@Test
	public void b3() {
		System.out.println("Hey There b3");	//3
		throw new SkipException("Skipped the test");
		}

}
