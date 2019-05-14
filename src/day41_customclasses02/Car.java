package day41_customclasses02;

public class Car {
String make;
String model;
int currentSpeed;
String color;

public void printCarInfo() {
	String info = "car make["+make+"], color["+color+"], currentSpeed"+"["+currentSpeed+"]";
	System.out.println(info);
}
	
//showCurrentSpeed
//	return: void
//	param: int speedLimit
//	"Ford is driving at currentSpeed mph, following speed limit - 55"
//	"Ford is driving at currentSpeed mph, over the speed limit - 55"
public void showCurrentSpeed(int speedLimit) {
 if(currentSpeed>=speedLimit) {
	 System.out.println(make+" is driving at "+currentSpeed+" mph, following speed limit - "+speedLimit);
 }else {
	 System.out.println(make+" is driving at "+currentSpeed+" mph, over the speed limit - "+speedLimit);
 }

}
public void drive() {
	System.out.println(make+" "+model+" is driving ...");
}

public void accellerate(int mph) {
	currentSpeed = currentSpeed + mph;// 
}

}
