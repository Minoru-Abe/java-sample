package kitapractice;

import java.io.*;

public class Program3_11 {
	public static void main(String args[]) throws IOException{
		System.out.println("Please input a month number, 1-12: ");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int month = Integer.parseInt(br.readLine());
		
		switch(month){
		case 1:
			System.out.println("0101, 0110");
			break;
		case 2:
			System.out.println("0211");
			break;
		case 3:
			System.out.println("0321");
			break;
		case 4:
			System.out.println("0429");
			break;
		case 5:
			System.out.println("0503, 0504, 0505");
			break;
		case 6:
			System.out.println("Nothing");
			break;
		case 7:
			System.out.println("0718");
			break;
		case 8:
			System.out.println("0811");
			break;
		case 9:
			System.out.println("0919, 0923");
			break;
		case 10:
			System.out.println("1010");
			break;
		case 11:
			System.out.println("1103, 1123");
			break;
		case 12:
			System.out.println("Nothing");
			break;
		}
		
		
	}

}
