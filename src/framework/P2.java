package framework;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class P2 {
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
}
