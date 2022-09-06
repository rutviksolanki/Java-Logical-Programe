// Question: Write Java Program Delete Element at Given Location.
package Logic_PJ;
import java.util.Arrays;
import java.util.Scanner;
public class DeleteAnyEle {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
        int[] arr_new = new int[arr.length-1];
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Location: ");
        int j = userInput.nextInt();
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr_new));
	}
}
