import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
	public static boolean charInCharArray(char c, char[] c_arr) {
		for (char iter : c_arr) {
			if (iter == c) {
				return true;
			}
		}
		return false;
	}
	public static int[] consAndVowels(String str) {
		int[] count = {0, 0};
		for (char c : str.toLowerCase().toCharArray()) {
			if (charInCharArray(c, VOWELS)) {
				count[1]++;
			} else if (c == ' ') {
				continue;
			} else {
				count[0]++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter a string: ");
		String str = s.nextLine();
		int[] cnv = consAndVowels(str);
		System.out.printf("%d consonants and %d vowels\n", cnv[0], cnv[1]);
		s.close();
	}
}
