// Question: Write Java Program Find Missing Number in Given Array.
package Logic_PJ;
public class FindMissingNo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,8,9,10};
		int checker = 0;
		for (int i = 0; i < arr.length; i++) {
			checker++;
			if (checker == arr[i]) {
				continue;
			}else {
				System.out.print(checker);
				break;
			}
		}
	}
}
