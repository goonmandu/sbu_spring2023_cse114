public class ArrayUtils {
    public static int randint(int lbIncl, int ubExcl) {
        return (int) (Math.random() * (ubExcl - lbIncl)) + lbIncl;
    }
    public static int[] randomArray(int len, int ubIncl) {
        int[] ret = new int[len];
        for (int i = 0; i < len; ++i) {
            ret[i] = randint(0, ubIncl + 1);
        }
        return ret;
    }

    public static void print(int[] iarr) {
        for (int i : iarr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static int arraySum(int[] iarr) {
        int ret = 0;
        for (int i : iarr) {
            ret += i;
        }
        return ret;
    }

    public static double arrayAverage(int[] iarr) {
        return (double) arraySum(iarr) / iarr.length;
    }

    public static int contains(int[] iarr, int target) {
        for (int i = 0; i < iarr.length; ++i) {
            if (iarr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int countMultiplesOf(int[] iarr, int target) {
        int ret = 0;
        for (int i : iarr) {
            if (i % target == 0) {
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        var questionA = randomArray(100, 21);
        print(questionA);
        System.out.printf("Average: %f\n", arrayAverage(questionA));
        System.out.printf("Index at first occurrence of target: %d\n", contains(questionA, 12));
        System.out.printf("Multiples of target: %d\n", countMultiplesOf(questionA, 7));
    }
}
