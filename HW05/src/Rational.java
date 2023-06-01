/** CSE 114 (S23 Fodor) Homework 5, Part 4
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class Rational {
    private final int numerator;
    private final int denominator;
    public static int gcd(int a, int b) {
        if (a < b) {
            a = (a + b) - (b = a);
        }
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int n, int d) throws IllegalArgumentException {
        try {
            if (d == 0) {
                throw new IllegalArgumentException("Denominator cannot be zero");
            }
        } catch (IllegalArgumentException e) {
            System.err.println(e);
            System.exit(1);
        }
        boolean flip = false;
        int nSanit = n;
        int dSanit = d;
        if (d < 0) {
            dSanit *= -1;
            flip = true;
        }
        if (n < 0) {
            nSanit *= -1;
        }
        if (n != 0) {
            int div = gcd(nSanit, dSanit);
            numerator = flip ? n * -1 / div : n / div;
            denominator = flip ? d * -1 / div : d / div;
        } else {
            numerator = 0;
            denominator = 1;
        }
    }

    public Rational add(Rational rhs) {
        return new Rational(this.numerator * rhs.denominator + rhs.numerator * this.denominator,
                this.denominator * rhs.denominator);
    }

    public Rational subtract(Rational rhs) {
        return new Rational(this.numerator * rhs.denominator - rhs.numerator * this.denominator,
                this.denominator * rhs.denominator);
    }

    public Rational multiply(Rational rhs) {
        return new Rational(this.numerator * rhs.numerator, this.denominator * rhs.denominator);
    }

    public Rational divide(Rational rhs) {
        return new Rational(this.numerator * rhs.denominator, this.denominator * rhs.numerator);
    }

    public void print() {
        System.out.printf("%d/%d\n", numerator, denominator);
    }

    public static void main(String[] args) {
        int an, ad, bn, bd;
        Rational lhs, rhs, sum, diff, prod, quot;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter numerator of first rational: ");
        an = s.nextInt();
        System.out.print("Enter denominator of first rational: ");
        ad = s.nextInt();
        System.out.print("Enter numerator of second rational: ");
        bn = s.nextInt();
        System.out.print("Enter denominator of second rational: ");
        bd = s.nextInt();

        lhs = new Rational(an, ad);
        rhs = new Rational(bn, bd);
        System.out.print("First rational = "); lhs.print();
        System.out.print("Second rational = "); rhs.print();

        sum = lhs.add(rhs);
        System.out.print("Sum = "); sum.print();
        diff = lhs.subtract(rhs);
        System.out.print("Difference = "); diff.print();
        prod = lhs.multiply(rhs);
        System.out.print("Product = "); prod.print();
        quot = lhs.divide(rhs);
        System.out.print("Quotient = "); quot.print();
    }
}

