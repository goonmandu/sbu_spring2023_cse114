import java.util.Scanner;

public class AreaOfTriangle {
    public static double areaOfTriangle(double base, double height) {
        return base * height / 2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base and height: ");
        double base = s.nextDouble();
        double height = s.nextDouble();
        System.out.printf("Area of triangle of base %f and height %f is %f\n", base, height, areaOfTriangle(base, height));
        s.close();
    }
}