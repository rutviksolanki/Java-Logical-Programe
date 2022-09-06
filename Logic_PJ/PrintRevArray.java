// Question: Write Java Program Print Array in Reverse Order.
package Logic_PJ;
import java.util.Arrays;
public class PrintRevArray {
	public static void main(String[] args) {
		int[] arr = {1,5,4,3,2,6,8,7,9};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}