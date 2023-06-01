/** CSE 114 (S23 Fodor) Homework 2, Part 1
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class Pyramid {
	public static String strmult(String str, int times) {
		String ret = "";
		for (int i = 0; i < times; ++i) {
			ret += str;
		}
		return ret;
	}
	public static void printPowerOfTwoPyramid(int lines) {
		for (int line = 1; line <= lines; ++line) {
			System.out.printf(strmult("\t", lines - line));
			for (int exp = -line + 1; exp < line; ++exp) {
				System.out.printf("%d\t", (int) Math.pow(2, Math.abs(Math.abs(exp) - line) - 1));
			}
			System.out.printf("\n");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("How many lines? ");
		int lines = s.nextInt();
		printPowerOfTwoPyramid(lines);
		s.close();
	}
}
