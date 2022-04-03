package kitapractice;

public class Program1_10 {
	public static void main(String args[]) {
		int x = 3;
		for (int i = 1; i < 4; i++) {
			int result = x;
			for (int j = 1; j < i; j++ ) {
				result *= x;
			}
			System.out.println("x^" + i + "= " + result);
		}
	}

}
