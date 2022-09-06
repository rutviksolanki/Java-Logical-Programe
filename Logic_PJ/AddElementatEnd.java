// Question: Write Java Program to Add Element at End Position in Array.
package Logic_PJ;
import java.util.Scanner;
public class AddElementatEnd {
	public static void main(String[] args) {
		String[] firstArr = {"Rutvik","Rudra"};
		String[] resArr = new String[firstArr.length + 1];		
		for (int i = 0; i < firstArr.length; i++) {
			resArr[i] = firstArr[i];
		}
		Scanner userInput = new Scanner(System.in);
		System.out.println("Insert Element at End of Array: ");
		resArr[resArr.length-1] = userInput.next();
		System.out.print("Output: [ ");
		for (String ele : resArr) {
			System.out.print(ele + " ");
		}
		System.out.print("]");
	}
}