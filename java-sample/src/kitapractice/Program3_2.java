package kitapractice;
import java.io.*;

public class Program3_2 {
	public static void main(String args[]) throws IOException{
		System.out.println("Please input number x: ");
		BufferedReader br1 = new BufferedReader( new InputStreamReader(System.in) );
		int x = Integer.parseInt(br1.readLine());
		System.out.println("Please input number y: ");
		BufferedReader br2 = new BufferedReader( new InputStreamReader(System.in) );
		int y = Integer.parseInt(br2.readLine());
		
		if ( x > y ) {
			System.out.println("x is larger than y. The value is: " + x);
		}
		else if ( x < y ) {
			System.out.println("y is larger than x. The value is: " + y);
		}
		else {
			System.out.println("x is equal to y. The value is: " + x);
		}
		
	}

}
