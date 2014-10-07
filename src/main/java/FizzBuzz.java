public class FizzBuzz {
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i).append(" ");
		}
		return sb.toString();
	}
}
