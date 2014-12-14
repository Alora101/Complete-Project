package UtilClass;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


public class Data_Provider {

	@DataProvider(name="P1")
	public static Object[][] getdata(){
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Seni";
		data[0][1] = "Nana";
		data[0][2] = "Toyin";
		
		data[1][0] = "Seni10";
		data[1][1] = "Nana15";
		data[1][2] = "Toyin25";
		
		return data;
	}
	
	
	@DataProvider(name="P2")
	public static Object[][] getdata2(){
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Seni5";
		data[0][1] = "Nana8";
		data[0][2] = "Toyin00";
		
		data[1][0] = "Seni1011";
		data[1][1] = "Nana105";
		data[1][2] = "Toyin205";
		
		return data;
  }
	
	@DataProvider(name = "P3")
	public static Object[][] myData(Method m){
		Object[][] data = null;
		if(m.getName().equals("A")){
			
			data = new Object[2][2];
			data[0][0] = "Nana";
			data[0][1] = "Toyin";
			
			data[1][0] = "Nana1";
			data[1][1] = "Toyin1";
			
			
			
			
		}else if(m.getName().equals("B")){
			data = new Object[2][2];
			data[0][0] = "Debbie00";
			data[0][1] = "Oberiko";
			
			data[1][0] = "Debbie";
			data[1][1] = "Oberiko000";
			
			
		}
		return data;
			
	
		
	}
}
