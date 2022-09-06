// Question: Write Java Program to Add Element at Given Position in Array.
package Logic_PJ;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class AddEleatGivenLoc {
	public static void main(String[] args) {
		int[] givenArr = {1,2,3,4,5};
        int[] resArr = new int[givenArr.length+1];
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter Location: ");
        int index = userInput.nextInt();
        
        System.out.println("Enter Value: ");
        int value = userInput.nextInt();
  
        for (int i = 0; i < resArr.length; i++) {
			if (i == index) {
				resArr[index] = value;
				for (int j = index + 1; j < resArr.length; j++) {
					int temp = resArr[j];
					resArr[j] = givenArr[j-1];
				}
				break;
			} else {
				resArr[i] = givenArr[i];
			}
		}
        
        System.out.println("Before Addition :" + Arrays.toString(givenArr));
        System.out.println("After Addition :" + Arrays.toString(resArr));
	}
}
