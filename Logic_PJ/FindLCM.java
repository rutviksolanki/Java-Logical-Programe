// Question: Write Java Program Find LCM of Given Two Numbers.
package Logic_PJ;
import java.util.Iterator;
import java.util.Scanner;
public class FindLCM {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter First No: ");
		int firstNo = userInput.nextInt();
		
		System.out.println("Enter Second No: ");
		int secondNo = userInput.nextInt();
		int GCD = 0,LCM;
		for (int i = 1; i < firstNo; i++) {
			if (firstNo % i == 0 && secondNo % i == 0) {
				GCD = i;
			}
		}
		LCM = (firstNo * secondNo) / GCD;
		System.out.println("GCD of "+ firstNo + " & "+ secondNo +" is: " + GCD);
		System.out.println("LCM of "+ firstNo + " & "+ secondNo +" is: " + LCM);		
	}
}
