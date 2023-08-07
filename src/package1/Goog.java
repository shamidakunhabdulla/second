package package1;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goog {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamida A\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/kidaccountinfo?flowName=GlifWebSignIn&flowEntry=ServiceLogin");

driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[1]/a")).click();
System.out.println(driver.getTitle());
Set<String> id=driver.getWindowHandles();
java.util.Iterator<String> i=id.iterator();
String parentid=i.next();
String childid=i.next();
driver.switchTo().window(childid);
System.out.println(driver.getTitle());
driver.switchTo().window(parentid);
System.out.println(driver.getTitle());



}
}