import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        if (n == 0) return 0;
        return ((n % 10) * ((int) Math.pow(10, (int) Math.log10(n)))) + reverseNumber(n / 10);
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
