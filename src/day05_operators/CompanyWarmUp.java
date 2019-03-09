package day05_operators;

public class CompanyWarmUp {
 public static void main(String[] args) {
	

	
	String nameOfCompany = "Facebook";
	String address = "Silicon Valley, CA";
    int numberOfEmployees = 1000;
	long revenue = 4000000L;
	boolean isTechCompany = true;
	
       System.out.println("Company name is " + nameOfCompany);
       System.out.println("adress is " + address);
       System.out.println("Number of emloyees is " + numberOfEmployees);
       System.out.println("Annual revenue is " + revenue);
       System.out.println("Is it a tech company? - "+ isTechCompany);
       
       String aboutCompany = "Company "+ nameOfCompany+" is located in "+ address+ " and "+numberOfEmployees + " work for it.";
       
      // String aboutCompany = "Company "+ nameOfCompany+" is located in "+ address+ "\n and "+numberOfEmployees + " work for it."
     
       System.out.println(aboutCompany);
	
      
	
}
	
}
