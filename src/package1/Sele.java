package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamida A\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
	JavascriptExecutor j = (JavascriptExecutor) driver;
	
	WebElement w =  driver.findElement(By.linkText("See an example alert"));
	Thread.sleep(1000);
	j.executeScript("arguments[0].click()", w);
//	w.click();
	//driver.findElement(By.xpath("//a[@text()='See an example alert']")).click();
	
	Alert a=driver.switchTo().alert();
	Thread.sleep(2000);
	System.out.println(a.getText());
	a.accept();
}
}
