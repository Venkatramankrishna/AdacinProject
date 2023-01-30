package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedCon {
@Test
@Parameters({"username","password"})
private void credentials(@Optional("def")String username, String password) {
System.out.println("username is:" +username);
System.out.println("password is:" +password);
}
}
