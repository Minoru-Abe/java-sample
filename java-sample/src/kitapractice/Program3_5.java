package kitapractice;
import java.io.*;

public class Program3_5 {
	public static void main(String args[]) throws IOException{
		System.out.println("Please input number: ");
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int x = Integer.parseInt(br.readLine());
		if ( (x % 2) == 0 ) {
			System.out.println("Inputed number is an even number.");
		}
		else {
			System.out.println("Inputed number is an odd number.");
		}
	}

}
