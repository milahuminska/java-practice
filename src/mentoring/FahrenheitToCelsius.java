package mentoring;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter temperature in Fahrenheit");
		float temperatureF = scan.nextInt();

		float temperatureC = ((temperatureF - 32) * 5) / 9;

		System.out.println("Temperature in Celsius = " + temperatureC);

	}
}
