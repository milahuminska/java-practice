package day41_customclasses02;

public class Kitchen {
	public static void main(String[] args) {
		Microwave m1 = new Microwave();
		m1.brand = "Samsung";

		m1.turnOn();

		m1.heat("pizza");
		m1.turnOff();
	}

}
