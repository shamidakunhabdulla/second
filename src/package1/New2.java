package package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class New2 {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver","C:\\Users\\Shamida A\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tdg.thread.com.ph/");
		driver.findElement(By.name("wtUserNameInput")).sendKeys("shgdags");
		driver.findElement(By.name("wtPasswordInput")).sendKeys("1213");
		driver.findElement(By.name("wt15")).click();
	}
}
