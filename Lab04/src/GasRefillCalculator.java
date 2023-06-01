import java.util.Scanner;

public class GasRefillCalculator {
	public static double gasPrice(double dist, double mpg, double ppg) {
		return dist * (1 / mpg) * ppg;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double dist, mpg, ppg, price;
		System.out.print("Enter distance (mi): ");
		dist = s.nextDouble();
		System.out.print("Enter fuel efficiency (mpg): ");
		mpg = s.nextDouble();
		System.out.print("Enter price of gas ($/gal): ");
		ppg = s.nextDouble();
		price = gasPrice(dist, mpg, ppg);
		System.out.println(String.format("Price for the trip: $%.2f", price));
	}
}