package day48_inheritance01;
  			//Employee IS-A   Person
public class Employee extends Person {
	String jobTitle;
	
	
	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}


	public void work() {
		System.out.println(name+ " is working as "+ jobTitle);
		
	}
	
	

}
