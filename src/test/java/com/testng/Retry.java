package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry {
	@Test
	public void username1() {
		String exp = "ABC";
		String act = "ABC";
		Assert.assertEquals(act, exp);
		}
@Test(retryAnalyzer = rerun.class)
private void password() {
	String exp = "123";
	String act = "124";
	Assert.assertEquals(act, exp);
}
}
