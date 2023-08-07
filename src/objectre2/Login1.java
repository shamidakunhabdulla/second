package objectre2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 {
	WebDriver driver;

public Login1(WebDriver driver) {
this.driver=driver;
}
By from=By.xpath("//div[@aria-label='Select Your Source Station']");
By to=By.xpath("//input[@class='ng-tns-c57-176 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']");
//By category=By.xpath("//div[@class='ng-tns-c65-179 ui-dropdown ui-widget ui-state-default ui-corner-all']");
//By classes=By.xpath("//div[@class='ng-tns-c65-178 ui-dropdown ui-widget ui-state-default ui-corner-all']");
By seatss=By.xpath("//label[@for='availableBerth']");
By search=By.xpath("//button[@type='submit']");
public WebElement from1() {
	return driver.findElement(from);
}
public WebElement to1() {
	return driver.findElement(to);
}
//public WebElement category1() {
//	return driver.findElement(category);
//}
//public WebElement classes1() {
//	return driver.findElement(classes);
//}
public WebElement seats1() {
	return driver.findElement(seatss);
}
public WebElement search1() {
	return driver.findElement(search);
}
}
