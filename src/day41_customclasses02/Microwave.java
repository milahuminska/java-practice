package day41_customclasses02;

public class Microwave {
	String brand;
	boolean isOn;

	public void turnOn() {
	
		if (isOn ==true) {
			System.out.println(brand +" is already on");
		} else {
			System.out.println("Turning on "+brand+ " microwave");
			isOn=true;
		}

	}

	public void turnOff() {
		if (isOn == false) {
			System.out.println("It is already off");
		} else {
			System.out.println("Turning off "+brand+ " microwave");
			isOn=false;
		}
	}

	public void heat(String food) {
		if (isOn) {
			System.out.println("Heating the "+food);
		} else  {
			System.out.println("Microwave is off, cannot heat " +food);
		}
	}
	
}
