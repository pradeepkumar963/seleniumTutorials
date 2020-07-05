package testNG;

import org.testng.annotations.Test;

public class DependanciesManagement {
	// example
	//1.go to school
	//2.join higher secondary school
	//3.join college
	@Test(enabled = true)
	public void highSchool() {
		System.out.println("High School");
	}
	@Test(dependsOnMethods = "highSchool")
	public void higherSecSchool() {
		System.out.println("Higher Sec School");
	}
	@Test(dependsOnMethods = "higherSecSchool")
	public void college() {
		System.out.println("College");
	}
}
