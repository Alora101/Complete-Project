package Tests;

import org.testng.annotations.Test;

import UtilClass.Xls_Reader;

public class dataRead {
	
	@Test
	public void datatest(){
		
	
	Xls_Reader r = new Xls_Reader(System.getProperty("user.dir")+"\\src\\Files\\Testdata.xlsx");
	System.out.println(r.getRowCount("Login"));
	System.out.println(r.getColumnCount("Login"));
	System.out.println(r.getCellData("Login", 1 , 2));
	System.out.println(r.getCellData("Login", "First Name", 5));
	System.out.println(r.setCellData("Login", "First Name"
, 9, "ThankGod"));
	
	}
}
