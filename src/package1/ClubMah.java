package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClubMah {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shamida A\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://membership.clubmahindra.com/sem-in/LP/cmh25/?utm_source=Google&utm_medium=cpc&utm_campaign=IP_CMH_Search_PanIND_Brand_Exact_April23");
Select s=new Select(driver.findElement(By.name("uage")));
s.selectByIndex(3);
Thread.sleep(2000);
s.selectByValue("36-49");
Thread.sleep(2000);
s.selectByVisibleText("<24");


}
}
