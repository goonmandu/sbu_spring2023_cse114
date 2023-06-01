import java.util.Scanner;

public class CalculateRunnerSpeed {
	public static double runnerSpeed(double distance, double minutes) {
		return distance / (minutes / 60);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double dist, min, speed;
		System.out.print("Enter the distance in miles: ");
		dist = s.nextDouble();
		System.out.print("Enter the time in minutes: ");
		min = s.nextDouble();
		speed = runnerSpeed(dist, min);
		System.out.println(String.format("Speed (mph): %.2f", speed));
	}
}
