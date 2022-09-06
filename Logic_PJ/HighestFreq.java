// Question: Write Java Program Find Highest Frequency of Character in Given String.
package Logic_PJ;
public class HighestFreq {
	public static void main(String[] args) {
		String givenStr = "RITTIITIK";
		String lowerStr = givenStr.toLowerCase();
		int tempCounter = 0;
		char finalAns = ' ';
		int Counter = 1;
		for (int i = 0; i < lowerStr.length(); i++) {
			for (int j = i + 1; j < lowerStr.length(); j++) {
				if (lowerStr.charAt(i) == lowerStr.charAt(j)) {
					tempCounter++;
					if (tempCounter > Counter) {
						Counter = tempCounter;
						finalAns = lowerStr.charAt(i);
					}
				}
			}
			tempCounter = 1;
		}
		System.out.printf("(%s,%d)",finalAns,Counter);
	}
}