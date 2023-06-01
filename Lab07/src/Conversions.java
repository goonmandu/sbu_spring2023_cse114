import java.util.Scanner;

public class Conversions {
	public static void menu() {
		char user_choice;
		double input;
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.printf("A: lbs -> kg\n"
							+ "B: kg  -> lbs\n"
							+ "C: km  -> mi\n"
							+ "D: mi  -> km\n"
							+ "E: C   -> F\n"
							+ "F: F   -> C\n"
							+ "G: Exit\n"
							+ "Enter your option: ");
			user_choice = s.next().toLowerCase().charAt(0);
			switch (user_choice) {
				case 'a':
					System.out.printf("lbs: ");
					input = s.nextDouble();
					System.out.printf("%f kg\n", input * 0.453592);
					break;
				case 'b':
					System.out.printf("kg: ");
					input = s.nextDouble();
					System.out.printf("%f lbs\n", input * 2.204624);
					break;
				case 'c':
					System.out.printf("km: ");
					input = s.nextDouble();
					System.out.printf("%f mi\n", input * 0.6215);
					break;
				case 'd':
					System.out.printf("mi: ");
					input = s.nextDouble();
					System.out.printf("%f km\n", input * 1.609);
					break;
				case 'e':
					System.out.printf("C: ");
					input = s.nextDouble();
					System.out.printf("%f F\n", 32 + (input * 9) / 5);
					break;
				case 'f':
					System.out.printf("F: ");
					input = s.nextDouble();
					System.out.printf("%f C\n", ((input - 32) * 5) / 9);
					break;
				case 'g':
					System.out.printf("Goodbye!");
					s.close();
					return;
				default:
					System.out.printf("Enter a valid option!");
			}
			System.out.printf("\n");
		}
	}
	public static void main(String[] args) {
		menu();
	}
}
