/** CSE 114 (S23 Fodor) Homework 3, Part 1
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String sanitized = str.toLowerCase().replaceAll("\\s+", "");
        for (int i = 0; i < sanitized.length() / 2; ++i) {
            if (sanitized.charAt(i) != sanitized.charAt(sanitized.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter a string:\n");
        String input = s.nextLine();
        if (isPalindrome(input)) {
            System.out.printf("%s is a palindrome.\n", input);
        } else {
            System.out.printf("%s is not a palindrome.\n", input);
        }
        s.close();
    }
}
