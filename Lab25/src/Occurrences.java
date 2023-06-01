import java.util.Arrays;

public class Occurrences {
    public static int count(char[] chars, char ch) {
        if (chars.length == 0) {
            return 0;
        }
        if (chars[0] == ch) {
            return 1 + count(Arrays.copyOfRange(chars, 1, chars.length), ch);
        } else {
            return count(Arrays.copyOfRange(chars, 1, chars.length), ch);
        }
    }

    public static void main(String[] args) {
        char[] helloWorld = {'h', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
        char[] oneChar = {'k'};
        System.out.println(count(helloWorld, 'l'));
        System.out.println(count(oneChar, 'k'));
    }
}
