package Tests;

import org.testng.annotations.Test;

public final class loginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
System.out.println("Hello World");
			
		}
	
	@Test(priority = 1)
	public void Login(){
		
		System.out.println("I have logged in.");
	}
	
	@Test(priority = 2)
	public void Logout(){
		System.out.println("I have logged out.");
	}
		
}


