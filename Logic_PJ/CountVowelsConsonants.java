// Question: Write Java Program Find Counts of Vowels & Consonants in Given String.
package Logic_PJ;
public class CountVowelsConsonants {
	public static void main(String[] args) {
		char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
		String str = "Rutvik";
		int vowel = 0,consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			for (char v : vowels) {
				if (str.charAt(i) == v) {
					vowel++;
				}
			}
		}
		System.out.println("Count of Vowels is " + vowel);
		System.out.print("Count of Consonants is " + (str.length() - vowel));
	}
}
