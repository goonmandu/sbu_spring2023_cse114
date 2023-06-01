/** CSE 114 (S23 Fodor) Homework 1, Part 2
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class ShowMeTheMoney {
	public static void oldBritainChangeMaker(int farthings) {
		String ret = "";
		int poundsterling, shilling, penny;
		poundsterling = farthings / 960;
		farthings %= 960;
		shilling = farthings / 48;
		farthings %= 48;
		penny = farthings / 4;
		farthings %= 4;
		ret += String.format("%d\t Pound Sterling\n", poundsterling);
		ret += String.format("%d\t Shilling\n", shilling);
		ret += String.format("%d\t Penny\n", penny);
		ret += String.format("%d\t Farthing\n", farthings);
		System.out.println(ret);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("How many farthings: ");
		int farthings = s.nextInt();
		oldBritainChangeMaker(farthings);
		s.close();
	}
}
