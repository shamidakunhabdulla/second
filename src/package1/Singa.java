package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Singa {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamida A\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
	
	driver.findElement(By.id("flightOrigin1")).click();
	WebElement w=driver.findElement(By.id("flightOrigin1"));
	w.sendKeys("new york");
	Thread.sleep(1000);
	w.sendKeys(Keys.ARROW_DOWN);
	w.sendKeys(Keys.ENTER);
	w.clear();
	
	driver.findElement(By.id("bookFlightDestination")).click();
	WebElement w1=driver.findElement(By.id("bookFlightDestination"));
	w1.sendKeys("bangkok");
	w1.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	w1.sendKeys(Keys.ENTER);

	

}
}
