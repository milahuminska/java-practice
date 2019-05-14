package day41_customclasses02;

public class BMW {
	String make = "BMW";
	String model;
	double price;
	

	public void showPrice() {
//		if(model.equals("330i")) {
//			price = 40.250;
//		}else if(model.equals("740i")) {
//			price = 86.450;
//		}else if(model.equals("m3")) {
//			price = 66.500;
//		}else {
//			System.out.println("Invalid model");
//		}
		
		switch (model) {
		case "330i":
			price = 40250;
			break;
		case "740i":
			price = 86450;
			break;
		case "m3":
			price = 66500;
			break;
			default:
				System.out.println( model+ " is not available");
				price =0.0;
		}
		System.out.println("Price: "+price);
		
		
	}
	
	
}
