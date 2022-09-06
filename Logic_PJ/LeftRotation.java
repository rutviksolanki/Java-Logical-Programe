// Question: Write Java Program to do Left Rotation in Given Array. 
package Logic_PJ;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class LeftRotation {
	public static void main(String[] args) {
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
		for (int i = 0; i < rotationCount; i++) {
			for (int inner = 0; inner < arr.length-1; inner++) {
				int temp = arr[inner+1]; 
				arr[inner+1] = arr[inner];
				arr[inner] = temp;
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}
