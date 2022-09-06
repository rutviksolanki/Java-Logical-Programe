// Question: Write Java Program Find GCD/HCF of Given Two Numbers.
package Logic_PJ;
import java.util.Scanner;
public class FindGCD {
	public static void main(String[] args) {
		FindGCD gcd = new FindGCD();
		//gcd.firstMethodGCD();
		gcd.secondMethodGCD();
	}
	//LESS ITERATION
	public void secondMethodGCD() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter First No: ");
		int firstNo = userInput.nextInt();
		
		System.out.println("Enter Second No: ");
		int secondNo = userInput.nextInt();
		int GCD = 0;
		while (firstNo % secondNo != 0) {
			int reminder = firstNo % secondNo;
			firstNo = secondNo;
			secondNo = reminder;
		}
		System.out.println("GCD of "+ firstNo + " & "+ secondNo +" is: " + secondNo);
	}
	public void firstMethodGCD() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter First No: ");
		int firstNo = userInput.nextInt();
		
		System.out.println("Enter Second No: ");
		int secondNo = userInput.nextInt();
		int GCD = 0;
		for (int i = 1; i < firstNo; i++) {
			if (firstNo % i == 0 && secondNo % i == 0) {
				GCD = i;
			}
		}
		System.out.println("GCD of "+ firstNo + " & "+ secondNo +" is: " + GCD);
	}
}
