package kitapractice;
import java.io.*;
public class Program3_6 {
	public static void main(String args[]) throws IOException{
		System.out.println("Please input number X: ");
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br1.readLine());
		
		if ( x % 2 == 0 ) {
			if ( x < 0 ) {
				System.out.println("X is a negative even number.");
			} else {
				System.out.println("X is a positive even number.");
			}
		} else {
			if ( x < 0 ) {
				System.out.println("X is a negative odd number.");
			} else {
				System.out.println("X is a positive odd number.");
			}
		}
	}
}

