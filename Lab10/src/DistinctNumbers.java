import java.util.Scanner;
import java.util.ArrayList;

public class DistinctNumbers {
    public static boolean contains(ArrayList<Integer> intarrl, int target) {
        for (int i : intarrl) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> set(ArrayList<Integer> intarrl) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i : intarrl) {
            if (!contains(ret, i)) {
                ret.add(i);
            }
        }
        return ret;
    }

    public static void print(ArrayList<Integer> intarrl) {
        for (int i = 0; i < intarrl.size() - 1; ++i) {
            System.out.printf("%d, ", intarrl.get(i));
        }
        System.out.printf("%d\n", intarrl.get(intarrl.size() - 1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter numbers: ");
        ArrayList<Integer> rawInts = new ArrayList<>();
        String[] numbers = s.nextLine().split("\\s+");
        for (String str : numbers) {
            rawInts.add(Integer.parseInt(str));
        }
        print(set(rawInts));

    }
}
