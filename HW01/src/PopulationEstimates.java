/** CSE 114 (S23 Fodor) Homework 1, Part 1
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class PopulationEstimates {
	public static int usPopEstMillions(int year) {
		return 3 * (year - 2010) + 310;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = s.nextInt();
		System.out.println(String.format("Population estimate: %d million", usPopEstMillions(year)));
		s.close();
	}
}
