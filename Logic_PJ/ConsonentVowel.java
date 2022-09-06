package Logic_PJ;
import java.util.Scanner;
public class ConsonentVowel {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		char givenChar = userInput.next().charAt(0);
		char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
		boolean contains = false;
		for (char c : vowels) {
		    if (c == givenChar) {
		        contains = true;
		        break;
		    }else {
		    	contains = false;
		    }
		}
		if (contains) {
		    System.out.print("Vowels");
		}else {
			System.out.print("Consonent");
		}
	}
}
