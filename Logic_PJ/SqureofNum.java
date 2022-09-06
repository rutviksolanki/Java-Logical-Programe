// Question: Write Java Program to Find Squre of Given Number.
package Logic_PJ;
import java.util.Scanner;
public class SqureofNum {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any One Number: ");
		int number = userInput.nextInt(),ans;
		ans = number * number;
		System.out.println("Squre of " + number + " is " + ans);
		System.out.println("Squre Root of " + ans + " is " + Math.sqrt(ans));
	}
}
