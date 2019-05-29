package office_hour_may14;

public class CreatePeople {
	public static void main(String[] args) {
		//when we constructors certain actions are
		// being taken during the process of creating 
		// the object
		
		Person john = new Person("01/01/2000");
		
		System.out.println(john.getBirthday());
		
		john.setFirstName("John");
		john.setLastName("Doe");
		//john.setBirthday("01/01/2000");
		
		System.out.println(john.getFirstName());
		System.out.println(john.getLastName());
		System.out.println(john.getBirthday());
		
		john.setLastName("Smith");
		//john.setBirthday("02/02/2000");
		System.out.println(john.getBirthday());
		
		
		
	}
	
}
