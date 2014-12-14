package Tests;

import org.testng.annotations.Test;

public class Testers {

	
	@Test
	public void Xmen(){
		
		System.out.println("X men.");
	}
	
	@Test(priority = 2)
	public void Me()
	{
		
		System.out.println("J cloth.");
	}
}
