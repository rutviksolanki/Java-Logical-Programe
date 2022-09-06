// Question: Write Java Program Find All Even Numbers in Array.
package Logic_PJ;
import java.util.Scanner;
public class EvenNuminArr {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Elements");
		for (int i = 0; i < arr.length; i++) {
			System.err.print(i + 1 + ".");
			arr[i] = userInput.nextInt();
		}
		System.out.print("Even Numbers: [ ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("]");
	}

}
