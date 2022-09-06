// Question: Write Java Program Find Cube of Given Number.
package Logic_PJ;
import java.util.Scanner;
public class CubeofNum {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any One Number: ");
		int number = userInput.nextInt(),ans;
		ans = number * number * number;
		System.out.println("Cube of " + number + " is " + ans);
	}
}
