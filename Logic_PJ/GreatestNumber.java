// Question: Write Java Program Find Highest Number in Given Three Numbers.
package Logic_PJ;
import java.util.Scanner;
public class GreatestNumber {
	public static void main(String[] args) {
		GreatestNumber gr = new GreatestNumber();
		//gr.GretestNum();
		gr.GreaterNumber();
	}
	//FIRST WAY
	public void GreaterNumber() {
		int firstNo = 20,secondNo = 30,thirdNo = 10;
		if (firstNo > secondNo && firstNo > thirdNo) {
			System.out.println("First Number(" + firstNo + ") is Gretest Number");
		}else if(secondNo > thirdNo){
			System.out.println("Second Number(" + secondNo + ") is Gretest Number");
		}else {
			System.out.println("Third Number(" + thirdNo + ") is Gretest Number");
		}
	}
	//SECOND WAY
	public void GretestNum() {
		Scanner userInput = new Scanner(System.in);
		int[] myNums = new int[3];
		int sum = 0;
		for (int i = 0;i < myNums.length;i++) {
			int counter = i + 1;
            System.out.println("Enter Number:" + counter);
            myNums[i] = userInput.nextInt();
            //sum = sum + myNums[i];
        }
		int minNum = myNums[0],maxNum = myNums[myNums.length - 1];
		for (int i = 0; i < myNums.length; i++) {
			minNum = Math.min(minNum, myNums[i]);
		}
		for (int i = 0; i < myNums.length; i++) {
			maxNum = Math.max(maxNum, myNums[i]);
		}
		System.out.println("Min Value is " + minNum);
		System.out.println("Max Value is " + maxNum);
	}
}