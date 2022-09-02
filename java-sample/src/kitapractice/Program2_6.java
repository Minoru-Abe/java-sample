package kitapractice;
import java.io.*;
public class Program2_6 {
	public static void main(String args[]) throws IOException{
		System.out.print("How old are you? Input your age:");
		BufferedReader ageBr = new BufferedReader( new InputStreamReader (System.in) );
		int age = Integer.parseInt (ageBr.readLine());
		
		System.out.println("Your living days is about: " + age*365);
		
	}
	
	

}
