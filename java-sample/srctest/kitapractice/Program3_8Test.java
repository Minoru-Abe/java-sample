package kitapractice;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
import kitapractice.util.StandardInputSnatcher;


public class Program3_8Test {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private StandardInputSnatcher in = new StandardInputSnatcher();
	private final String PASSED_MESSAGE = "PASSED";
	private final String FAILED_MESSAGE = "FAILED";
	private final String INTERMEDIATE_MESSAGE = "Please input your intermediate examination score: ";
	private final String FINAL_MESSAGE = "Please input your final examination score: ";
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
	public void testBothOver60OnBoarder() throws IOException{
		String args[] = {};
		in.inputln("60");
		in.inputln("60");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(PASSED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("BothOver60OnBoarder", expected, outContent.toString());
	}

	@Test
	public void testBothOver60OneSideOverBoarder() throws IOException{
		String args[] = {};
		in.inputln("61");
		in.inputln("60");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(PASSED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("BothOver60OneSideOverBoarder", expected, outContent.toString());
	}

	@Test
	public void testBothOver60OneSideOverBoarder2() throws IOException{
		String args[] = {};
		in.inputln("60");
		in.inputln("61");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(PASSED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("BothOver60OneSideOverBoarder2", expected, outContent.toString());
	}
	
	@Test
	public void testBothOver60BothSideOverBoarder() throws IOException{
		String args[] = {};
		in.inputln("61");
		in.inputln("61");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(PASSED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("BothOver60BothSideOverBoarder",expected,outContent.toString());
	}
	
	@Test
	public void testBothOver60BothSideUnderBoarder() throws IOException{
		String args[] = {};
		in.inputln("59");
		in.inputln("59");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(FAILED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("BothOver60BothSideUnderBoarder",expected,outContent.toString());
	}
	
	@Test
	public void testBothOver60OneSideUnderBoarder() throws IOException{
		String args[] = {};
		in.inputln("60");
		in.inputln("59");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(FAILED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("BothOver60OneSideUnderBoarder",expected,outContent.toString());
	}

	@Test
	public void testTotalOver130OnBoarder() throws IOException{
		String args[] = {};
		in.inputln("80");
		in.inputln("50");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(PASSED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("TotalOver130OnBoarder",expected,outContent.toString());
	}
	@Test
	public void testTotalUnder130OnBoarder() throws IOException{
		String args[] = {};
		in.inputln("79");
		in.inputln("50");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(FAILED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("TotalUnder130OnBoarder",expected,outContent.toString());
	}
	@Test
	public void testTotalOver100OnBoarder1() throws IOException{
		String args[] = {};
		in.inputln("90");
		in.inputln("10");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(PASSED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("TotalOver100OnBoarder1",expected,outContent.toString());
	}
	@Test
	public void testTotalOver100OnBoarder2() throws IOException{
		String args[] = {};
		in.inputln("10");
		in.inputln("90");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(PASSED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("TotalOver100OnBoarder2",expected,outContent.toString());
	}
	@Test
	public void testTotalUnder100OnBoarder1() throws IOException{
		String args[] = {};
		in.inputln("11");
		in.inputln("89");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(FAILED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("TotalUnder100OnBoarder1",expected,outContent.toString());
	}
	@Test
	public void testTotalUnder100OnBoarder2() throws IOException{
		String args[] = {};
		in.inputln("89");
		in.inputln("11");
		Program3_8.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(INTERMEDIATE_MESSAGE);
		sb.append(LN);
		sb.append(FINAL_MESSAGE);
		sb.append(LN);
		sb.append(FAILED_MESSAGE);
		sb.append(LN);
		
		final String expected = sb.toString();
		assertEquals("TotalUnder100OnBoarder2",expected,outContent.toString());
	}

}
