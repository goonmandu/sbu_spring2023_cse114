/** CSE 114 (S23 Fodor) Homework 3, Part 3
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.*;

public class Anagram {
    public static boolean isAnagram(String raw1, String raw2) {
        String str1 = raw1.toLowerCase().replaceAll("\\s+", "");
        String str2 = raw2.toLowerCase().replaceAll("\\s+", "");
        if (str1.length() != str2.length()) {
            return false;
        }
        List<Character> str1list = new ArrayList<>();
        List<Character> str2list = new ArrayList<>();
        for (int i = 0; i < str1.length(); ++i) {
            str1list.add(str1.charAt(i));
            str2list.add(str2.charAt(i));
        }
        Collections.sort(str1list);
        Collections.sort(str2list);
        return (str1list.equals(str2list));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter first string:\n");
        String str1 = s.nextLine();
        System.out.printf("Enter second string:\n");
        String str2 = s.nextLine();
        if (isAnagram(str1, str2)) {
            System.out.printf("\"%s\" and \"%s\" are anagrams.", str1, str2);
        } else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", str1, str2);
        }
    }
}
