/** CSE 114 (S23 Fodor) Homework 1, Part 1
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class PentagonalNumbers {
	public static int pentagonal(int term) {
		return term * ((3 * term) - 1) / 2;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int term;
		System.out.print("Enter the nth term: ");
		term = s.nextInt();
		System.out.println(String.format("Pentagonal number: %d", pentagonal(term)));
		s.close();
	}
}
