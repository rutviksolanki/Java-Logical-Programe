// Question: Write Java Program Add Two Numbers Without Using Arithmetic Operation. 
package Logic_PJ;
import java.util.concurrent.atomic.AtomicInteger;
public class AddTwoNum {
	public static void main(String[] args) {
		AddTwoNum an = new AddTwoNum();
		System.out.println(an.add(12, 24));
	}
	public static int add(int a, int b) {
		return (int)(new AtomicInteger(a)).addAndGet(b);
		//return a \u002b b;
	}
}