// Question: Write Java Program to Find Sum Of Digit of Number.
package Logic_PJ;
import java.util.Iterator;

public class SumofDigitofNum {
	public static void main(String[] args) {
		SumofDigitofNum sd = new SumofDigitofNum();
		sd.sumOfDigit();
	}
	public void sumOfDigit() {
		int myNum = 1234, sum = 0;
		while (myNum > 0) {
			int temp = myNum % 10;
			sum = sum + temp;
			myNum = myNum / 10;
		}
		System.out.println("Sum Of Digit Of Number Is " + sum);
	}
}
