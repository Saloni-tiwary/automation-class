package testNGGroups;

import org.testng.annotations.Test;
public class TestNGGroup2 {
	public void test6() {
		System.out.println("Test6");	//1
		}
		
		@Test(groups= {"smoke","sanity"})
		public void test7() {
			System.out.println("Test7");	//4
			}
		
		@Test(groups= {"smoke"})
		public void test8() {
			System.out.println("Test8");	//5
			}
		
		@Test(groups= {"functional"})
		public void test9() {
				System.out.println("Test9");	//2
				}
		//Incase the priority is not set the priority by default is set to 0
		@Test
		public void test10() {
			System.out.println("Test10");	//3
			}
}
