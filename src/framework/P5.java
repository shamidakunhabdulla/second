package framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class P5 {
	@org.testng.annotations.Test
public void m1() {
	System.out.println("hello");
}
	@org.testng.annotations.Test
public void m2() {
	System.out.println("hiii");
}
	@BeforeSuite
public void m3() {
	System.out.println("before suit");
}
@AfterSuite
public void m4() {
	System.out.println("after suit");
}
@BeforeTest
public void m5(){
	System.out.println("before test");
}
@AfterTest
public void m6() {
	System.out.println("after test");
}
@BeforeMethod
public void m7() {
	System.out.println("before method");
}
@AfterMethod
public void m8() {
	System.out.println("after method");
}
}
