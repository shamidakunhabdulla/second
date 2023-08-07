package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddiffLogin {
WebDriver driver;
public ReddiffLogin(WebDriver driver) {
	this.driver=driver;
}
By username=By.xpath("//input[@id='login1']");
By password=By.name("passwd");
By signin=By.xpath("proceed");
By fp=By.linkText("Forgot Password?");
public WebElement emailID() {
	return driver.findElement(username);
}
public WebElement password() {
	return driver.findElement(password);
}
public WebElement signin() {
	return driver.findElement(signin);
}
public WebElement forgotPassword() {
	return driver.findElement(fp);
}

}
