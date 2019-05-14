package day40_customclasses_methods;

public class Company {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();

		emp1.name = "Mila";
		emp1.jobTitle = "Manager";
		emp1.salary = 1000.8;
		
		emp1.introduce();
		emp1.work();
		emp1.attendMeeting();
	
		emp1.jobTitle = "Team lead";
		emp1.salary = 10.8;
		emp1.introduce();
		

	}

}
