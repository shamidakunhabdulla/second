package ecommerce;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
@Test(dataProvider = "getData")
public void m1(String uname,String pword) {
	System.out.println("DATA PROVIDER");
	System.out.println(uname+" "+pword);
}
@DataProvider
public Object[][] getData(){
	Object [][]data=new Object[3][2];
	data[0][0]="1stname";
	data[0][1]="1stpword";
	data[1][0]="2ndname";
	data[1][1]="2ndpword";
	data[2][0]="3rdname";
	data[2][1]="2ndpword";
	return data;

	
}
}
