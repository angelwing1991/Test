package TankLearn3.Learn;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*public class SimpleTest {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is a beforeSuite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is a afterSuite");
	
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is a beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is a afterClass");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is a beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this is a afterTest");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is a beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is a afterMethod");
	}
	
	@Test
	public void sampleTest() {
		System.out.println("this is a testcase1");
	}
	
	@Test
	public void sampleTest1() {
		System.out.println("this is a testcase2");
	}
	

}*/

public class SimpleTest2 {
	 
	 @BeforeClass
	 public void setUp() {
	   // code that will be invoked when this test is instantiated
	 }
	 
	 @Test(groups = { "fast2" })
	 public void aFastTest() {
	   System.out.println("Fast test2");
	 }
	 
	 @Test(groups = { "slow2" })
	 public void aSlowTest() {
	    System.out.println("Slow test2");
	 }
	 
	}

