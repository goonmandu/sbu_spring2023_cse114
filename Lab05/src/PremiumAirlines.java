import java.util.Scanner;

public class PremiumAirlines {
	public static int updatePoints(int ticketPrice, int currentPoints, String membership) {
		int updatedPoints = currentPoints;
		if (membership.equals("diamond")) {
			if (ticketPrice >= 5000) {
				updatedPoints += 35;
			} else if (ticketPrice >= 2000 && currentPoints > 300) {
				updatedPoints += 30;
			} else if (ticketPrice >= 500 && currentPoints > 100) {
				updatedPoints += 10;
			} else if (currentPoints > 25) {
				updatedPoints += 2;
			}
		} else if (membership.equals("platinum")) {
			if (ticketPrice >= 5000) {
				updatedPoints += 35;
			} else if (ticketPrice >= 2000) {
				updatedPoints += 20;
			} 
		} else if (membership.equals("regular")) {
			if (ticketPrice >= 5000) {
				updatedPoints += 5;
			}
		}
		return updatedPoints;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter membership: ");
		String membership = s.next().toLowerCase();
		while (!(membership.equals("diamond") || membership.equals("platinum") || membership.equals("regular"))) {
			System.out.print("Enter a valid membership: ");
			membership = s.next().toLowerCase();
		}
		System.out.print("Enter ticket price: $");
		int ticketPrice = s.nextInt();
		System.out.print("Enter current points: ");
		int currentPoints = s.nextInt();
		int newPoints = updatePoints(ticketPrice, currentPoints, membership);
		System.out.printf("New points: %d\n", newPoints);
		s.close();
	}
}
