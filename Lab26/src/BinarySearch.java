import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int target, ArrayList<Integer> iarrl, int start, int end) {
        int mid = (start + end) / 2;
        if (target == iarrl.get(mid)) {
            return mid;
        } else if (target > iarrl.get(mid)){
            return binarySearch(target, iarrl, mid + 1, end);
        } else {
            return binarySearch(target, iarrl, start, mid);
        }
    }

    public static int binarySearch(int target, ArrayList<Integer> iarrl) {
        if (iarrl.size() == 1 && iarrl.get(0) != target) {
            return -1;
        }
        return binarySearch(target, iarrl, 0, iarrl.size());
    }

    public static void main(String[] args) {
        ArrayList<Integer> iarrl = new ArrayList<>(Arrays.asList(0,1,2,3,4,7,8));
        System.out.println(binarySearch(7, iarrl));
    }
}
