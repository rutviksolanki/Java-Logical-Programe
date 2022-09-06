// Question: Write Java Program to Find Sum of Array Elements.
package Logic_PJ;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class SumofArray {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Element");
		for (int i = 0; i < arr.length; i++) {
			System.err.print(i + 1 + ".");
			arr[i] = userInput.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Array(arr): " + Arrays.toString(arr));
		System.out.println("Sum of Array(arr): " + sum);
	}
}
