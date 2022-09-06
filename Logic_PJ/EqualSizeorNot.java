// Question: Write Java Program Check Given Two Arrays Has Equal Length or Not.
package Logic_PJ;
public class EqualSizeorNot {
	public static void main(String[] args) {
		int[] firstArr = {1, 4, 3, 5, 6};
        int[] secondArr = {4, 1, 5, 3, 8};
        
        if (firstArr.length != secondArr.length) {
        	System.out.printf("Not Equal in Size \nfirstArr Size: %d secondArr Size: %d",firstArr.length,secondArr.length );
		}else {
			System.out.printf("Equal in Size \nfirstArr Size: %d secondArr Size: %d",firstArr.length,secondArr.length );
		}
	}
}
