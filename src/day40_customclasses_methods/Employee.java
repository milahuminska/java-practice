package day40_customclasses_methods;

public class Employee {
	String name;//can be used anywhere in project
	String jobTitle;
	double salary;// can only be used in same package

	void work() {
		System.out.println(name + "is working hard ....");
	}

	void attendMeeting() {
		System.out.println(name + " is attending a meeting ....");
	}

	void introduce() {
		System.out.println("Name["+name+"],jobTtitle["+jobTitle+"],salary["+salary+"]");
	}
	
	
}
