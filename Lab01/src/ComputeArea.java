import java.util.Scanner;

public class ComputeArea {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		var radius = scanner.nextDouble();
		var area = radius * radius * Math.PI;
		System.out.println(String.format("The area of circle with radius %f is %f.", radius, area));
		scanner.close();
	}
}
