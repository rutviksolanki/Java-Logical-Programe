// Question: Write Java Program Find Year Leap or Not.
package Logic_PJ;
import java.util.Scanner;
public class LeapYearorNot {
	public static void main(String[] args) {
		boolean isLeapyear = false;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any One Year: ");
		int year = userInput.nextInt();
		if (year % 400 == 0) {
			isLeapyear = true;
		} else if(year % 100 == 0){
			isLeapyear = false;
		} else if(year % 4 == 0){
			isLeapyear = true;
		} else {
			isLeapyear = false;			
		}
		if (isLeapyear) {
			System.out.println(year + " is Leap Year");
		} else {
			System.out.println(year + " is Not Leap Year");
		}
	}
}
