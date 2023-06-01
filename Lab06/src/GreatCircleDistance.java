import java.util.Scanner;

public class GreatCircleDistance {
	public static double getGCDkm(double x1, double y1, double x2, double y2) {
		return 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
					   + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x1, x2, y1, y2, distance;
		System.out.print("Enter coordinates of point 1 (lat, long): ");
		x1 = s.nextDouble();
		y1 = s.nextDouble();
		System.out.print("Enter coordinates of point 2 (lat, long): ");
		x2 = s.nextDouble();
		y2 = s.nextDouble();
		distance = getGCDkm(x1, y1, x2, y2);
		System.out.printf("Distance between the two points is %f km\n", distance);
		s.close();
	}
}
