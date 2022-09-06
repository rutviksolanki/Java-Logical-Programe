// Question: Write Java Program to Calculate The Sum Of Digit Which is Remaining in Given String.
package Logic_PJ;
public class SumofIntinString {
	public static void main(String[] args) {
		int sum=0;
		String givenString = "jklmn489pjro635ops";
		for(int i=0; i<givenString.length(); i++) {
		    if (Character.isDigit(givenString.charAt(i))) {
		        int b = Integer.parseInt(String.valueOf(givenString.charAt(i)));
		        sum=sum+b;
		    }
		}
		System.out.println(sum);
	}
}
