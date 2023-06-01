import java.util.Scanner;

public class ReversedString {
	public static String strrev(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; --i) {
			rev += str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter a string: ");
		String input = s.next();
		System.out.printf("Reversed: %s\n", strrev(input));
		s.close();
	}
}
