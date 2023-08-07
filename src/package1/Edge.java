package package1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
public static void main(String[] args) {
	System.setProperty("webdriver.msedge.driver", "C:\\Users\\Shamida A\\Desktop\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.get("https:\\flipkart.com");
}
}
