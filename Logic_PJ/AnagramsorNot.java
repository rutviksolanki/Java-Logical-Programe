// Question: Write Java Program to Check Two String is Anagrams or Not.
package Logic_PJ;
import java.util.Arrays;
public class AnagramsorNot {
	public static void main(String[] args) {
		String firstStr = "java";
		String secondStr = "avaj";
		System.out.println(isAnagrams(firstStr,secondStr));
	}

	private static boolean isAnagrams(String firstStr, String secondStr) {
		char[] firstArray = firstStr.toCharArray();
		char[] secondArray = secondStr.toCharArray();
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		return Arrays.equals(firstArray, secondArray);
	}
}
