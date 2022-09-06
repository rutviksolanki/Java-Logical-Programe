// Question: Write Java Program to do Right Rotation in Given Array.
package Logic_PJ;
import java.util.Arrays;
import java.util.Scanner;
public class RughtRotation {
	public static void main(String[] args) {
		//Initialization
		int[] arr = new int[5];
		int sum = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Element:");
		//Add Elements in Array
		for (int i = 0; i < arr.length; i++) {
			System.err.print(i + 1 + ".");
			arr[i] = userInput.nextInt();
		}
		System.out.println("Enter Rotation Count: ");
		int rotationCount = userInput.nextInt();
		//Swap Values
		for (int outer = 0; outer < rotationCount; outer++) {
			//int lastEle = arr[arr.length-1];
			for (int inner = arr.length-1; inner > 0; inner--) {
				int temp = arr[inner];
				arr[inner] = arr[inner-1];
				arr[inner-1] = temp;
			}
			//arr[0] = lastEle;
		}
		System.out.print(Arrays.toString(arr));
	}
}
