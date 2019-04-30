package day15_string_manipulation;

public class GoogleSearchTest {
	public static void main(String[] args) {
		String item = "java";
		String pageTitle = item + " - Google Search";
		
		// test if pageTitle starts with item
		if (pageTitle.startsWith(item)) {
			System.out.println("PASS: Page title check passed");
		}else {
			System.out.println("FAIL: Page title check failed");
		}
		
		System.out.println("==================================");
		
		if (pageTitle.endsWith("Google Search")) {
			System.out.println("PASS: Google is in title");
		}else {
			System.out.println("FAIL: Google is not in title");
		}
		
		
		String word = "Mentoring Session with Mert Hiraoglu on Java String Manipulation";
		
		if(word.startsWith("mentoring")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
	}

}
