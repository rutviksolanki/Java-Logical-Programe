// Question: Write Java Program to Find Prime Numbers in Given Range. 
package Logic_PJ;
import java.util.Scanner;
public class PrimeNumRange {
	public static void main(String[] args) {
		PrimeNumRange pn = new PrimeNumRange();
		Scanner userInput = new Scanner(System.in);
		System.out.println("Start Rang: ");
		int start = userInput.nextInt();
		System.out.println("End Rang: ");
		int end = userInput.nextInt();		
		for(int i = start;i <= end;i++){
		    if(pn.primeNumbers(i)){
		        System.out.print(i + " ");
		    }
		}
	}
	public boolean primeNumbers(int number) {
		if (number > 1) {
			for (int i = 2; i <= (number/2); i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
	}
	
}