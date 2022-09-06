// Question: Write Java Program to Print Given Number in Reverse Order.
package Logic_PJ;
public class RevInteger {
	public static void main(String[] args) {
		int number = 12231;
		String numTostring = Integer.toString(number);
		String revString = "";
		for (int i = 0; i < numTostring.length(); i++) {
			revString = numTostring.charAt(i) + revString;
		}
		System.out.println(revString);
	}
}
