import java.util.*;

public class SumColumn {
    public static double sumColumn(double[][] darr2d, int c) {
        double ret = 0;
        for (double[] darr : darr2d) {
            ret += darr[c];
        }
        return ret;
    }

    public static double[] sumOfEachColumn(double[][] darr2d) {
        double[] ret = new double[darr2d[0].length];
        for (int i = 0; i < darr2d[0].length; ++i) {
            ret[i] = sumColumn(darr2d, i);
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter 2D matrix dimensions (space separated h w): ");
        int height = s.nextInt();
        int width = s.nextInt();
        double[][] darr2d = new double[height][width];
        for (int h = 0; h < height; ++h) {
            for (int w = 0; w < width; ++w) {
                darr2d[h][w] = s.nextDouble();
            }
        }
        BubbleSort.print(sumOfEachColumn(darr2d));
    }
}
