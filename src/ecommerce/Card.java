package ecommerce;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Card {
	@Test
public void cod() {
	System.out.println("cash on delivery");
}
	@Test
	public void creditcard() {
		System.out.println("credit card");
	}
	@Test
	public void debitcard() {
		System.out.println("debit card");
	}
	@Parameters({"url"})
	@Test
	public void giftcard() {//String uname
		System.out.println("gift card");
		//System.out.println(uname);
	}
}
