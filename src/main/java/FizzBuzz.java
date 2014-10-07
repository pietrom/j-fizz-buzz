public class FizzBuzz {
	private final int a, b;

	public FizzBuzz(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public FizzBuzz() {
		this(3, 5);
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
				sb.append("FizzBuzz");
			} else if (isMultipleOfA(i)) {
				sb.append("Fizz");
			} else if (isMultipleOfB(i)) {
				sb.append("Buzz");
			} else {
				sb.append(i);
			}
			sb.append(" ");
		}
		return sb.toString();
	}
}
