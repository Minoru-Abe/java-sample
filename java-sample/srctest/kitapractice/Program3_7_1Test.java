package kitapractice;

import kitapractice.util.StandardInputSnatcher;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class Program3_7_1Test {
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
	public void cleanupStreams() {
		System.setOut(System.out);
		System.setErr(System.err);
		System.setIn(System.in);
	}
	
	@Test
	public void testPassAtBoarder() throws IOException{
		String args[] = {};
		in.inputln("60");
		Program3_7_1.main(args);
		
		StringBuilder sb = new StringBuilder();
		String ln = System.lineSeparator();
		
		sb.append("Please input your test score: ");
		sb.append(ln);
		sb.append("PASSED.");
		sb.append(ln);
		
		final String expected = sb.toString();
		
		assertEquals("PassAtBoarder.", expected, outContent.toString());
		
		
		
	}
	
	@Test
	public void testPassOverBoarder() throws IOException{
		String args[] = {};
		in.inputln("61");
		Program3_7_1.main(args);
		
		StringBuilder sb = new StringBuilder();
		String ln = System.lineSeparator();
		
		sb.append("Please input your test score: ");
		sb.append(ln);
		sb.append("PASSED.");
		sb.append(ln);
		
		final String expected = sb.toString();
		
		assertEquals("PassOverBoarder.", expected, outContent.toString());
		
		
		
	}	
	
	@Test
	public void testFailAtBoarder() throws IOException{
		String args[] = {};
		in.inputln("59");
		Program3_7_1.main(args);
		
		StringBuilder sb = new StringBuilder();
		String ln = System.lineSeparator();
		
		sb.append("Please input your test score: ");
		sb.append(ln);
		sb.append("FAILED.");
		sb.append(ln);
		
		final String expected = sb.toString();
		
		assertEquals("FailAtBoarder.", expected, outContent.toString());
		
		
		
	}

	@Test
	public void testFailOverBoarder() throws IOException{
		String args[] = {};
		in.inputln("58");
		Program3_7_1.main(args);
		
		StringBuilder sb = new StringBuilder();
		String ln = System.lineSeparator();
		
		sb.append("Please input your test score: ");
		sb.append(ln);
		sb.append("FAILED.");
		sb.append(ln);
		
		final String expected = sb.toString();
		
		assertEquals("PassAtBoarder.", expected, outContent.toString());
		
		
		
	}
}
