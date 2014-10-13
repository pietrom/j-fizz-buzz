import static org.junit.Assert.*;

import org.junit.Test;


public class SuperFizzBuzzTest {
	@Test
	public void customStartAndStop() throws Exception {
		final String result = new FizzBuzz().buildOutput(10, 50);
		final String[] items = result.split(" ");
		assertEquals(41, items.length);
		assertEquals("Buzz", items[0]);
		assertEquals("11", items[1]);
		assertEquals("Fizz", items[2]);
		assertEquals("49", items[39]);
		assertEquals("Buzz", items[40]);
	}
	
	@Test
	public void customTestValues() throws Exception {
		final String result = new FizzBuzz(2, 7).buildOutput(10, 50);
		final String[] items = result.split(" ");
		assertEquals(41, items.length);
		assertEquals("Fizz", items[0]);
		assertEquals("11", items[1]);
		assertEquals("Fizz", items[2]);
		assertEquals("43", items[33]);
		assertEquals("Buzz", items[39]);
		assertEquals("Fizz", items[40]);
	}
	
	@Test
	public void customOutputStrings() throws Exception {
		final String result = new FizzBuzz("Foo", "Bar").buildOutput(10, 50);
		final String[] items = result.split(" ");
		assertEquals(41, items.length);
		assertEquals("Bar", items[0]);
		assertEquals("11", items[1]);
		assertEquals("Foo", items[2]);
		assertEquals("FooBar", items[5]);
		assertEquals("49", items[39]);
		assertEquals("Bar", items[40]);
	}
	
	@Test
	public void customTestValuesAndOutputStrings() throws Exception {
		final String result = new FizzBuzz(2, 7, "Dee", "Dum").buildOutput(10, 50);
		final String[] items = result.split(" ");
		assertEquals(41, items.length);
		assertEquals("Dee", items[0]);
		assertEquals("11", items[1]);
		assertEquals("Dee", items[2]);
		assertEquals("DeeDum", items[4]);
		assertEquals("43", items[33]);
		assertEquals("Dum", items[39]);
		assertEquals("Dee", items[40]);
	}
}
