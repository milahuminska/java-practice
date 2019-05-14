package day40_customclasses_methods;

public class BestBuy {
	public static void main(String[] args) {
		// System.out.println(brand);
		// above will not work, we need object to use brand
		// create SmartPhone object;

		SmartPhone phone1 = new SmartPhone();
		System.out.println(phone1.brand);// nul
		System.out.println(phone1.screenSize);//

		phone1.brand = "Nokia 6300";
		phone1.screenSize = 2.0;
		phone1.color = "Silver";
		phone1.price = 76.16;

		System.out.println("Brand: " + phone1.brand);
		System.out.println("ScreenSize: " + phone1.screenSize);
		System.out.println("Color: " + phone1.color);
		System.out.println("Price: " + phone1.price);
		
		phone1.color="Black";
		System.out.println("Color: " + phone1.color);
		
		SmartPhone phone2 = new SmartPhone();
		phone2.brand = "Siemens";
		phone2.screenSize = 1.5;
		phone2.color = "Blue";
		phone2.price = 39.22;
		
		System.out.println("#### CELL 2 VALUES ####");
		System.out.println("Brand: " + phone2.brand);
		System.out.println("ScreenSize: " + phone2.screenSize);
		System.out.println("Color: " + phone2.color);
		System.out.println("Price: " + phone2.price);
		
		System.out.println("#### CALLING METHODS ####");
		phone1.call();
		phone1.message();
		phone1.takeAPhoto();
		
		
		phone2.call();
		phone2.message();
		phone2.call();
		phone2.takeAPhoto();
				
		
	}
}
