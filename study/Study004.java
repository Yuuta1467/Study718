package study;

public class Study004 {

	public static void main(String[] args) {

		int n[] = new int[20];
		int x = 0;

		for (int i = 0; i < n.length; i++) {
			x = i * 5;
			System.out.print(" " + x);
			if (x % 2 == 1 && i <= 10) {
				System.out.print(",");
			} else if (x % 2 == 0 && i > 10) {
				System.out.print(",");
			}
		}

	}
}