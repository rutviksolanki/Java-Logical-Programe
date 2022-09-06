// Question: Write Java Program to Replace First Vowels.
package Logic_PJ;
public class ReplaceatVowels {
	public static void main(String[] args) {
		String givenChar = "Rutvik";
		char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
		boolean isDone = false;
		String resString = "";
		goLabel:
			for (int i = 0; i < givenChar.length(); i++) {
			for (char c : vowels) {
				if (!isDone) {
					if (c == givenChar.charAt(i)) {
						resString = resString + '-';
						isDone = true;
						continue goLabel;
					}
				}
			}
			resString = resString + givenChar.charAt(i);
		}
		System.out.printf("String is '%s' & Without Vowels is '%s'",givenChar,resString);
		
	}
}
