// Question: Write Java Program Find Largest & Smallest Number in Given Array.
package Logic_PJ;
import java.util.Iterator;
public class LargestAndSmallestNum {
	public static void main(String[] args) {
		int[] arr = {1,2,5,4,6,7,9,8,10};
		int minVal = arr[0];
		int maxVal = arr[arr.length-1];
		for (int i = 0; i < arr.length; i++) {
			minVal = Math.min(minVal, arr[i]);
			maxVal = Math.max(maxVal, arr[i]);
		}
		System.out.printf("Max Value: %d \nMin Value: %d",minVal,maxVal);
	}
}
