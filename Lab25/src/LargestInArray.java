import java.util.Arrays;

public class LargestInArray {
    public static int findLargest(int[] list) throws IllegalArgumentException{
        if (list.length == 0) {
            throw new IllegalArgumentException("Array length cannot be 0");
        } else if (list.length == 1) {
            return list[0];
        } else if (list.length == 2) {
            return Math.max(list[0], list[1]);
        } else {
            return Math.max(list[0], findLargest(Arrays.copyOfRange(list, 1, list.length)));
        }
    }

    public static void main(String[] args) {
        int[] empty = {};
        int[] oneElement = {6};
        int[] twoElements = {4, 2};
        int[] numbers = {4, 2, -11, 5, 7, 0};

        try {
            System.out.println(findLargest(empty));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println(findLargest(oneElement));
        System.out.println(findLargest(twoElements));
        System.out.println(findLargest(numbers));
    }
}
