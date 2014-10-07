import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void outputContainsNumbersFrom1To100() throws Exception {
		final String result = new FizzBuzz().toString();
		final String[] items = result.split(" ");
		assertEquals(100, items.length);
		for (int i = 1; i <= 100; i++) {
			if(i % 3 != 0) {
				assertEquals(Integer.toString(i), items[i - 1]);
			}
		}
	}

	@Test
	public void multipleOfThreeAreSubstitutedByFuzz() throws Exception {
		final String result = new FizzBuzz().toString();
		final String[] items = result.split(" ");
		for (int i = 3; i <= 100; i += 3) {
			assertEquals("Fizz", items[i - 1]);
		}
	}
}
