package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Test
	@Parameters({"username1","password1"})
	private void credentials(@Optional("def")String username1, @Optional("456")String password1) {
	System.out.println("username is:" +username1);
	System.out.println("password is:" +password1);
}
}