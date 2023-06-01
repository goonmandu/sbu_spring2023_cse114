import java.util.ArrayList;
import java.util.Collections;

public abstract class ServiceUtils {
    public static int strcmpNoCase(String lhs, String rhs) {
        if (lhs == null && rhs == null) {
            return 0;
        } else if ((lhs == null || lhs.length() == 0) && rhs.length() != 0) {
            return -1;
        } else if (lhs.length() != 0 && (rhs == null || rhs.length() == 0)) {
            return 1;
        }
        lhs = lhs.toLowerCase();
        rhs = rhs.toLowerCase();
        if (lhs.equals(rhs)) return 0;

        int lhslen = lhs.length();
        int rhslen = rhs.length();
        int charToCompare = 0;
        while (charToCompare < Math.min(lhslen, rhslen) && lhs.charAt(charToCompare) == rhs.charAt(charToCompare)) {
            charToCompare++;
        }

        // CASE 1: One word has been fully iterated.
        if (charToCompare == Math.min(lhslen, rhslen) - 1) {
            // EXAMPLE: note, notepad
            if (lhslen - 1== charToCompare && rhslen - 1 != charToCompare) {
                return 1;
            // EXAMPLE: notepad, note
            } else {
                return -1;
            }
        // CASE 2: No word has been fully iterated.
        } else {
            int diff = lhs.charAt(charToCompare) - rhs.charAt(charToCompare);
            return (diff) / Math.abs(diff);
        }
    }

    public static <T extends Comparable> void selectionSort(ArrayList<T> tarrl, int iterNum) {
        if (iterNum == tarrl.size() - 1) {
            return;
        }
        int minIdx = iterNum;
        for (int i = iterNum + 1; i < tarrl.size(); ++i) {
            if (tarrl.get(minIdx).compareTo(tarrl.get(i)) > 0) {
                minIdx = i;
            }
        }
        Collections.swap(tarrl, iterNum, minIdx);
        selectionSort(tarrl, ++iterNum);
    }

    public static <T extends Comparable> void selectionSort(ArrayList<T> tarrl) {
        selectionSort(tarrl, 0);
    }

    public static void main(String[] args) {

    }
    public static void testStrcmp() {
        // Test case for equal strings
        String s1 = "hello";
        String s2 = "hello";
        int result = strcmpNoCase(s1, s2);
        assert result == 0 : "Strings should be equal";

        // Test case for different strings
        s1 = "hello";
        s2 = "world";
        result = strcmpNoCase(s1, s2);
        assert result < 0 : "First string should be less than second string";

        // Test case for different strings with different casing
        s1 = "hello";
        s2 = "HELLO";
        result = strcmpNoCase(s1, s2);
        assert result == 0 : "Strings should be equal";

        // Test case for different strings with mixed casing
        s1 = "Hello";
        s2 = "hElLo";
        result = strcmpNoCase(s1, s2);
        assert result == 0 : "Strings should be equal";

        // Test case for null strings
        s1 = null;
        s2 = "hello";
        result = strcmpNoCase(s1, s2);
        assert result < 0 : "First string should be less than second string";

        // Test case for empty strings
        s1 = "";
        s2 = "hello";
        result = strcmpNoCase(s1, s2);
        assert result < 0 : "First string should be less than second string";

        // Test case for same string with different reference
        s1 = new String("hello");
        s2 = new String("hello");
        result = strcmpNoCase(s1, s2);
        assert result == 0 : "Strings should be equal";

        // Test case for s1 being a substring of s2
        s1 = "world";
        s2 = "hello world";
        result = strcmpNoCase(s1, s2);
        assert result < 0 : "First string should be less than second string";

        // Test case for s2 being a substring of s1
        s1 = "hello world";
        s2 = "world";
        result = strcmpNoCase(s1, s2);
        assert result > 0 : "First string should be greater than second string";

        // Test case for both strings being empty
        s1 = "";
        s2 = "";
        result = strcmpNoCase(s1, s2);
        assert result == 0 : "Empty strings should be considered equal";

        System.out.println("All test cases passed.");
    }
}
