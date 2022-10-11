package kitapractice;
import java.io.*;

public class Program3_9 {
	public static void main(String args[]) throws IOException{
		final String MESSAGE_OPEN = "OPEN";
		final String MESSAGE_CLOSE = "CLOSED";
		System.out.println("When do you visit this clinic? Please input a number as following.");
		System.out.println("0=Sunday, 1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int day_of_week = Integer.parseInt(br.readLine());
		
		System.out.println("Morning, Afternoon or Night?");
		System.out.println("0=Morning, 1=Afternoon, 2=Night");
		int  timezone = Integer.parseInt(br.readLine());
		
		if ( day_of_week == 0 ) {
			System.out.println(MESSAGE_CLOSE);
		} else if (day_of_week == 1 || day_of_week == 4) {
			System.out.println(MESSAGE_OPEN);
		} else if (day_of_week == 2 || day_of_week == 5) {
			if (timezone == 0) {
				System.out.println(MESSAGE_CLOSE);
			} else {
				System.out.println(MESSAGE_OPEN);
			}
		} else if (day_of_week == 3) {
			if (timezone == 2) {
				System.out.println(MESSAGE_CLOSE);
			} else {
				System.out.println(MESSAGE_OPEN);
			}
		} else if (day_of_week == 6) {
			if (timezone == 0) {
				System.out.println(MESSAGE_OPEN);
			} else {
				System.out.println(MESSAGE_CLOSE);
			}
		}
	}

}
