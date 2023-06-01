/** CSE 114 (S23 Fodor) Homework 2, Part 3
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class LongestCommonPrefix {
	public static String commonPrefix(String str1, String str2) {
		int minStrLen = str1.length() < str2.length() ? str1.length() : str2.length();
		int i;
		for (i = 0; i < minStrLen && str1.charAt(i) == str2.charAt(i); ++i) { }
		return str1.substring(0, i);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1, str2;
		System.out.printf("Enter first string: ");
		str1 = s.next();
		System.out.printf("Enter second string: ");
		str2 = s.next();
		String result = commonPrefix(str1, str2);
		System.out.printf("Longest common prefix %s", !result.isEmpty() ? "is \"" + result + "\"" : "does not exist");
		s.close();
	}
}
