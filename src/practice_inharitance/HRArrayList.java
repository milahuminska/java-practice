package practice_inharitance;

import java.util.ArrayList;
import java.util.List;

public class HRArrayList {
	public static void main(String[] args) {
		System.out.println("===ArrayList===");

		// create an arraylist that can hold Employee object
		// list - ArrayList
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee(100, "Steven", "King", 4500.0));
		employees.add(new Employee(101, "Sarah", "Parker", 5500.0));
		employees.add(new Employee(102, "Vika", "Bulich", 3500.0));

		// increase Vika's salary by 1000
		double newSalary = employees.get(2).getSalary() + 1000;
		employees.get(2).setSalary(newSalary);

		System.out.println("Vika's salary: " + employees.get(2).getSalary());

		// look for employees whose salary is more than 5000 and print first and
		// last name

		for (Employee employee : employees) {
			if (employee.getSalary() > 5000) {
				System.out.println(employee.getFirstName() + " " + employee.getLastName()+" "+employee.getSalary());
			}
		}

		
	}

}
