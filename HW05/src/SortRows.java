/** CSE 114 (S23 Fodor) Homework 5, Part 2
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.Scanner;

public class SortRows {
    public static double[] bubbleSort(double[] darrOriginal) {
        double[] darr = new double[darrOriginal.length];
        System.arraycopy(darrOriginal, 0, darr, 0, darr.length);
        int sorted = 0;
        double temp;
        while (sorted < darr.length - 1) {
            sorted = 0;
            for (int i = 0; i < darr.length - 1; ++i) {
                if (darr[i] > darr[i + 1]) {
                    temp = darr[i];
                    darr[i] = darr[i + 1];
                    darr[i + 1] = temp;
                } else {
                    sorted++;
                }
            }
        }
        return darr;
    }

    public static void print(double[] darr) {
        for (double d : darr) {
            System.out.printf("%f ", d);
        }
        System.out.println();
    }

    public static double[][] sortRows(double[][] m) {  // Assuming the array is not jagged
        double[][] ret = new double[m.length][m[0].length];
        for (int i = 0; i < m.length; ++i) {
            System.arraycopy(bubbleSort(m[i]), 0, ret[i], 0, m[i].length);
        }
        return ret;
    }

    public static void printMatrix(double[][] darr2d) {
        for (int i = 0; i < darr2d.length; ++i) {
            for (int k = 0; k < darr2d[i].length; ++k) {
                System.out.printf("%f ", darr2d[i][k]);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] lhs = new double[3][3];
        System.out.printf("Enter a 3x3 matrix:\n");
        for (int i = 0; i < lhs.length; ++i) {
            for (int k = 0; k < lhs[i].length; ++k) {
                lhs[i][k] = s.nextDouble();
            }
        }
        printMatrix(sortRows(lhs));
    }
}
