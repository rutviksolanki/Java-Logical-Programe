// Question: Write Java Program Find Pairs Which Total is Equal To Given Number(User Input).
package Logic_PJ;
import java.util.Scanner;
public class FindPairesinArr {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Element");
		for (int i = 0; i < arr.length; i++) {
			System.err.print(i + 1 + ".");
			arr[i] = userInput.nextInt();
		}
		System.out.println("Enter Sum of Pairs: ");
		int givenNum = userInput.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if (arr[i] + arr[j] == givenNum) {
					System.out.print("(" + arr[i] + "," + arr[j] + ") ");
				}
			}
		}
	}
}
