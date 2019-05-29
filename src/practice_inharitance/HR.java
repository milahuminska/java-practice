package practice_inharitance;

public class HR {
	public static void main(String[] args) {
		
		//Array of 3 Employee object s
		Employee [] employees = new Employee[3];
		
		Employee emp = new Employee (100,"Steven","King",6000.0);
		
		employees[0]= emp;
		employees[1]= new Employee(101,"Mila","Huminska",5000.0);
		employees[2]= new Employee(103,"Vasya","Fomiuk",7000.0);
		
		//print the first name and salary of the first employee in the employees array
		System.out.println(employees[0].getFirstName()+":"+employees[0].getSalary());
		
		//loop through each employee and print - first name and salary
		for (Employee empl :employees) {
			System.out.println(empl.getFirstName()+":"+ empl.getSalary());
		}
		
		//for loop
		for(int i =0; i<employees.length;i++) {
			//System.out.println(employees[i].getFirstName()+":"+ employees[i].getSalary());
			Employee tempEmp = employees[i];
			System.out.println(tempEmp.getFirstName()+":"+tempEmp.getSalary());
			
		}
		System.out.println("===Arraylist===");
		//create an arraylist that can hold Employee object
		
		
	}

}
