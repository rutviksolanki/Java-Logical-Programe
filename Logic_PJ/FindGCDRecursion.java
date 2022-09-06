// Question: Write Java Program Find GCD/HCF of Given Two Numbers Using Recursion.
package Logic_PJ;
import java.util.Scanner;
public class FindGCDRecursion {
	public static void main(String[] args) {
		int n1 = 366, n2 = 60;
        int hcf = findGCD(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
	}
	public static int findGCD(int n1 , int n2) {
		    if (n2 != 0)
	            return findGCD(n2, n1 % n2);
	        else
	            return n1;
	}
}
