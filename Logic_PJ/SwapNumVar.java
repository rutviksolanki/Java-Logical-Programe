// Question: Write Java Program to Swap Two Variables Using Third Variable.
package Logic_PJ;
public class SwapNumVar {
	public static void main(String[] args) {
		int firstNo = 10, secondNo = 20, tempVar;
		System.out.println("Before");
		System.out.println("First Number: " + firstNo);
		System.out.println("Second Number: " + secondNo);
		tempVar = firstNo;
		firstNo = secondNo;
		secondNo = tempVar;
		System.out.println("\nAfter");
		System.out.println("First Number: " + firstNo);
		System.out.println("Second Number: " + secondNo);
		
	}
}
