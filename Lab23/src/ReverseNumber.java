import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        if (n == 0) return 0;
        boolean neg = n < 0;
        if (neg) n = -n;
        int ret = 0;
        int digits = (int) Math.log10(n);
        while (n > 0) { ret += ((n % 10) * Math.pow(10, digits--)); n /= 10; }
        return neg ? -ret : ret;
    }

    public static void reverseStdinNumber() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        System.out.println(reverseNumber(s.nextInt()));
        s.close();
    }

    public static void main(String[] args) {
        reverseStdinNumber();
    }
}
