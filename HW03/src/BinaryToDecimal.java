/** CSE 114 (S23 Fodor) Homework 3, Part 5
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.*;

public class BinaryToDecimal {
    public static int bin2Dec(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter a binary number: ");
        String input = s.next();
        System.out.printf("Decimal: %d\n", bin2Dec(input));
    }
}
