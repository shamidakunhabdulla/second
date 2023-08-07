package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgotpassword {
public Forgotpassword(WebDriver driver) {
		super();
		this.driver = driver;
	}

WebDriver driver;
 By emailid=By.id("txtlogin");
 By nextbutton=By.xpath("//input[@name='next']");
 public WebElement email() {
	 return driver.findElement(emailid);
 }
 public WebElement nextButton() {
	 return driver.findElement(nextbutton);
 }
 
}
