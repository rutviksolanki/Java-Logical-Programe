// Question: Write Java Program to Find Squre Root of Given Number.
package Logic_PJ;
import java.util.Scanner;
public class SqureRootofNum {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any One Number: ");
		int number = userInput.nextInt(),ans;
		System.out.println("Squre Root of " + number + " is " + Math.sqrt(number));
	}
}