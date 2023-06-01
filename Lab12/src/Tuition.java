public class Tuition {
    public static double tuitionAfterYears(int initial, double percentIncrease, int years) {
        return initial * Math.pow((1 + percentIncrease / 100), years);
    }
    public static void main(String[] args) {
        double afterTenYears = tuitionAfterYears(10000, 5, 10);
        double fourYearCostAfterTenYears = 0;
        for (int i = 0; i < 4; ++i) {
            fourYearCostAfterTenYears += tuitionAfterYears(10000, 5, 10 + i);
        }
        System.out.printf("Tenth year tuition: $%.2f\n", afterTenYears);
        System.out.printf("Four-year tuition after ten years: $%.2f\n", fourYearCostAfterTenYears);
    }
}
