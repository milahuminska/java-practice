package home_practice;

import java.util.Scanner;

public class VideoGameCoupons {
	public static void main(String[] args) {
		int numberOfCoupon, candies, gumballs;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of coupons:");
		numberOfCoupon  = scan.nextInt();
		//
		if(numberOfCoupon<3) {
			System.out.println("Not enough coupons");
		}else {
			//for candies we need 10 coupons, for gumballs we need 3 coupons
			candies = numberOfCoupon/10;
			//System.out.println("Ho much left: "+numberOfCoupon%10);
			gumballs = numberOfCoupon%10/3;
			System.out.println("Number of Candies: "+candies);
			System.out.println("Number of Gumballs: "+gumballs);
		}
	}
}
