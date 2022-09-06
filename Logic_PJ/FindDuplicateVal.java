// Question: Write Java Program Find Duplicate Values in Array.
package Logic_PJ;
public class FindDuplicateVal {
	public static void main(String[] args) {
	 	int[] a = {1,2,2,3,3,4,5};
		int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k]) {
                    count++;
                }
            }
            if(count==1)
               System.out.println(a[j]);
            count = 0;
        }
	}

}