package com.testng;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertCon {
	@Test
	private void demo() {
String exp = "Sam";
String act = "Sam12";
SoftAssert s = new  SoftAssert();
s.assertEquals(act, exp);
System.out.println("Verification");
}
}
