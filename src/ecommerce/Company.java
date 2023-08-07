package ecommerce;

import org.testng.annotations.Test;

public class Company {
	@Test
public void mobileSamsung() {
	System.out.println("s22");
}
	@Test
	public void earbudsIphone() {
		System.out.println("ibuds");
	}
	@Test
	public void mobileOnePlus() {
		System.out.println("11t");
	}
	@Test
	public void intel() {
		System.out.println("i9");
	}
	@Test(groups= {"smoke"})
	public void amd() {
		System.out.println("ryzen");
	}
	@Test
	public void dell() {
		System.out.println("inspiron");
	}
	
}
