// Question: Write Java Program to Check Given Number is Perfect or Not.
package Logic_PJ;
import java.util.Scanner;
public class PerfectNum {
	public static void main(String[] args) {
		isPerfectNum();
	}
	public static void isPerfectNum() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any One Number: ");
		long number = userInput.nextLong();
		long checker = 0;
		for (int i = 1; i <= (number/2); i++) {
			if (number % i == 0) {
				checker = checker + i;
			}
		}
		if (checker == number) {
			System.out.printf("%d is Perfect Number \n",number);
			isPerfectNum();
		}else {
			System.out.printf("%d is Not Perfect Number \n",number);			
			isPerfectNum();
		}
	}
}
