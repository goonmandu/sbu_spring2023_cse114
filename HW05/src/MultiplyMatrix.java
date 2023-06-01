/** CSE 114 (S23 Fodor) Homework 5, Part 1
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class MultiplyMatrix {
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] ret = new double[a.length][b[0].length];
        for (int i = 0; i < ret.length; ++i) {
            for (int j = 0; j < ret[0].length; ++j) {
                for (int iter = 0; iter < b[0].length; ++iter) {
                    ret[i][j] += a[i][iter] * b[iter][j];
                }
            }
        }
        return ret;
    }

    public static void printMatrix(double[][] darr2d) {
        for (double[] darr : darr2d) {
            for (double d : darr) {
                System.out.printf("%f ", d);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] lhs = new double[3][3];
        double[][] rhs = new double[3][3];
        System.out.printf("Enter matrix 1 (3x3):\n");
        for (int i = 0; i < lhs.length; ++i) {
            for (int k = 0; k < lhs[i].length; ++k) {
                lhs[i][k] = s.nextDouble();
            }
        }
        System.out.printf("Enter matrix 2 (3x3):\n");
        for (int i = 0; i < rhs.length; ++i) {
            for (int k = 0; k < rhs[i].length; ++k) {
                rhs[i][k] = s.nextDouble();
            }
        }
        System.out.printf("Multiplication of the matrices is:\n");
        printMatrix(multiplyMatrix(lhs, rhs));
    }
}
