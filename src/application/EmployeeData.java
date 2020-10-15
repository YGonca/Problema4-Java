package application;

import java.util.Scanner;
import entities.Employee;

public class EmployeeData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Employee name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: "+emp);
		System.out.print("Percentage to increase salary: ");
		emp.increaseSalary(sc.nextDouble());
		System.out.println("Updated data: "+emp);
		sc.close();
	}
}
