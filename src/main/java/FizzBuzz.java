public class FizzBuzz {
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			if(isMultipleOfThree(i)) {
				sb.append("Fizz");
			} else {
				sb.append(i);
			}
			sb.append(" ");
		}
		return sb.toString();
	}

	private boolean isMultipleOfThree(int i) {
		return i % 3 == 0;
	}
}
