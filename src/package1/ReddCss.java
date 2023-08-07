package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddCss {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamida A\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.cssSelector("#login1")).sendKeys("admin@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
}
}
