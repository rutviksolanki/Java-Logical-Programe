// Question: Write Java Program to Find Smallest Value in Given Three Values.
package Logic_PJ;
public class SmallestValue {
	public static void main(String[] args) {
		int firstNo = 20, secondNo = 34, thirdNo = 45;
		if (firstNo < secondNo && firstNo < thirdNo) {
			System.out.println("FirstNo(" + firstNo + ") is Smallest Value 😍");
		} else if(secondNo < thirdNo){
			System.out.println("SecondNo(" + secondNo + ") is Smallest Value 😍");			
		} else {
			System.out.println("ThirdNo" + thirdNo + ") is Smallest Value 😍");			
		}
	}
}
