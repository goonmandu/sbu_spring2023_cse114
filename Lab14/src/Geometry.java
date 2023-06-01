import java.util.*;

public class Geometry {
    public static double getTriangleArea(double[][] points) {
        // Uses the shoelace formula.
        // { points
        //  P1 { x1, y1 },
        //  P2 { x2, y2 },
        //  P3 { x3, y3 }
        // }
        if ((points[1][1] - points[0][1]) / (points[1][0] - points[0][0])
                == (points[2][1] - points[1][1]) / (points[2][0] - points[1][0])) {
            return -1;
        }
        return Math.abs(
                (points[0][0] * points[1][1] + points[1][0] * points[2][1] + points[2][0] * points[0][1])
              - (points[1][0] * points[0][1] + points[2][0] * points[1][1] + points[0][0] * points[2][1])
        ) / 2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] points = new double[3][2];
        System.out.printf("Enter x1 y1 x2 y2 x3 y3: ");
        for (int point = 0; point < 3; ++point) {
            for (int loc = 0; loc < 2; ++loc) {
                points[point][loc] = s.nextDouble();
            }
        }
        double result = getTriangleArea(points);
        if (result >= 0) {
            System.out.printf("Area is %f\n.", result);
        } else {
            System.out.printf("Three points are all on the same line.");
        }
    }
}
