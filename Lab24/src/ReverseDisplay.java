import java.util.Scanner;

public class ReverseDisplay {
    public static void reverseDisplay(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.print(n % 10);
        reverseDisplay(n / 10);
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
