// Question: Write Java Program Compare Two Arrays and Find Missing Number.
package Logic_PJ;
public class CompareTwoarrmisingNum {
	public static void main(String[] args) {
		findMissingNumber();
    }
	private static void findMissingNumber() {
		int[] firstArr = {1, 4, 3, 5, 6};
        int[] secondArr = {4, 1, 5, 3};
        for (int i : firstArr) {
			if (!isPresent(i,secondArr)) {
				System.out.print(i);
			}
		}
	}
	private static boolean isPresent(int i, int[] secondArr) {
		for (int j : secondArr) {
			if (j == i) {
				return true;
			}
		}
		return false;
	}
}
