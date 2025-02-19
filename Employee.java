package GuviTaskJava3;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NewRaisedSalary = raiseSalary(121, 20000, "Rose", "Mary", 20);
		System.out.println("Increased Salary of Employee is "+NewRaisedSalary);

	}
	
	public static int raiseSalary( int EmpID,int EmpSalary,String EmpFirstName,String EmpLastName,
	int PercentageSalary) {
		int NewSalary = EmpSalary + (EmpSalary * PercentageSalary)/100;
		return NewSalary;
		
	}

}
