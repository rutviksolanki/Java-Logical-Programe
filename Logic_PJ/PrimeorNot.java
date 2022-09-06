// Question: Write Java Program to Check Given Number is Prime or Not.
package Logic_PJ;
import java.util.Scanner;
public class PrimeorNot {
	public static void main(String[] args) {
		PrimeorNot pn = new PrimeorNot();
		pn.checkWhether();
	}
	public void checkWhether() {
		Scanner useInput = new Scanner(System.in);
		System.out.println("Enter Any One Number: ");
		int myNum = useInput.nextInt();
		boolean checker = false;
		if (myNum == 0 || myNum == 1) {
			checker = false;
		} else {
			for (int i = 2; i <= (myNum/2) + 1; i++) {
				if (myNum % i == 0) {
					checker = false;
					break;
				}else {
					checker = true;
				}
			}
		}
		if (checker == true) {
			System.out.println(myNum + " is Prime Number");
			this.checkWhether();
		} else {
			System.out.println(myNum + " is Not Prime Number");
			this.checkWhether();
		}
	}
}
