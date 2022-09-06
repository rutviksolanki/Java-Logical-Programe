// Question: Write Java Program Find Total no of Characters in Given String.
package Logic_PJ;
import java.util.Scanner;
public class countChar {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter String: ");
		String stringVal = userInput.nextLine();
		int count = 0;
		for (int i = 0; i < stringVal.length(); i++) {
			count++;
		}
		System.out.println(stringVal + " Contain " + count + " Charcters");
	}
}