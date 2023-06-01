/** CSE 114 (S23 Fodor) Homework 1, Part 2
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class Triangle {
	public static int determineTriangleType(int a, int b, int c) {
		if (!(a + b > c && b + c > a && a + c > b)) {
			return 0;
		} else if (a == b && b == c) {
			return 1;
		} else if (a == b || b == c || c == a) {
			return 2;
		} else {
			return 3;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c, type;
		String result;
		System.out.print("Enter first side: ");
		a = s.nextInt();
		System.out.print("Enter second side: ");
		b = s.nextInt();
		System.out.print("Enter third side: ");
		c = s.nextInt();
		type = determineTriangleType(a, b, c);
		if (type == 0) {
			result = "The given values cannot form a triangle.";
		} else if (type == 1) {
			result = "The triangle is equilateral.";
		} else if (type == 2) {
			result = "The triangle is isosceles.";
		} else {
			result = "The triangle is scalene.";
		}
		System.out.println(result);
		s.close();
	}
}
