public class FizzBuzz {
	private final int a, b;
	private final String first, second;

	public FizzBuzz(int a, int b) {
		this(a, b, "Fizz", "Buzz");
	}

	public FizzBuzz() {
		this(3, 5);
	}

	public FizzBuzz(String first, String second) {
		this(3, 5, first, second);
	}
	
	public FizzBuzz(int a, int b, String first, String second) {
		this.a = a;
		this.b = b;
		this.first = first;
		this.second = second;
	}

	public String buildOutput() {
		return buildOutput(1, 100);
	}

	private boolean isMultipleOfBoth(int i) {
		return isMultipleOfA(i) && isMultipleOfB(i);
	}

	private boolean isMultipleOfA(int i) {
		return i % a == 0;
	}

	private boolean isMultipleOfB(int i) {
		return i % b == 0;
	}

	public String buildOutput(int start, int stop) {
		final StringBuilder sb = new StringBuilder();
		for (int i = start; i <= stop; i++) {
			if (isMultipleOfBoth(i)) {
				sb.append(first).append(second);
			} else if (isMultipleOfA(i)) {
				sb.append(first);
			} else if (isMultipleOfB(i)) {
				sb.append(second);
			} else {
				sb.append(i);
			}
			sb.append(" ");
		}
		return sb.toString();
	}
}
