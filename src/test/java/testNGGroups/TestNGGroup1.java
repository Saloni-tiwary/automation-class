package testNGGroups;

import org.testng.annotations.Test;

public class TestNGGroup1 {
	@Test(groups= {"smoke","sanity"})
	public void test1() {
	System.out.println("Test1");	//1
	}
	
	@Test(groups= {"smoke","regression"})
	public void test2() {
		System.out.println("Test2");	//4
		}
	
	@Test(groups= {"smoke","sanity","functional"})
	public void test3() {
		System.out.println("Test3");	//5
		}
	
	@Test(groups= {"sanity"})
	public void test4() {
			System.out.println("Test4");	//2
			}
	//Incase the priority is not set the priority by default is set to 0
	@Test
	public void test5() {
		System.out.println("Test5");	//3
		}
	
}
