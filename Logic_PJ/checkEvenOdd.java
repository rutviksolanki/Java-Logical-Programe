// Question: Write Java Program Find Given Number is Even or Odd.
package Logic_PJ;
import java.util.Scanner;

public class checkEvenOdd {
	public static void main(String[] args) {
		checkEvenOdd eo = new checkEvenOdd();
		eo.isEvenorOdd();
	}
	public void isEvenorOdd() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any One Number: ");
		int number = userInput.nextInt();
		if (number % 2 == 0) {
			System.out.println(number + " is Even Number 😍");
			this.isEvenorOdd();
		} else {
			System.out.println(number + " is Odd Number 😒");
			this.isEvenorOdd();
		}
	}
}
