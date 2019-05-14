package day42_customclasses03_encapsulation;


public class People {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.age =1; //not visible
//		p1.name ="Jim"; not visible
		System.out.println(p1.getName());
		
		p1.setName("Alex");
		
		System.out.println(p1.getName());
		
	}

}
