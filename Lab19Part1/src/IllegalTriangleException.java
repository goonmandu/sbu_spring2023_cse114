public class IllegalTriangleException extends Exception {
    private final double[] sides = new double[3];

    public IllegalTriangleException(double side1, double side2, double side3) {
        super(String.format("Cannot construct a triangle with sides %f, %f, %f", side1, side2, side3));
        this.sides[0] = side1;
        this.sides[1] = side2;
        this.sides[2] = side3;
    }

    public double[] getSides() {
        return sides;
    }
}
