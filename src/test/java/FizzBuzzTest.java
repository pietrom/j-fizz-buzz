import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {
	@Test
	public void outputContainsNumbersFrom1To100() throws Exception {
		final String result = new FizzBuzz().toString();
		System.out.println(result);
		for(int i = 1; i <= 100; i++) {
			assertTrue(result.contains(Integer.toString(i)));
		}
	}
}
