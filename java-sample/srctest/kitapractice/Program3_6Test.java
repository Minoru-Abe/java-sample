package kitapractice;

import kitapractice.util.StandardInputSnatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.*;

public class Program3_6Test{
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private StandardInputSnatcher in = new StandardInputSnatcher();
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
		System.setIn(in);
	}
	
	@After
	public void cleanUpStreams() {
		System.setOut(System.out);
		System.setErr(System.err);
		System.setIn(System.in);
	}
	
	@Test
	public void testPositiveEven() throws IOException{
		String[] args = {};
		in.inputln("2");
		Program3_6.main(args);
		
		StringBuilder sb = new StringBuilder();
		String ln = System.lineSeparator();
		
		sb.append("Please input number X: ");
		sb.append(ln);
		sb.append("X is a positive even number.");
		sb.append(ln);
		
		final String expected = sb.toString();
		
		assertEquals("X is a positive even number.", expected, outContent.toString());
	}

	@Test
	public void testPositiveOdd() throws IOException{
		String[] args = {};
		in.inputln("5");
		Program3_6.main(args);
		
		StringBuilder sb = new StringBuilder();
		String ln = System.lineSeparator();
		
		sb.append("Please input number X: ");
		sb.append(ln);
		sb.append("X is a positive odd number.");
		sb.append(ln);
		
		final String expected = sb.toString();
		
		assertEquals("X is a positive odd number.", expected, outContent.toString());
	}

	@Test
	public void testNegativeEven() throws IOException{
		String[] args = {};
		in.inputln("-8");
		Program3_6.main(args);
		
		StringBuilder sb = new StringBuilder();
		String ln = System.lineSeparator();
		
		sb.append("Please input number X: ");
		sb.append(ln);
		sb.append("X is a negative even number.");
		sb.append(ln);
		
		final String expected = sb.toString();
		
		assertEquals("X is a negative even number.", expected, outContent.toString());
	}

	@Test
	public void testNegativeOdd() throws IOException{
		String[] args = {};
		in.inputln("-9");
		Program3_6.main(args);
		
		StringBuilder sb = new StringBuilder();
		String ln = System.lineSeparator();
		
		sb.append("Please input number X: ");
		sb.append(ln);
		sb.append("X is a negative odd number.");
		sb.append(ln);
		
		final String expected = sb.toString();
		
		assertEquals("X is a negative odd number.", expected, outContent.toString());
	}

}
