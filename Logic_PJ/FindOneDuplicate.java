// Question: Write Java Program Find Duplicate Value in Given Array.
package Logic_PJ;
public class FindOneDuplicate {
	public static void main(String[] args) {
		int[] arr = {1,3,3,4,4,5,2,9,8,7};
		boolean isDone = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if (arr[i] == arr[j] && !isDone) {
					System.out.print(arr[i]);
					isDone = true;
				}
			}
		}
	}

}
