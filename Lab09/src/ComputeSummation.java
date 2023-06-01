public class ComputeSummation {
    public static double xOverXPlusOne(int terms) {
        double ret = 0;
        for (int i = 1; i <= terms; ++i) {
            ret += (double) i / (i + 1);
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.printf("i\tm(i)\n");
        for (int i = 1; i <= 20; ++i) {
            System.out.printf("%d\t%.4f\n", i, xOverXPlusOne(i));
        }
    }
}
