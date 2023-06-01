import java.util.ArrayList;

public class GPA {
    public static double gpaCalculator(String[] grades) {
        double sum = 0;
        for (String grade : grades) {
            switch (grade) {
                case "A" -> sum += 4;
                case "A-" -> sum += 3.67;
                case "B+" -> sum += 3.33;
                case "B" -> sum += 3;
                case "B-" -> sum += 2.67;
                case "C+" -> sum += 2.33;
                case "C" -> sum += 2;
                case "C-" -> sum += 1.67;
                case "D+" -> sum += 1.33;
                case "D" -> sum += 1;
                case "F" -> sum += 0;
                default -> { return -1; }
            }
        }
        return sum / grades.length;
    }
    public static void main(String[] args) {
        System.out.printf("Test cases: %f, %f, %f\n", gpaCalculator(new String[] {"A", "F", "C", "B"}),
                                                      gpaCalculator(new String[] {"A-", "B-", "C-", "F"}),
                                                      gpaCalculator(new String[] {"F", "C+", "D+", "A+"}));
    }
}
