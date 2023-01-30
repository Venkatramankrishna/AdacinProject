package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependencycon {
//@Ignore
@Test(dependsOnMethods = "login")
public void credentials() {
System.out.println("credentials");
}
@Test
private void login() {
System.out.println("login");
}
}
