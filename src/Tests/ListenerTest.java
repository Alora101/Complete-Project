package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import UtilClass.ErrorUtil;

public class ListenerTest {	
	@Test(priority = 2)
	public void TestA(){
		
		System.out.println("Test Listener1.");
	}	
	@Test(priority = 1)
	public void TestB(){
		try{
		Assert.assertEquals("A", "B");
		}catch(Throwable t){
			System.out.println("Error");
		 ErrorUtil.addVerificationFailure(t);
		}
	}
}
