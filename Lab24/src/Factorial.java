public class Factorial {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
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
