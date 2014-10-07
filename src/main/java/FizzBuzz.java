public class FizzBuzz {
	public String buildOutput() {
		return buildOutput(1, 100);
	}

	private boolean isMultipleOfBothThreeAndFive(int i) {
		return isMultipleOfThree(i) && isMultipleOfFive(i);
	}

	private boolean isMultipleOfThree(int i) {
		return i % 3 == 0;
	}

	private boolean isMultipleOfFive(int i) {
		return i % 5 == 0;
	}

	public String buildOutput(int start, int stop) {
		final StringBuilder sb = new StringBuilder();
		for (int i = start; i <= stop; i++) {
			if (isMultipleOfBothThreeAndFive(i)) {
				sb.append("FizzBuzz");
			} else if (isMultipleOfThree(i)) {
				sb.append("Fizz");
			} else if (isMultipleOfFive(i)) {
				sb.append("Buzz");
			} else {
				sb.append(i);
			}
			sb.append(" ");
		}
		return sb.toString();
	}
}
