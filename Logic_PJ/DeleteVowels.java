// Question: Write Java Program Delete Vowels in Given String.
package Logic_PJ;
public class DeleteVowels {
	public static void main(String[] args) {
		String givenChar = "Rutvik";
		char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
		int count = 0;
		String resString = "";
		label:
			for (int i = 0; i < givenChar.length(); i++) {
			for (char c : vowels) {
				if (c == givenChar.charAt(i)) {
					continue label;
				}
			}
			resString = resString + givenChar.charAt(i);
		}
		System.out.printf("String is '%s' & Without Vowels is '%s'",givenChar,resString);
		//System.out.print(count);
	}
}
