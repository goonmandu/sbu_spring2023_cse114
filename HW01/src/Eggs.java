/** CSE 114 (S23 Fodor) Homework 1, Part 2
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class Eggs {
	public static void printPriceOfEggs(int eggs) {
		String ret = "";
		int dozens = eggs / 12;
		int indiv = eggs % 12;
		double dozenprice = dozens * 3.25;
		double indivprice = indiv * 0.45;
		ret += String.format("%d\tDozens * $3.25/dozen = $%.2f\n", dozens, dozenprice);
		ret += String.format("%d\t  Eggs * $0.45/egg   = $%.2f\n", indiv, indivprice);
		ret += String.format("Total\t\t\t     = $%.2f\n", dozenprice + indivprice);
		System.out.println(ret);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numEggs;
		System.out.print("How many eggs: ");
		numEggs = s.nextInt();
		printPriceOfEggs(numEggs);
		s.close();
	}
}
