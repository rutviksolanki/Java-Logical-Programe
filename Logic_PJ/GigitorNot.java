// Question: Write Java Program Check Given Character is Digit or Not.
package Logic_PJ;
import java.util.Scanner;
public class GigitorNot {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any One Charcter: ");
		char givenNum = userInput.next().charAt(0);
		boolean checker =  Character.isDigit(givenNum);
		if (checker) {
			System.out.print("Given Number("+ givenNum +") is Digit");
		}else {
			System.out.print("Given Number("+ givenNum +") is Not Digit");			
		}
	}
}
