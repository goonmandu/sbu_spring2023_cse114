import java.util.Scanner;

public class Gasoline {
	public static void gallonsOfFuel() {
		Scanner s = new Scanner(System.in);
		double min, mph, mpg, gallons;
		System.out.print("Enter the number of minutes: ");
		min = s.nextDouble();
		System.out.print("Enter the constant speed of the car (mph): ");
		mph = s.nextDouble();
		System.out.print("Enter the fuel efficiency of the car (mpg): ");
		mpg = s.nextDouble();
		gallons = (min / 60) * mph * (1 / mpg);
		System.out.println(String.format("Consumed gas for the period: %.2f gal\n", gallons));
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 3; ++i) {
			gallonsOfFuel();
		}
	}
}
