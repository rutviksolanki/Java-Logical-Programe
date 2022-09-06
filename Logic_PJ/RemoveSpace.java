// Question: Write Java Program to Remove Space in Given String.
package Logic_PJ;
public class RemoveSpace {
	public static void main(String[] args) {
		String givenString = "   Hi I'  m Rutvik     Solanki    ";
		String resString = givenString.replaceAll("\\s", "");
		System.out.print("Without Space: " + resString);
	}
}
