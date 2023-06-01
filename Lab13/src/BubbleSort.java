public class BubbleSort {
    public static void bubbleSort(double[] darr) {
        int sorted = 0;
        double temp;
        while (sorted < darr.length - 1) {
            sorted = 0;
            for (int i = 0; i < darr.length - 1; ++i) {
                if (darr[i] > darr[i + 1]) {
                    temp = darr[i];
                    darr[i] = darr[i + 1];
                    darr[i + 1] = temp;
                } else {
                    sorted++;
                }
            }
        }
    }

    public static void print(double[] darr) {
        for (double d : darr) {
            System.out.printf("%f ", d);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double[] test = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        bubbleSort(test);
        print(test);
    }
}
