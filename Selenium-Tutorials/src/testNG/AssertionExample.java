package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	@Test
	public void assertion() {
		
		String name="Pradeep";
		boolean value=false;
		
		/*if(name.equals("Pradeep")) {
			System.out.println("Name Is Equal");
		}
		else {
			System.out.println("Name is Not Equal");
		}*/
		
		//Assert.assertNotEquals(name, "Pradeep");
		//Assert.assertEquals(value, true);
		Assert.assertTrue(value, "This is Not True");
	}
}
