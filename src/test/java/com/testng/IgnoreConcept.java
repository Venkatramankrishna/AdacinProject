package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreConcept {
@Test(enabled = false)
public void Briyani() {
System.out.println("Briyani");
}
@Test
public void ChickenRice() {
System.out.println("ChickenRice");
}
@Test
public void EggRice() {
System.out.println("EggRice");
}
@Ignore
@Test 
public void Gril() {
System.out.println("Gril");
}
@Test
public void Momos() {
System.out.println("Momos");
}
@Test
public void Tab() {
System.out.println("tab");
}
@Test
public void Mobile() {
System.out.println("Mobile");
}
}