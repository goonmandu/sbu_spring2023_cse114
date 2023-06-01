public class Triangle extends GeometricObject {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    public Triangle() {
        super();
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this(side1, side2, side3);
        this.setColor(color);
        this.setFilled(filled);
    }
    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public double getArea() {
        double semiPerim = getPerimeter() / 2;
        return Math.sqrt(semiPerim * (semiPerim - side1) * (semiPerim - side2) * (semiPerim - side3));
    }

    @Override
    public String toString() {
        return String.format("Triangle with side lengths (%f, %f, %f)\n%s\nArea: %f\nPerimeter: %f",
                side1, side2, side3,
                super.toString(),
                getArea(),
                getPerimeter());
    }

    public static void main(String[] args) {
        var t1 = new Triangle(1, 1.5, 1, "yellow", true);
        System.out.println(t1);
    }
}
