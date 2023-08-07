package project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.*;

public class Login {
	@Test
public void login()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamida A\\Desktop\\chromedriver.exe");

	

	WebDriver driver = new ChromeDriver();

	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	ReddiffLoginPF r=new ReddiffLoginPF(driver);
	r.emailID().sendKeys("FghfQgmail.com");
	r.pasword().sendKeys("qwwr");
	r.signin().click();
	r.forgotPassword ().click();
	Forgotpassword f=new Forgotpassword(driver);
	f.email().sendKeys("sdawf");
	f.nextButton().click();
	

}
	
}