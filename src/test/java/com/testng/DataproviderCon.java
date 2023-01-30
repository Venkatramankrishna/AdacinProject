package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderCon {
@Test(dataProvider = "data")
public void credentials(String username,  String password ) {
System.out.println("username is :" +username);
System.out.println("password is :"  +password);
}
@DataProvider
public Object[][] data() {
return new Object[][] {
	{"abc","123"},{"def","456"},{"ghi","789"}};
}
}