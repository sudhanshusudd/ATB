package ATB.MasterATB;

import org.testng.annotations.*;

public class Driver {
	
	@BeforeTest
	public void preRequisites() {
		System.out.println("running pre requisites..");
	}
	
	@Test
	public void Test() {		
		System.out.println("Test in progress..");
	}
}
