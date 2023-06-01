import java.util.Scanner;

public class CharacterCount {
    public static int count(String str, char a) { return (int) str.chars().filter(c -> c == a).count(); }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter a string:\n");
        String input = s.nextLine();
        System.out.printf("Enter a character: ");
        char toCheck = s.next().charAt(0);
        System.out.printf("%d matches\n", count(input, toCheck));
    }
}
