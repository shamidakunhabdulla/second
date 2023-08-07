package objectre2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Booking {
WebDriver driver;
public Booking(WebDriver driver) {
	this.driver=driver;
}
By sleeper=By.xpath("//*[@id=\"divMain\"]/div/app-train-list/div[4]/div/div[5]/div[4]/div[1]/app-train-avl-enq/div[1]/div[7]/div[1]/div[3]/table/tr/td[2]/div/div[2]/strong");

public WebElement sleeper1() {
	return driver.findElement(sleeper);
}
}
