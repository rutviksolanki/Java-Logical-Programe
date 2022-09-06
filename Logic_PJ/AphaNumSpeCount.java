// Question: Write Java Program to Find Number of Alphabet, Numbers & Special Character.
package Logic_PJ;
public class AphaNumSpeCount {
	public static void main(String[] args) {
		String givenStr = "rutviksolanki102@gmail.com";
		int alphaCount,numberCount,scharCount;
		alphaCount = numberCount = scharCount = 0;
		
		for (int i = 0; i < givenStr.length(); i++) {
			if ((givenStr.charAt(i) >= 'a' && givenStr.charAt(i) <= 'z') || (givenStr.charAt(i) >= 'A' && givenStr.charAt(i) <= 'Z')) {
				alphaCount++;
			}else if((givenStr.charAt(i) >= '0' && givenStr.charAt(i) <= '9')) {
				numberCount++;
			}else {
				scharCount++;
			}
		}
		System.out.printf("Alphabet Count: %d \nNumeric Count: %d \nSpecial Chacter Count: %d",alphaCount,numberCount,scharCount);
	}
}