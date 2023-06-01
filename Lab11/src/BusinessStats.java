import java.util.*;

public class BusinessStats {
    public static double mean(double[] x) {
        return Arrays.stream(x).sum() / x.length;
    }

    public static double deviation(double[] x) {
        double accum = 0;
        double x_mean = mean(x);
        for (int i = 0; i < x.length; ++i) {
            accum += Math.pow(x[i] - x_mean, 2);
        }
        return Math.sqrt(accum / (x.length - 1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter ten numbers: ");
        double[] input = new double[10];
        for (int i = 0; i < 10; ++i) {
            input[i] = s.nextDouble();
        }
        System.out.printf("The mean is %f\nThe standard deviation is %f\n", mean(input), deviation(input));
    }
}
