package TestCase1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	EmployeeLogic empBusinessLogic = new EmployeeLogic();
	EmployeeDetail employee = new EmployeeDetail();
	
	@Test
	public void testCaculateYearlySalary() {
		employee.setName("Rajeev");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		double salary = empBusinessLogic.caculateYearlySalary(employee);
		Assert.assertEquals(96000,salary,0.0,"8000");
	}

}
