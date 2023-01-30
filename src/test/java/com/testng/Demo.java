package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void username1() {
		String exp = "ABC";
		String act = "ABC";
		Assert.assertEquals(act, exp);
		}
@Test
public void password() {
	String exp = "123";
	String act = "124";
	Assert.assertEquals(act, exp);
}
}