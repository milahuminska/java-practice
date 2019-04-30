package day16_string_manipulation;

public class CapitalCity {
	public static void main(String[] args) {
		String str = "Moscow is a  apital of Russia";
		// Baku, Azerbaijan

		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		// str = str.replace("Moscow", "Baku")
		// System.out.println(str);
		// str = str.replace("Russia", "Azerbaijan");
		System.out.println(str);
		System.out.println("==========================");

		String email = "firstName_LastName@gmail.com";

		String company = "deloitte";

		String newEmail = email.replace("gmail.com", company);
		System.out.println(newEmail);
		System.out.println("===========================");

	}

}
