// Question: Write Java Program to Print Unique Character in Given String.
package Logic_PJ;
public class PrintUniqeChar {
	public static void main(String[] args) {
		String givenString = "Ritik",resString = "";
		for (int i = 0; i < givenString.length(); i++) {
			if (!resString.contains(String.valueOf(givenString.charAt(i)))) {
				resString += String.valueOf(givenString.charAt(i));
			}
		}
		System.out.print(resString);
	}
}
