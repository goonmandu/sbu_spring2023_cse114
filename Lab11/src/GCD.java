import java.util.*;

public class GCD {
    public static int euclideanGcd(int x, int y) {
        if (x < y) {
            x = x ^ y ^ (y = x);
        }
        if (x % y == 0) {
            return y;
        } else {
            return euclideanGcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter integers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.printf("GCD = %d\n", euclideanGcd(a, b));
        s.close();
    }
}
