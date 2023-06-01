public class SequenceSum {
    public static double oneOverIntSum(int n) {
        if (n == 1) return 1;
        return (double) 1 / n + oneOverIntSum(n - 1)
;    }

    public static void printSeriesIncl(int lb, int ub) {
        for (int i = lb; i <= ub; ++i) {
            System.out.println(oneOverIntSum(i));
        }
    }

    public static void main(String[] args) {
        printSeriesIncl(1, 10);
    }
}
