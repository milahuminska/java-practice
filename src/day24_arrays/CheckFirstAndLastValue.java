package day24_arrays;

public class CheckFirstAndLastValue {
	public static void main(String[] args) {
		// write a program that will print value
		// if first and last number is the same
		// if first and last value in the array of ints
		// is same, print true
		// final int length =6;
		int[]numbers = {12,41,213,21,42,12};
		// .length <- it's not a method , it's a instance variable (property)
		boolean equals = numbers[0]== numbers[numbers.length-1];
		System.out.println(equals);
		
		
		
	}

}
