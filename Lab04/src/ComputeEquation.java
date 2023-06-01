import java.util.Scanner;

public class ComputeEquation {
	public static double equation(double x, double y) {
		return x / (y - 3 * x) + (x - 1)/(y / (x + 1));
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double x, y, result;
		System.out.print("x = ");
		x = s.nextDouble();
		System.out.print("y = ");
		y = s.nextDouble();
		result = equation(x, y);
		System.out.println(String.format("Value = %f", result));
	}
}
