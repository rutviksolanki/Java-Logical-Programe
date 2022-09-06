// Question: Write Java Program to Remove Specific Character in String. 
package Logic_PJ;
import java.util.Scanner;
public class RemoveChar {
	public static void main(String[] args) {
		RemoveChar rc = new RemoveChar();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any String: ");
		String string = userInput.next();
		
		System.out.println("Enter Character That You Want Remove: ");
		char charcter = userInput.next().charAt (0);
		String resString = "";
		removeCharcter(string,charcter);
	}
	public static void removeCharcter(String string, char charcter) {
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == charcter) {
				continue;
			}
			System.out.print(string.charAt(i));
		}
	}
	
}
