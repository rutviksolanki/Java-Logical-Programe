// Question: Write Java Program to Replace Specific Character.
package Logic_PJ;
public class ReplaceSpacetoChar {
	public static void main(String[] args) {
		String para = "Hi I'm Full Stack Developer?";
		System.out.println(para);
		char repChar = '.';
		para = para.replace('?', repChar); 
		System.out.println(para);
	}
}
