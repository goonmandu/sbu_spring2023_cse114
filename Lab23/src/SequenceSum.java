public class SequenceSum {
    public static double oneOverIntSum(int n) {
        double ret = 0;
        for (int i = 1; i <= n; ++i) {
            ret += (double) 1 / i;
        }
        return ret;
    }

    public static void printSeriesIncl(int lb, int ub) {
        for (int i = lb; i <= ub; ++i) {
            System.out.println(oneOverIntSum(i));
        }
    }

    public static void main(String[] args) {
        printSeriesIncl(1, 10);
    }
}
