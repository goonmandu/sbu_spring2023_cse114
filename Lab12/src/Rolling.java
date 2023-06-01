public class Rolling {
    static class TwoDice {
        public int first;
        public int second;
        public int sum;
        public TwoDice(int first, int second) {
            this.first = first;
            this.second = second;
            this.sum = first + second;
        }
        public String toString() {
            return String.format("First die:  %d\nSecond die: %d\nTotal roll: %d\n", this.first, this.second, this.sum);
        }
    }
    public static int randint(int lbIncl, int ubExcl) {
        return (int) (Math.random() * (ubExcl - lbIncl)) + lbIncl;
    }
    public static TwoDice rollTwoDice() {
        return new TwoDice(randint(1, 7), randint(1, 7));
    }
    public static void main(String[] args) {
        System.out.println(rollTwoDice());
    }
}
