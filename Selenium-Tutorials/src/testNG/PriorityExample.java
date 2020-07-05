package testNG;

import org.testng.annotations.Test;

public class PriorityExample {
	//setting priorities
	// drive a car
	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("start the car");
	}
	@Test(priority = 1)
	public void putFirstGear() {
		System.out.println("First Gear");
	}
	@Test(priority = 2)
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
}
