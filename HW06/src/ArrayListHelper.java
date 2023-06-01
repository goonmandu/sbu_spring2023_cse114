/** CSE 114 (S23 Fodor) Homework 6 (Custom-made ArrayList Utility Namespace)
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.ArrayList;
import java.util.HashSet;

public abstract class ArrayListHelper {
    public static <T> boolean arrayListEqualsIgnoreOrder(ArrayList<T> list1, ArrayList<T> list2) {
        return new HashSet<>(list1).equals(new HashSet<>(list2));
    }

    public static <T> void printline(ArrayList<T> list) {
        for (T t : list) {
            System.out.print(t);
        }
        System.out.println();
    }
}
