package day43_encapsulation_constructor;

public class TeslaDealer {
	public static void main(String[] args) {
		Tesla myTesla = new Tesla();

		myTesla.setModel("Model 3");
		myTesla.setRange(310);
	    myTesla.setZeroTo60(3.2);
		myTesla.setPrice(51450);
		myTesla.setSelfDriving(true);
		
		
		System.out.println("Model: "+myTesla.getModel());
		System.out.println("Range: "+myTesla.getRange());
		System.out.println("ZeroTo60: "+myTesla.getZeroTo60());
		System.out.println("Price: "+myTesla.getPrice());
		System.out.println("SelfDriving: "+myTesla.isSelfDriving());
		
		System.out.println(myTesla); // automatically calling toString method
		System.out.println(myTesla.toString());
		
		Tesla myTesla1 = new Tesla();
		myTesla1.setTeslaInfo("Roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla1.toString());
		//myTesla, myTesla1
		if(myTesla.getZeroTo60()>myTesla1.getZeroTo60()) {
			System.out.println("Faster model: "+ myTesla1.getModel());
			System.out.println("0-60 speed: "+myTesla1.getZeroTo60());
		}else {
			System.out.println("Faster model: "+ myTesla.getModel());
			System.out.println("0-60 speed: "+myTesla.getZeroTo60());
		}
		
		
		
		buy(myTesla1);
		buy(myTesla);
		System.out.println(testDrive("Model S"));
		Tesla testCar = testDrive("Model 3");
		System.out.println(testCar.toString());
		
		
		
		
	}                      // car = myTesla1;
	public static void buy(Tesla car) {
		System.out.println("Purchasing "+car.toString());
	}

	public  static Tesla testDrive(String model) {
		System.out.println("Hi, I would like to test dive - "+ model);
		System.out.println("Sure , let me build the object and return it");
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);
	return car;
		
	}
}
