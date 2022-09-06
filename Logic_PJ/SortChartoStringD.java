// Question: Write Java Program to Sort Character of String.
package Logic_PJ;

import java.util.Arrays;
public class SortChartoStringD {
	public static void main(String[] args) {
		String giveString = "abcd";
		String lowerString = giveString.toLowerCase();
		char[] strArr = lowerString.toCharArray();
		char tempVar;
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i+1; j < strArr.length; j++) {
				if (Character.toLowerCase(strArr[i]) < Character.toLowerCase(strArr[j])) {
					tempVar = strArr[i];
					strArr[i] = strArr[j];
					strArr[j] = tempVar;
				}
			}
		}
		String resStr =  new String(strArr);
		System.out.print(resStr);
	}
}
