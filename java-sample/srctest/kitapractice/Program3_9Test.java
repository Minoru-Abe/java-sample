package kitapractice;
import java.io.*;
import static org.junit.Assert.*;
import org.junit.*;
import kitapractice.util.StandardInputSnatcher;

public class Program3_9Test {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private StandardInputSnatcher in  = new StandardInputSnatcher();
	private final String MESSAGE_OPEN = "OPEN";
	private final String MESSAGE_CLOSE = "CLOSED";
	private final String MESSAGE_DAYOFWEEK1 = "When do you visit this clinic? Please input a number as following.";
	private final String MESSAGE_DAYOFWEEK2 = "0=Sunday, 1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday";
	private final String MESSAGE_TIMEZONE1 = "Morning, Afternoon or Night?";
	private final String MESSAGE_TIMEZONE2 = "0=Morning, 1=Afternoon, 2=Night";
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
	public void testSunday0() throws IOException{
		String args[] = {};
		in.inputln("0");
		in.inputln("0");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_CLOSE);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testSunday0", expected, outContent.toString());
		
	}
	
	@Test
	public void testSunday1() throws IOException{
		String args[] = {};
		in.inputln("0");
		in.inputln("1");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_CLOSE);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testSunday1", expected, outContent.toString());
		
	}

	@Test
	public void testSunday2() throws IOException{
		String args[] = {};
		in.inputln("0");
		in.inputln("2");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_CLOSE);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testSunday2", expected, outContent.toString());
		
	}
	
	@Test
	public void testMonday0() throws IOException{
		String args[] = {};
		in.inputln("1");
		in.inputln("0");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testMonday0", expected, outContent.toString());
		
	}

	@Test
	public void testMonday1() throws IOException{
		String args[] = {};
		in.inputln("1");
		in.inputln("1");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testMonday1", expected, outContent.toString());
		
	}
	
	@Test
	public void testMonday2() throws IOException{
		String args[] = {};
		in.inputln("1");
		in.inputln("2");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testMonday2", expected, outContent.toString());
		
	}

	@Test
	public void testTuesday0() throws IOException{
		String args[] = {};
		in.inputln("2");
		in.inputln("0");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_CLOSE);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testTuesday0", expected, outContent.toString());
		
	}

	@Test
	public void testTuesday1() throws IOException{
		String args[] = {};
		in.inputln("2");
		in.inputln("1");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testTuesday1", expected, outContent.toString());
		
	}
	
	@Test
	public void testTuesday2() throws IOException{
		String args[] = {};
		in.inputln("2");
		in.inputln("2");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testTuesday2", expected, outContent.toString());
		
	}
	
	@Test
	public void testWednesday0() throws IOException{
		String args[] = {};
		in.inputln("3");
		in.inputln("0");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testWednesday0", expected, outContent.toString());
		
	}
	
	@Test
	public void testWednesday1() throws IOException{
		String args[] = {};
		in.inputln("3");
		in.inputln("1");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testWednesday1", expected, outContent.toString());
		
	}

	@Test
	public void testWednesday2() throws IOException{
		String args[] = {};
		in.inputln("3");
		in.inputln("2");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_CLOSE);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testWednesday2", expected, outContent.toString());
		
	}
	
	@Test
	public void testThursday0() throws IOException{
		String args[] = {};
		in.inputln("4");
		in.inputln("0");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testThursday0", expected, outContent.toString());
		
	}
	
	@Test
	public void testThursday1() throws IOException{
		String args[] = {};
		in.inputln("4");
		in.inputln("1");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testThursday1", expected, outContent.toString());
		
	}
	
	@Test
	public void testThursday2() throws IOException{
		String args[] = {};
		in.inputln("4");
		in.inputln("2");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testThursday2", expected, outContent.toString());
		
	}
	
	@Test
	public void testFriday0() throws IOException{
		String args[] = {};
		in.inputln("5");
		in.inputln("0");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_CLOSE);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testFriday0", expected, outContent.toString());
		
	}

	@Test
	public void testFriday1() throws IOException{
		String args[] = {};
		in.inputln("5");
		in.inputln("1");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testFriday1", expected, outContent.toString());
		
	}
	
	@Test
	public void testFriday2() throws IOException{
		String args[] = {};
		in.inputln("5");
		in.inputln("2");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testFriday2", expected, outContent.toString());
		
	}
	
	@Test
	public void testSaturday0() throws IOException{
		String args[] = {};
		in.inputln("6");
		in.inputln("0");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_OPEN);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testSaturday0", expected, outContent.toString());
		
	}
	
	@Test
	public void testSaturday1() throws IOException{
		String args[] = {};
		in.inputln("6");
		in.inputln("1");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_CLOSE);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testSaturday1", expected, outContent.toString());
		
	}
	
	@Test
	public void testSaturday2() throws IOException{
		String args[] = {};
		in.inputln("6");
		in.inputln("2");
		Program3_9.main(args);
		
		StringBuilder sb = new StringBuilder();
		sb.append(MESSAGE_DAYOFWEEK1);
		sb.append(LN);
		sb.append(MESSAGE_DAYOFWEEK2);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE1);
		sb.append(LN);
		sb.append(MESSAGE_TIMEZONE2);
		sb.append(LN);
		sb.append(MESSAGE_CLOSE);
		sb.append(LN);
		
		final String expected = sb.toString();
		
		assertEquals("testSaturday2", expected, outContent.toString());
		
	}

	
}
