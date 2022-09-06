// Question: Write Java Program to Find Power of Given Number.
package Logic_PJ;
public class powerofNumber {
	public static void main(String[] args) {
		int base = 2,ans = 1;
		int power = 3,loop = power;
		while (loop != 0) {
			ans = ans * base;
			loop--;
		}
		System.out.println(base + "^" + power + " = " + ans);
	}
}
