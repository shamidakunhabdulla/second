package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssProg {
public static void main(String[] args) {
	System.getProperty("webdriver.chrome.driver","C:\\Users\\Shamida A\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http:\\facebook.com");
	driver.findElement(By.cssSelector("#email")).sendKeys("shaiad@gmail.com");
	driver.findElement(By.cssSelector("#pass")).sendKeys("qwer");
	driver.findElement(By.xpath("//button[@name='login']")).click();

}
}
