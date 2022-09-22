package kitapractice;
import java.io.*;

public class Program3_7_2 {
	private static int VERY_GOOD_SCORE = 80;
	private static int GOOD_SCORE = 60;
	public static void main(String args[]) throws IOException{
		System.out.println("Input your test score: ");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int testscore = Integer.parseInt(br.readLine());
		
		if ( testscore >= VERY_GOOD_SCORE ) {
			System.out.println("VERY GOOD!!");
		} else if ( testscore < VERY_GOOD_SCORE && testscore >= GOOD_SCORE) {
			System.out.println("GOOD!");
		} else {
			System.out.println("FAILED...");
		}
		
	}

}
