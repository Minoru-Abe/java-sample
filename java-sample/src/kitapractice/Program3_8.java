package kitapractice;
import java.io.*;


public class Program3_8 {
	public static void main(String args[]) throws IOException{
		
		final int SINGLE_PASS_SCORE = 60;
		final int TOTAL_PASS_SCORE = 130;
		final int LIMITED_SINGLE_PASS_SCORE = 90;
		final int LIMITED_TOTAL_PASS_SCORE = 100;
		
		System.out.println("Please input your intermediate examination score: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int intermediate_score = Integer.parseInt(br.readLine());
		
		
		System.out.println("Please input your final examination score: ");
		int final_score = Integer.parseInt(br.readLine());
		
		if (intermediate_score >= SINGLE_PASS_SCORE && final_score >= SINGLE_PASS_SCORE) {
			System.out.println("PASSED");
		} else if ( (intermediate_score + final_score) >= TOTAL_PASS_SCORE) {
			System.out.println("PASSED");
		} else if ( (intermediate_score + final_score) >= LIMITED_TOTAL_PASS_SCORE) {
			if (intermediate_score >= LIMITED_SINGLE_PASS_SCORE || final_score >= LIMITED_SINGLE_PASS_SCORE) {
				System.out.println("PASSED");
			} else {
				System.out.println("FAILED");
			}
		} else {
			System.out.println("FAILED");
		}
	}

}
