// Question: Write Java Program to Find Second Highest Value in Array.
package Logic_PJ;
import java.util.Arrays;
public class SecondHighestNum {
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
		System.out.printf("Second Highest Number is: %d",arr[arr.length-2]);
	}
}