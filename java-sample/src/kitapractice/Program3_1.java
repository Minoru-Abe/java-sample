package kitapractice;
import java.io.*;
public class Program3_1 {
	public static void main(String args[]) throws IOException{
		System.out.println("Please input number x: ");
		BufferedReader br1 = new BufferedReader( new InputStreamReader(System.in) );
		int x = Integer.parseInt(br1.readLine());
		System.out.println("Please input number y: ");
		BufferedReader br2 = new BufferedReader( new InputStreamReader(System.in) );
		int y = Integer.parseInt(br2.readLine());
		
		if (x > y) {
			System.out.println("Inputed x number is greater than y.");
		}
		
		
	}

}
