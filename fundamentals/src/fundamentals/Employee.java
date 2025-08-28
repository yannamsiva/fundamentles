package fundamentals;

public class Employee {

	// non-static varible/instance varible
	int employeeNumber = 100;
	String name;// default value is null
	double employeeSalary = 25000;
	long mobileNumber = 9985538462l;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		System.out.println(emp.employeeNumber + "\t" + emp.name + "\t" + emp.employeeSalary + "\t" + emp.mobileNumber);
emp.name="shiva";
System.out.println(emp.employeeNumber + "\t" + emp.name + "\t" + emp.employeeSalary + "\t" + emp.mobileNumber);
	
Employee emp1 = new Employee();

	emp1.name="rani";
	System.out.println(emp1.employeeNumber + "\t" + emp1.name + "\t" + emp1.employeeSalary + "\t" + emp1.mobileNumber);
	
	
	}
}
