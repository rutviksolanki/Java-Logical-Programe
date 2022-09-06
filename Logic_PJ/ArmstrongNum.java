// Question: Write Java Program to Print Armstrong Numbers.
package Logic_PJ;
public class ArmstrongNum {
	public static void main(String[] args) {
		int i=1,a,arm,n,temp;
		System.out.println("Armstrong numbers between 1 to 500 are");
		while(i<500)
		{
			n = i;
			arm = 0;
			while(n > 0)
			{
				a = n%10;
				arm = arm + (a*a*a);//153 = 1^3 + 5^3 + 3^3 = 153 = Armstrong Number
				n = n/10;
			}
			if(arm==i)
				System.out.println(i);
			i++;
		}
	}
}