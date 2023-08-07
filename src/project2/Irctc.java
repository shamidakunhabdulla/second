package project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectre2.*;

public class Irctc {
@Test
public void login() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamida A\\Desktop\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	Login2 l=new Login2(driver);
	l.from1().sendKeys("ALUVA - AWY");

	l.to1().sendKeys("KOLLAM JN - QLN ");
	l.seats1().click();
	l.search1().click();
	l.sleeper1().click();
	//l.sleeper1().click();
	
}
}
