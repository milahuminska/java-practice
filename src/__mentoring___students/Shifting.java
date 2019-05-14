package __mentoring___students;

import java.util.Arrays;

public class Shifting {
public static void main(String[] args) {
	char [] alpha = new char[26];
	for(int i =0; i<26; i++) {
		alpha[i]=(char) (97+i);
	}
	System.out.println(Arrays.toString(alpha));

	char [] alpha1 = new char[26];
	for(int i=0; i<alpha1.length; i++) {
		//alpha1[i]=alpha[(i+2)%26];//if n<m n%m=n
		alpha1[i]=alpha[alpha.length-1-i];//reverse
	}
	System.out.println(Arrays.toString(alpha1));
}

}
