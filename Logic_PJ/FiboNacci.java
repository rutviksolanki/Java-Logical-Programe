// Question: Write Java Program Print Fibonacci Series.
package Logic_PJ;
public class FiboNacci {
	public static void main(String[] args) {
		int n1 = 0,n2 = 1,n3;
		System.out.println(n1 + "\n" + n2);
		for (int i = 0; i <= 10; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
	}
}