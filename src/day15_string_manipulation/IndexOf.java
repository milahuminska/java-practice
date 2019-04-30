package day15_string_manipulation;

public class IndexOf {
	public static void main(String[] args) {
					  //012345 
		String word1 = "github";
//		g = 0
//		i = 1
//		t = 2
//		h = 3
//		u = 4
//		b = 5
		System.out.println(word1.indexOf("g"));//0
		System.out.println(word1.indexOf("th"));//2
		System.out.println(word1.indexOf("hub"));//3
		
		System.out.println("========================");
		
		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("Posistion of . :"+ index);//3
		System.out.println(url.charAt(index+1));//o
		   System.out.println("=========================");
		/*
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("Posistion of . :"+ i);//3
		
		System.out.println(url.charAt(i+1));//o
		*/
		String title = "Java - Google Search";
		// find position of this and check if space 
		// is on right and left sides
		int dash = title.indexOf('-');// 5
		System.out.println(title.charAt(dash - 2));// a
	    System.out.println(title.charAt(dash+2));// G 
	    System.out.println("=========================");
		
		String country = "United States of America";
		int states = country.indexOf("States");//7
		System.out.println("Position of states: "+ states);
		
		String word2 = "java, c++, pyton, tomcat, eclipse";
		//check of c++ is in the word2
		// 1) using contains 
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}
		// 2) using indexOf
		if(word2.indexOf("c++") > -1) {//!=
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		
		
		
		
		
		
		
	}

}
