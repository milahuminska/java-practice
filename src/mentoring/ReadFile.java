package mentoring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		// try catch block stands for handling exceptions
		// exceptions it's like an error in java
		// if there is no such a file it will throw exception
		try {
			// File class reads files, so we need to provide path to the file in order to
			// access it
			// Scanner reads content of the file | provide path to the file, use '/' front slash
			Scanner scan = new Scanner(new File("/Users/liudmilahuminska/Desktop/mentoring/shopping_list.txt"));
			// we use hasNextLine() method that returns true if there is another line in the file
			// it will iterate file until file has next line with text
			while (scan.hasNextLine()) {
				// nextLine() method reads whole line
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
