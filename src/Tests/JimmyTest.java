package Tests;

import org.testng.annotations.Test;

public class JimmyTest {

	
	@Test
	public void Trial(){
		System.out.println("Again another test.");
	}
	
	@Test(priority = 2)
	public void Trial2(){
		
		System.out.println("I am me.");
	}
}
