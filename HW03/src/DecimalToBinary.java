/** CSE 114 (S23 Fodor) Homework 3, Part 4
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.*;

public class DecimalToBinary {
    public static String dec2Bin(int value) {
        return String.format("(%s)_2", Integer.toBinaryString(value));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter a decimal number: ");
        int input = s.nextInt();
        System.out.printf("Binary: %s\n", dec2Bin(input));
    }
}
