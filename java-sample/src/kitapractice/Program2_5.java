package kitapractice;
import java.io.*;

public class Program2_5 {
	public static void main(String args[]) throws IOException{
		BufferedReader br1 = new BufferedReader ( new InputStreamReader(System.in ));
		BufferedReader br2 = new BufferedReader ( new InputStreamReader(System.in ));
		int n1 = Integer.parseInt(br1.readLine());
		int n2 = Integer.parseInt(br2.readLine());
		System.out.println ( (n1 + n2) / 2);
		
	}

}
