package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamida A\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.sugarcrm.com/au/request-demo/?utm_source=google.com&utm_medium=organic");
	driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
//	driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
	Select s=new Select(driver.findElement(By.id("how-select")));
	s.selectByIndex(2);
	Thread.sleep(2000);
	s.selectByValue("Internet");
	Thread.sleep(2000);
	s.selectByVisibleText("YouTube");
}
}
