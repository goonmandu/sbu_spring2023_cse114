/** CSE 114 (S23 Fodor) Homework 2, Part 4
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PerfectNumber {
	public static ArrayList<Integer> divisorsOf(int num) {
		ArrayList<Integer> ret = new ArrayList<>();
		for (int cand = 1; cand < num; ++cand) {
			if (num % cand == 0) {
				ret.add(cand);
			}
		}
		return ret;
	}
	
	public static int sumOfIntArrayList(ArrayList<Integer> intarrl) {
		int sum = 0;
		for (int i : intarrl) {
			sum += i;
		}
		return sum;
	}
	
	public static ArrayList<Integer> perfectNumbersUpTo(int limit) {
		ArrayList<Integer> ret = new ArrayList<>();
		for (int i = 1; i < limit; ++i) {
			if (i == sumOfIntArrayList(divisorsOf(i))) {
				ret.add(i);
			}
		}
		return ret;
	}
	
	public static void printIntArrayList(ArrayList<Integer> intarrl) {
		for (int i : intarrl) {
			System.out.printf("%d, ", i);
		}
		System.out.printf("\n");
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("Upper limit? ");
		int limit = s.nextInt();
		printIntArrayList(perfectNumbersUpTo(limit));
		s.close();
	}
}
