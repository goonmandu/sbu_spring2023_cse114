public class Kgs_Pounds {
	final static double POUNDS_PER_KILO = 2.20462;
	final static double KILOS_PER_POUND = 1 / POUNDS_PER_KILO;
	public static void printKgLbsTable() {
		System.out.printf("Kg\tlbs\tlbs\tKg\n");
		for (int i = 1; i < 200; i += 2) {
			System.out.printf("%d\t%.1f\t%d\t%.2f\n", i,
													  i * POUNDS_PER_KILO,
													  20 + i/2 * 5,
													  (20 + i/2 * 5) * KILOS_PER_POUND);
		}
	}
	public static void main(String[] args) {
		printKgLbsTable();
	}
}
