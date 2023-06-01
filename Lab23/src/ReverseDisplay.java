import java.util.Scanner;

public class ReverseDisplay {
    public static void reverseDisplay(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        while (n > 0) {
            System.out.print(n % 10);
            n /= 10;
        }
        System.out.println();
    }

    public static void reverseStdinNumber() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        reverseDisplay(s.nextInt());
        s.close();
    }

    public static void main(String[] args) {
        reverseStdinNumber();
    }
}
