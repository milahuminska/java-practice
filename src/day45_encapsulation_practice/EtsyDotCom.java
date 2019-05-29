package day45_encapsulation_practice;

public class EtsyDotCom {
public static void main(String[] args) {
	EtsyAccount acct1 = new EtsyAccount();
	System.out.println(acct1.toString());
	
	acct1.setEmail("pumerov@mrmail.com");
	acct1.setFirstName("Pumerov");
	acct1.setPassword("bulgaria123");
	
	System.out.println(acct1.toString());
	
	EtsyAccount acct2 = new EtsyAccount();
	acct2.setEmail("gvbhnjmhost.info");
	acct1.setFirstName("hbjn123");
	acct2.setPassword("abc12");
	System.out.println(acct2.toString());
	
	
	EtsyAccount acct3 = new EtsyAccount("helireva@royalhost.info","Helireva", "royal234");
	System.out.println(acct3.toString());
	
	EtsyAccount acct4 = new EtsyAccount("mila@gmail.com","Milaaaaa");
	System.out.println(acct4.toString());
	
	
	
	
}
}
