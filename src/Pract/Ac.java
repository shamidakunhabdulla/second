package Pract;

import org.testng.annotations.Test;

public class Ac {
@Test (timeOut=4000)
public void lg() {
	System.out.println("lg ac");
}
@Test (groups= {"smoke"})
public void volta() {
	System.out.println("voltas");
}
}
