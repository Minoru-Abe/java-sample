package kitapractice;
import java.io.*;
public class Program3_7_3 {
	static private final int VERY_GOOD_SCORE = 80;
	static private final int GOOD_SCORE = 70;
	static private final int NOT_BAD_SCORE = 60;
	static private final String VERY_GOOD_MESSAGE = "VERY GOOD!!";
	static private final String GOOD_MESSAGE = "GOOD!";
	static private final String NOT_BAD_MESSAGE = "NOT BAD";
	static private final String BAD_MESSAGE = "BAD...";
	public static void main(String args[]) throws IOException{
		System.out.println("Input your test score: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testscore = Integer.parseInt(br.readLine());
		
		if (testscore >= VERY_GOOD_SCORE) {
			System.out.println(VERY_GOOD_MESSAGE);
		} else if (testscore >= GOOD_SCORE) {
			System.out.println(GOOD_MESSAGE);
		} else if (testscore >= NOT_BAD_SCORE) {
			System.out.println(NOT_BAD_MESSAGE);
		} else {
			System.out.println(BAD_MESSAGE);
		}
		
	}

}
