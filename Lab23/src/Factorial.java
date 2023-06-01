public class Factorial {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        long ret = 1;
        for (int i = 2; i <= n; ++i) {
            ret *= i;
        }
        return ret;
    }

    public static void printFactorialsIncl(int lb, int ub) {
        for (int i = lb; i <= ub; ++i) {
            System.out.println(factorial(i));
        }
    }

    public static void main(String[] args) {
        printFactorialsIncl(1, 10);
    }
}
