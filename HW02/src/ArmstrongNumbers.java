/** CSE 114 (S23 Fodor) Homework 2, Part 5
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ArmstrongNumbers {
	public static ArrayList<Integer> reverseIntArrayList(ArrayList<Integer> intarrl) {
		ArrayList<Integer> ret = new ArrayList<>();
		for (int i = intarrl.size() - 1; i >= 0; --i) {
			ret.add(intarrl.get(i));
		}
		return ret;
	}
	public static ArrayList<Integer> digitsOf(int num) {
		ArrayList<Integer> ret = new ArrayList<>();
		while (num > 0) {
			ret.add(num % 10);
			num /= 10;
		}
		return reverseIntArrayList(ret);
	}
	public static int sumOfLengthPowersOf(ArrayList<Integer> intarrl) {
		int sum = 0;
		int len = intarrl.size();
		for (int i : intarrl) {
			sum += Math.pow(i, len);
		}
		return sum;
	}
	public static ArrayList<Integer> armstrongNumbers(int lb, int ub) {
		ArrayList<Integer> ret = new ArrayList<>();
		for (int i = lb; i < ub; ++i) {
			if (i == sumOfLengthPowersOf(digitsOf(i))) {
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
		System.out.printf("Lower bound? ");
		int lb = s.nextInt();
		System.out.printf("Upper bound? ");
		int ub = s.nextInt();
		printIntArrayList(armstrongNumbers(lb, ub));
		s.close();
	}
}
