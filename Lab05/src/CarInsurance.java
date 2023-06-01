import java.util.Scanner;

public class CarInsurance {
	public static double calculatePremium(double policyPremium, String gender, int age) {
		if (18 <= age && age < 21) {
			if (gender.equals("male")) {
				return policyPremium;
			} else if (gender.equals("female")) {
				return policyPremium * 0.9;
			}
		} else if (21 <= age && age < 30) {
			return policyPremium * 0.75;
		} else if (30 <= age && age < 60) {
			if (gender.equals("male")) {
				return policyPremium * 0.6;
			} else if (gender.equals("female")) {
				return policyPremium * 0.7;
			}
		} else if (60 <= age) {
			return policyPremium;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Premium price: $");
		double initPrem = s.nextDouble();
		System.out.print("Age: ");
		int age = s.nextInt();
		System.out.print("Gender: ");
		String gender = s.next().toLowerCase();
		double effPrem = calculatePremium(initPrem, gender, age);
		System.out.printf("Premium: $%.2f\n", effPrem);
		s.close();
	}
}
