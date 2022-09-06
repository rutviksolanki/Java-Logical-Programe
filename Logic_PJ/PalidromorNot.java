// Question: Write Java Program to Check Given Number is Palindrom or Not.
package Logic_PJ;
import java.util.Scanner;

public class PalidromorNot {
	public static void main(String[] args) {
		PalidromorNot pd = new PalidromorNot();
		pd.checkPalindromorNot();
	}
	public void checkPalindromorNot() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any One Number: ");
		int myNum = userInput.nextInt();
		String conTostring = Integer.toString(myNum);
		String revNum = "";
		for (int i = 0; i < conTostring.length(); i++) {
			revNum = conTostring.charAt(i) + revNum;
		}
		if (Integer.parseInt(conTostring) == Integer.parseInt(revNum)) {
			System.out.println(myNum + " is Palindrom Number 😍");
		}else {
			System.out.println(myNum + " is Not Palindrom Number 😒");
		}
		this.checkPalindromorNot();
	}
}
