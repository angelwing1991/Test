package TestCase1;

//EmployeeDetail设置获取员工的姓名月薪和年龄

public class EmployeeDetail {
	private String name;
	private double monthlySalary;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary=monthlySalary;
	}
	
	
	public double getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}

}
