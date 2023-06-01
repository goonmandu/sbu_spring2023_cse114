import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    public static void bubbleSort(ArrayList<Integer> iarrl, int iterNum) {
        if (iterNum == iarrl.size() - 1) {
            return;
        }
        for (int i = 0; i < iarrl.size() - 1; ++i) {
            if (iarrl.get(i) > iarrl.get(i + 1)) {
                Collections.swap(iarrl, i, i + 1);
            }
        }
        bubbleSort(iarrl, ++iterNum);
    }

    public static void selectionSort(ArrayList<Integer> iarrl, int iterNum) {
        if (iterNum == iarrl.size() - 1) {
            return;
        }
        int minIdx = iterNum;
        for (int i = iterNum + 1; i < iarrl.size(); ++i) {
            if (iarrl.get(minIdx) > iarrl.get(i)) {
                minIdx = i;
            }
        }
        Collections.swap(iarrl, iterNum, minIdx);
        selectionSort(iarrl, ++iterNum);
    }

    public static void bubbleSort(ArrayList<Integer> iarrl) {
        bubbleSort(iarrl, 0);
    }

    public static void selectionSort(ArrayList<Integer> iarrl) {
        selectionSort(iarrl, 0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> unsorted1 = new ArrayList<>(Arrays.asList(4, 2, 6, 0, 9));
        ArrayList<Integer> unsorted2 = new ArrayList<>(Arrays.asList(-1, 9, 4, 4, 2));
        bubbleSort(unsorted1);
        selectionSort(unsorted2);
        System.out.println(unsorted1);
        System.out.println(unsorted2);
    }
}
