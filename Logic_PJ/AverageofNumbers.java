// Question: Write Java Program to Find Average Value of an Array.
package Logic_PJ;
public class AverageofNumbers {
	public static void main(String[] args) {
		int[] numbers = {99,98,96,97,84};
		float sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		float average = sum / (numbers.length);
		System.out.println("The Average of Integer Array is: " + average);
	}
}
