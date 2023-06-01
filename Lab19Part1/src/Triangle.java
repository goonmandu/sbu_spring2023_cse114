public class Triangle {
    private final double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (Math.max(Math.max(side1, side2), side3) / (side1 + side2 + side3) >= 0.5) {
            throw new IllegalTriangleException(side1, side2, side3);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return String.format("%f, %f, %f", side1, side2, side3);
    }

    public static void main(String[] args) {
        try {
            var t = new Triangle(1, 3, 1);
        } catch (IllegalTriangleException e) {
            System.err.println(e);
        }
    }
}
