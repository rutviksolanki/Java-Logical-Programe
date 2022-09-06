// Question: Write Java Program Find Factorial of Given Number.
package Logic_PJ;
public class Factorial {
	public static void main(String[] args) {
		int myNum = 6;
		long factorial = 1;
		while (myNum != 0) {
			factorial = factorial * myNum;
			myNum--;
		}
		System.out.println(factorial);
	}
}
