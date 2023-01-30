package com.testng;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GroupingCon {
	@Test (groups = "Nonveg")
	public void Briyani() {
	System.out.println("Briyani");
	}
	@Test(groups = "Nonveg")
	public void ChickenRice() {
	System.out.println("ChickenRice");
	}
	@Test(groups = "Nonveg")
	public void EggRice() {
	System.out.println("EggRice");
	}
	@Test(groups = "Nonveg")
	public void Gril() {
	System.out.println("Gril");
	}
	@Test(groups = "veg")
	public void Momos() {
	System.out.println("Momos");
	}
	@Test(groups = "Ec")
	public void Tab() {
	System.out.println("tab");
	}
	@Test(groups = "Ec")
	public void Mobile() {
	System.out.println("Mobile");
	}
}
