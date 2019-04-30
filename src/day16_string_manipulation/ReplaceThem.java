package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);

		System.out.println(sentence); // with spaces

		// replace , with !!!
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);

		String mixed = "&^@#$ja-v|a@#$";
		// clean up mixed
		mixed = mixed.replace("&^@#$", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);// j$a-v|a

		mixed = mixed.replace("$", "");
		mixed = mixed.replace("-", "");
		mixed = mixed.replace("|", "");
		// mixed = mixed.replace("$", "").replace("-", "").replace("|", "");
		System.out.println(mixed);

		mixed = mixed.replace("a", "");
		System.out.println(mixed);

		System.out.println("====================================");
		String result = "About 115,000,000 results (0.66 seconds)";

		// using string methods(replace, substring) get number of results

		// 115,000,000

		result = result.replace("About ", "");
		// result = result.replace(" results (0.66 seconds)", ""); might break when
		// number changes
		result = result.substring(0, result.indexOf(" "));
		System.out.println(result);
		System.out.println("====================================");

		result = result.replaceFirst(",", "");// replace first comma
		System.out.println(result);

	}

}
