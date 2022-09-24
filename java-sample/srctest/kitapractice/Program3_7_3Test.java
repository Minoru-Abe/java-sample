package kitapractice;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
import kitapractice.util.StandardInputSnatcher;

public class Program3_7_3Test {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private StandardInputSnatcher in = new StandardInputSnatcher();
	private final String INPUT_MESSAGE = "Input your test score: ";
	private final String VERY_GOOD_MESSAGE = "VERY GOOD!!";
	private final String GOOD_MESSAGE = "GOOD!";
	private final String NOT_BAD_MESSAGE = "NOT BAD";
	private final String BAD_MESSAGE = "BAD...";
	private final String LN = System.lineSeparator();
	
	@Before
	public void setupStream() {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
		System.setIn(in);
	}
	
	@After
	public void cleanupStream() {
		System.setOut(System.out);
		System.setErr(System.err);
		System.setIn(System.in);
	}
	
	@Test
	public void testVeryGoodOnBoarder() throws IOException{
		String args[] = {};
		in.inputln("80");
		Program3_7_3.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(VERY_GOOD_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Very good on boarder.", expected, outContent.toString());
	}

	@Test
	public void testVeryGoodOverBoarder() throws IOException{
		String args[] = {};
		in.inputln("81");
		Program3_7_3.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(VERY_GOOD_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Very good over boarder.", expected, outContent.toString());
	}

	@Test
	public void testGoodOnBoarder() throws IOException{
		String args[] = {};
		in.inputln("70");
		Program3_7_3.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(GOOD_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Good on boarder.", expected, outContent.toString());
	}

	@Test
	public void testGoodOverDownwardBoarder() throws IOException{
		String args[] = {};
		in.inputln("71");
		Program3_7_3.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(GOOD_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Good over downward boarder.", expected, outContent.toString());
	}
	@Test
	public void testGoodOverUpwardBoarder() throws IOException{
		String args[] = {};
		in.inputln("79");
		Program3_7_3.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(GOOD_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Good over upward boarder.", expected, outContent.toString());
	}

	@Test
	public void testNotBadOnBoarder() throws IOException{
		String args[] = {};
		in.inputln("60");
		Program3_7_3.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(NOT_BAD_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Not bad on boarder.", expected, outContent.toString());
	}
	@Test
	public void testNotBadOverDownwardBoarder() throws IOException{
		String args[] = {};
		in.inputln("61");
		Program3_7_3.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(NOT_BAD_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Not bad over downward boarder.", expected, outContent.toString());
	}
	@Test
	public void testNotBadOverUpwardBoarder() throws IOException{
		String args[] = {};
		in.inputln("69");
		Program3_7_3.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(NOT_BAD_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Not bad over upward boarder.", expected, outContent.toString());
	}

	@Test
	public void testBadOnBoarder() throws IOException{
		String args[] = {};
		in.inputln("59");
		Program3_7_3.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(BAD_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Bad on boarder.", expected, outContent.toString());
	}

	@Test
	public void testBadOverBoarder() throws IOException{
		String args[] = {};
		in.inputln("58");
		Program3_7_3.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INPUT_MESSAGE);
		sb.append(LN);
		sb.append(BAD_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("Bad over boarder.", expected, outContent.toString());
	}

}
