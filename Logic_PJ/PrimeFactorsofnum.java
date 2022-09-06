// Question: Write Java Program to Find Prime Factor of Given Number.
package Logic_PJ;
import java.util.Scanner;
public class PrimeFactorsofnum {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any One Number: ");
		int number = userInput.nextInt();
		for (int i = 2; i < number; i++) {
			while(number % i == 0) {
				System.out.print(i + " ");
				number = number / i;
			}
		}
		if (number > 2) {
			System.out.print(number);
		}
	}
}
