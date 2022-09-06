// Question: Write Java Program Find Factorial of Given Number Using Recursion.
package Logic_PJ;
public class FactorialRec {
	int myNum = 6;
	long factorial = 1;
	public static void main(String[] args) {
		FactorialRec fr = new FactorialRec();
		fr.findFactorial();
	}
	public void findFactorial() {
		factorial = factorial * myNum;
		myNum--;
		if (myNum != 0) {
			findFactorial();
		}else {
			System.out.println(factorial);			
		}
	}
}
