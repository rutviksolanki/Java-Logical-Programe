// Question: Write Java Program to Swape Two Variable Without Using Third Variable.
package Logic_PJ;
public class SwapNum {
	public static void main(String[] args) {
		int firstNo = 10;
		int secondNo = 20;
		System.out.println("Before");
		System.out.println("The Value Of FirstNumber " + firstNo);
		System.out.println("The Value Of SecondNumber " + secondNo);
		firstNo = firstNo + secondNo;//30
		secondNo = firstNo - secondNo;//secondNo = 30 - 20 = 10
		firstNo = firstNo - secondNo;//firstNo = 30 - 10 = 20
		System.out.println("\nAfter");
		System.out.println("The Value Of FirstNumber " + firstNo);
		System.out.println("The Value Of SecondNumber " + secondNo);
	}
}
