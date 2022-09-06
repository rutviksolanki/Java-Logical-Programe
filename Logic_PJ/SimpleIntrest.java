// Question: Write Java Program to Find Simple Interest.
package Logic_PJ;
import java.util.Scanner;
public class SimpleIntrest {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Price Money: ");
		float Price = userInput.nextFloat();
		
		System.out.println("Enter Rate of Intrest: ");
		float Rate = userInput.nextFloat();
		
		System.out.println("Enter Time Limit: ");
		float Time = userInput.nextFloat();
		
		float SimpleIntrest = (Price * Rate * Time) / 100;
		System.out.println("Simple Intrest is: " + SimpleIntrest);
		
	}
}