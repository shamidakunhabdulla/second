package objectre2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {
WebDriver driver;
public Login2(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//*[@id=\"origin\"]/span/input\r\n")
WebElement from;
@FindBy(xpath="//*[@id=\"destination\"]/span/input")
WebElement to;
@FindBy(xpath="//label[@for='availableBerth']")

WebElement seatss;
@FindBy (xpath="//button[@type='submit']")
WebElement search;
@FindBy (xpath="//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[4]/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]/table/tr/td[2]/div/div[2]/strong")
WebElement sleeper;


public WebElement from1() {
	return from;
}
public WebElement to1() {
	return to;
}
public WebElement seats1() {
	return seatss;
}
public WebElement search1() {
	return search;
}
public WebElement sleeper1() {
	return sleeper;
}
}

