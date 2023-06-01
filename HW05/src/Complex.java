/** CSE 114 (S23 Fodor) Homework 5, Part 3
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class Complex {
    private final double realPart;
    private final double imaginaryPart;
    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }
    public Complex(double r, double i) {
        realPart = r;
        imaginaryPart = i;
    }
    public Complex add(Complex rhs) {
        return new Complex(this.realPart + rhs.realPart, this.imaginaryPart + rhs.imaginaryPart);
    }
    public Complex subtract(Complex rhs) {
        return new Complex(this.realPart - rhs.realPart, this.imaginaryPart - rhs.imaginaryPart);
    }
    public void print() {
        System.out.printf("(%f, %f)\n", this.realPart, this.imaginaryPart);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Complex lhs, rhs, sum, diff;
        double ar, ai, br, bi;

        System.out.print("Enter real part of the first complex number: ");
        ar = s.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        ai = s.nextDouble();
        System.out.print("Enter real part of the second complex number: ");
        br = s.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        bi = s.nextDouble();

        lhs = new Complex(ar, ai);
        rhs = new Complex(br, bi);
        System.out.print("First complex number = "); lhs.print();
        System.out.print("Second complex number = "); rhs.print();

        sum = lhs.add(rhs);
        diff = lhs.subtract(rhs);
        System.out.print("Sum = "); sum.print();
        System.out.print("Diff = "); diff.print();
    }
}
