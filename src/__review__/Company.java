package __review__;

public class Company {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		//first employee
		emp1.firstName = "Pavel";
		emp1.lastName = "Babayan";
		emp1.printInfo();
		
		
		//second employee
		Employee emp2 = new Employee();
		emp2.firstName = "Murad";
		
		
		emp1.generateEmail();
		emp1.printEmail();
		emp1.setEmail("3536475");
		emp1.email="newfhfjg@gmail.com";
		emp1.title = "Developer";
	    emp1.setJobTitle("HR");
		emp1.printInfo();
		
		
	}

}

//Employee[] it_department = new Employee[2];
//type [] na,e = new type[size]
//Employee [] it_department = {emp1,emp2};

