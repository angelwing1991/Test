package TestCase1;

public class EmployeeLogic {
	public double caculateYearlySalary(EmployeeDetail employeeDetails) {
		double yearlySalary=0;
		yearlySalary=employeeDetails.getMonthlySalary()*12;
		return yearlySalary;
	}

}
