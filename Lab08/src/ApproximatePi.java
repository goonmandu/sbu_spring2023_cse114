public class ApproximatePi {
	public static double leibniz(int terms) {
		double sum = 0;
		for (int i = 1; i <= terms; ++i) {
			sum += Math.pow(-1, i+1) * ((double)1 / (2*i - 1));
		}
		return 4 * sum;
	}
	public static void main(String[] args) {
		for (int i = 10000; i <= 100000; i += 10000) {
			System.out.printf("i = %d Pi Approximate: %.16f\n", i, leibniz(i));
		}
	}
}
