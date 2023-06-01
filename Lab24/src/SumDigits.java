import java.util.Scanner;

public class SumDigits {
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
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
