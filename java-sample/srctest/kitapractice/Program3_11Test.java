package kitapractice;
import java.io.*;
import kitapractice.util.StandardInputSnatcher;
import org.junit.*;
import static org.junit.Assert.*;

public class Program3_11Test {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private StandardInputSnatcher in = new StandardInputSnatcher();

	private final String GUIDANCE_MESSAGE = "Please input a month number, 1-12: ";
	private final String LN = System.lineSeparator();
	private final String JAN_MESSAGE = "0101, 0110";
	private final String FEB_MESSAGE = "0211";
	private final String MAR_MESSAGE = "0321";
	private final String APR_MESSAGE = "0429";
	private final String MAY_MESSAGE = "0503, 0504, 0505";
	private final String JUN_MESSAGE = "Nothing";
	private final String JUL_MESSAGE = "0718";
	private final String AUG_MESSAGE = "0811";
	private final String SEP_MESSAGE = "0919, 0923";
	private final String OCT_MESSAGE = "1010";
	private final String NOV_MESSAGE = "1103, 1123";
	private final String DEC_MESSAGE = "Nothing";
	
	
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
	public void testJan() throws IOException{
		String args[] = {};
		in.inputln("01");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(JAN_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testJan", expected, outContent.toString());
		
		
	}
	
	@Test
	public void testFeb() throws IOException{
		String args[] = {};
		in.inputln("02");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(FEB_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testFeb", expected, outContent.toString());
		
		
	}

	@Test
	public void testMar() throws IOException{
		String args[] = {};
		in.inputln("03");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(MAR_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testMar", expected, outContent.toString());
		
		
	}

	@Test
	public void testApr() throws IOException{
		String args[] = {};
		in.inputln("04");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(APR_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testApr", expected, outContent.toString());
		
		
	}

	@Test
	public void testMay() throws IOException{
		String args[] = {};
		in.inputln("05");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(MAY_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testMay", expected, outContent.toString());
		
		
	}

	@Test
	public void testJun() throws IOException{
		String args[] = {};
		in.inputln("06");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(JUN_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testJun", expected, outContent.toString());
		
		
	}

	@Test
	public void testJul() throws IOException{
		String args[] = {};
		in.inputln("07");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(JUL_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testJul", expected, outContent.toString());
		
		
	}

	@Test
	public void testAug() throws IOException{
		String args[] = {};
		in.inputln("08");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(AUG_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testAug", expected, outContent.toString());
		
		
	}

	@Test
	public void testSep() throws IOException{
		String args[] = {};
		in.inputln("09");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(SEP_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testSep", expected, outContent.toString());
		
		
	}

	@Test
	public void testOct() throws IOException{
		String args[] = {};
		in.inputln("10");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(OCT_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testOct", expected, outContent.toString());
		
		
	}

	@Test
	public void testNov() throws IOException{
		String args[] = {};
		in.inputln("11");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(NOV_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testNov", expected, outContent.toString());
		
		
	}

	@Test
	public void testDec() throws IOException{
		String args[] = {};
		in.inputln("12");
		Program3_11.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(GUIDANCE_MESSAGE);
		sb.append(LN);
		sb.append(DEC_MESSAGE);
		sb.append(LN);
		final String expected = sb.toString();
		
		assertEquals("testDec", expected, outContent.toString());
		
		
	}

			

}
