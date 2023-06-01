import java.util.Scanner;

public class SumDigits {
    public static int sumDigits(int n) {
        int ret = 0;
        if (n == 0) {
            return 0;
        }
        while (n > 0) {
            ret += n % 10;
            n /= 10;
        }
        return ret;
    }

    public static void sumStdinNumberDigits() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to sum the digits of: ");
        System.out.println(sumDigits(s.nextInt()));
        s.close();
    }

    public static void main(String[] args) {
        sumStdinNumberDigits();
    }
}
