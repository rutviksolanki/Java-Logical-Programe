// Question: Write Java Program Calculate Celsius into Fahrenheit.     
package Logic_PJ;

import java.awt.Taskbar.Feature;
import java.util.Scanner;

public class CelsiustoFahrenheit {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Any One Number: ");
		float celsius = userInput.nextInt(),fahrenheit;
		
		fahrenheit =  (celsius * 9/5) + 32;
		System.out.println(fahrenheit);
	}
}
