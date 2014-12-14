package Tests;

import org.testng.annotations.Test;

import UtilClass.Data_Provider;

public class providerTest {
	@Test(priority = 1 ,dataProviderClass = Data_Provider.class,dataProvider = "P1")
	public void Tests(String name , String me , String her){
		
		System.out.println("Test1");
	}
    
	@Test(priority = 2 , dataProviderClass = Data_Provider.class, dataProvider = "P2")
	public void Tests2(String any , String ant , String men){
		
		System.out.println("Test2");
	}
	@Test(priority = 3, dataProviderClass = Data_Provider.class, dataProvider = "P3")
	public void A(String Ace , String ABE){
		
		System.out.println("I am A");
	}
	
	@Test(priority  = 4, dataProviderClass = Data_Provider.class, dataProvider = "P3")
		public void B(String CDE , String BFE){
		System.out.println("I am B.");
	}
	
}
