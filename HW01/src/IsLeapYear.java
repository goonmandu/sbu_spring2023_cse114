/** CSE 114 (S23 Fodor) Homework 1, Part 2
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class IsLeapYear {
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = s.nextInt();
		System.out.println(String.format(isLeapYear(year) ? "%d is a leap year" : "%d is not a leap year", year));
		s.close();
	}
}
