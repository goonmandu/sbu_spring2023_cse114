/** CSE 114 (S23 Fodor) Homework 3, Part 2
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.ArrayList;

public class Emirp {
    public static boolean isPalindrome(String str) {
        String sanitized = str.toLowerCase().replaceAll("\\s+", "");
        for (int i = 0; i < sanitized.length() / 2; ++i) {
            if (sanitized.charAt(i) != sanitized.charAt(sanitized.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean non_palindrome(int n) {
        return !isPalindrome(String.valueOf(n));
    }

    public static boolean isPrime(int num) {
        boolean stillPrime = true;
        if (num <= 1) {
            stillPrime = false;
        } else {
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    stillPrime = false;
                    break;
                }
            }
        }
        return stillPrime;
    }

    public static int reverse(int num) {
        int ret = 0;
        while (true) {
            ret += num % 10;
            num /= 10;
            if (num != 0) {
                ret *= 10;
            } else {
                return ret;
            }
        }
    }

    public static ArrayList<Integer> generateEmirpsCount(Integer num) {
        ArrayList<Integer> ret = new ArrayList<>();
        int generated = 0;
        for (int i = 0; i < Integer.MAX_VALUE; ++i) {
            if (non_palindrome(i) && isPrime(i) && isPrime(reverse(i))) {
                ret.add(i);
                if (++generated == num) {
                    break;
                };
            }
        }
        return ret;
    }

    public static void print(ArrayList<Integer> intarrl) {
        for (int i : intarrl) {
            System.out.printf("%d ", i);
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        // System.out.printf("%d\n", reverse(17));
        print(generateEmirpsCount(100));
    }
}
