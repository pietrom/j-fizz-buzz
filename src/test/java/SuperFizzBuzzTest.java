import static org.junit.Assert.*;

import org.junit.Test;


public class SuperFizzBuzzTest {
	@Test
	public void customStartAndStop() throws Exception {
		final String result = new FizzBuzz().buildOutput(10, 50);
		System.out.println(result);
		final String[] items = result.split(" ");
		assertEquals(41, items.length);
		assertEquals("Buzz", items[0]);
		assertEquals("11", items[1]);
		assertEquals("Fizz", items[2]);
		assertEquals("49", items[39]);
		assertEquals("Buzz", items[40]);
	}
}
