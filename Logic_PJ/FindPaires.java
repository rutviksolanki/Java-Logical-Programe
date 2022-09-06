// Question: Write Java Program Find Pairs Which Total is Equal To Given Number.
package Logic_PJ;
import java.util.Iterator;
public class FindPaires {
	public static void main(String[] args) {
		int[] arr = {1,5,3,3,4,2,9,8,7};
		int givenNum = 6;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if (arr[i] + arr[j] == givenNum)
					System.out.print("(" + arr[i] + "," + arr[j] + ") ");
			}
		}
	}
}
