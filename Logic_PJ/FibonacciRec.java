// Question: Write Java Program Print Fibonacci Series Using Recursion.
package Logic_PJ;
public class FibonacciRec {
	int i = 0;
	int n1 = 0,n2 = 1,n3;
	public static void main(String[] args) {
		FibonacciRec fr = new FibonacciRec();
		System.out.println(fr.n1 + "\n" + fr.n2);
		fr.FiboNacci();
	}
	public void FiboNacci() {
		n3 = n1 + n2;
		System.out.println(n3);
		n1 = n2;
		n2 = n3;
		i++;
		if (i < 10) {
			FiboNacci();
		}
	}
}
