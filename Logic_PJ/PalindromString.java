// Question: Write Java Program to Check Given String is Palindrom or Not.
package Logic_PJ;

import java.util.Scanner;

public class PalindromString {
	String s = "Rutvik";
	int i = 0;
	int counter = 0;
	public static void main(String[] args) {
		PalindromString ps = new PalindromString();
		if (ps.isPalindrom() == ps.s.length()) {
			System.out.print("Palindrom");
		}else {
			System.out.print("Not Palindrom");
		}
	}

	public int isPalindrom() {
		//System.out.print(s.charAt(i));
		if (s.charAt(i) == s.charAt(s.length()-i-1)) {
			counter++;
		}else {
			counter = 0;
		}
		i++;
		if (i < s.length()) {
			isPalindrom();
		}
		return counter;
	}
	
}
