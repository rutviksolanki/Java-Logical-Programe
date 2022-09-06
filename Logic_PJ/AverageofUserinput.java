// Question: Write Java Program to Find Average Value of an Array(User Input).
package Logic_PJ;
import java.util.Arrays;
import java.util.Scanner;
public class AverageofUserinput {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		float sum = 0;
		Scanner userInput = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			int counter = i + 1;
			System.out.println("Enter Number " + counter);
			numbers[i] = userInput.nextInt();
		}
		System.out.println("Array " + Arrays.toString(numbers));
		
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		float average = sum / numbers.length;
		System.out.println("Average of Array is: " + average);
	}
}
