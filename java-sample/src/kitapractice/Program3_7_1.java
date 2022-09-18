package kitapractice;
import java.io.*;

public class Program3_7_1 {
	public static void main(String args[]) throws IOException{
		final int PASS_SCORE = 60;
		System.out.println("Please input your test score: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testscore = Integer.parseInt(br.readLine());
		if (testscore >= PASS_SCORE ) {
			System.out.println("PASSED.");
		} else {
			System.out.println("FAILED.");
		}
	}

}
