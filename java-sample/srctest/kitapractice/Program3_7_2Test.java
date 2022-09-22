package kitapractice;
import kitapractice.util.*;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

public class Program3_7_2Test {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private StandardInputSnatcher in = new StandardInputSnatcher();
	private final String INPUT_MESSAGE = "Input your test score: ";
	private final String LN = System.lineSeparator();
	private final String VERYGOOD = "VERY GOOD!!";
	private final String GOOD = "GOOD!";
	private final String FAILED = "FAILED...";
	
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
	public void testVeryGoodScoreOnBoader() throws IOException{
		String args[] = {};
		in.inputln("80");
		Program3_7_2.main(args);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(VERYGOOD);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("Check very good on boarder", expected, outContent.toString());
		
	}
	
	@Test
	public void testVeriGoodScoreOverBoarder() throws IOException {
		String args[] = {};
		in.inputln("81");
		Program3_7_2.main(args);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(VERYGOOD);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Check very good over boader", expected, outContent.toString());
	}
	
	@Test
	public void testGoodScoreOnBoarder() throws IOException {
		String args[] = {};
		in.inputln("60");
		Program3_7_2.main(args);
		
		StringBuilder sb = new StringBuilder();

		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(GOOD);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Check good on boarder", expected, outContent.toString());
	}
	
	@Test
	public void testGoodScoreOverBoarder() throws IOException {
		String args[] = {};
		in.inputln("79");
		Program3_7_2.main(args);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(GOOD);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Check good over boarder", expected, outContent.toString());
		
	}
	
	@Test
	public void testFailed() throws IOException{
		String args[] = {};
		in.inputln("59");
		Program3_7_2.main(args);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(FAILED);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("Check failed", expected, outContent.toString());
		
	}

}
