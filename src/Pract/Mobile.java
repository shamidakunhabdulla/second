package Pract;

import org.testng.annotations.Test;

public class Mobile {
@Test(enabled=false)
public void exnos() {
	System.out.println("by samsung");
}
@Test(groups= {"smoke"})
public void ios() {
	System.out.println("by iphone");
}@Test
public void android() {
	System.out.println("by google");
}

}
