package day40_customclasses_methods;

public class MyContacts {
	public static void main(String[] args) {
		// create Contact object
		Contact contact1 = new Contact();

		contact1.name = "Mila";
		contact1.phoneNumber = "356-565-0167";
		contact1.email = "hjf@gmail.com";

		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();

		Contact orhan = new Contact();
		orhan.name = "Orhan Sultanov";
		orhan.phoneNumber = "767 - 987 - 8754";
		orhan.email = "orhan@net.com";

		
		System.out.println("Name: "+orhan.name);
		System.out.println("PhoneNumber: "+orhan.phoneNumber);
		System.out.println("Email: "+orhan.email);
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
		
		contact1.call();

	}

}
