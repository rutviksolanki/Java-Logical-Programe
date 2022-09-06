// Question: Write Java Program Calculate Fahrenheit into Celsius.
package Logic_PJ;
import java.util.Scanner;
public class FahrenheittoCelsius {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Temprature in Celsius: ");
		float fahrenheit = userInput.nextInt(),celsius;
		
		celsius = (fahrenheit - 32) * 5/9;
		System.out.println(celsius);
	}
}
