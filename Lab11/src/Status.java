import java.util.Scanner;
public class Status {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("enter an integer: 1, 2, 3 or 4");
        int x = stdin.nextInt();
        switch (x) {
            case 1 -> System.out.println("Freshman");
            case 2 -> System.out.println("Sophomore");
            case 3 -> System.out.println("Junior");
            case 4 -> System.out.println("Senior");
            default -> System.out.println("Improper input");
        }
    }
}
