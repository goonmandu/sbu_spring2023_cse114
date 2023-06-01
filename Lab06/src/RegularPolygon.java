import java.util.Scanner;

public class RegularPolygon {
	public static double areaOfRegularPolygon(int sides, double length) {
		return sides * (Math.pow(length, 2)) / (4 * Math.tan(Math.PI / sides));
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("How many sides: ");
		int sides = s.nextInt();
		System.out.print("Length of each side: ");
		double length = s.nextDouble();
		double area = areaOfRegularPolygon(sides, length);
		System.out.printf("Area: %f\n", area);
		s.close();
	}
}
