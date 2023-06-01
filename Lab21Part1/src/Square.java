public class Square extends GeometricObject
        implements Colorable {
    private double sideLength = 1;
    public Square() {
        super();
    }
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    public Square(double sideLength, String color, boolean filled) {
        this(sideLength);
        this.setColor(color);
        this.setFilled(filled);
    }
    public double getSideLength() { return sideLength; }

    @Override
    public double getPerimeter() { return 4 * sideLength; }
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return String.format("Square with side length %.2f\n%s\nArea: %f\nPerimeter: %f",
                sideLength,
                super.toString(),
                getArea(),
                getPerimeter());
    }

    @Override
    public void howToColor() {
        System.out.printf("1. Color the edges of the square (length %.2f) first.\n" +
                "2. Color the insides of the square, and use the pre-colored edges as a\n" +
                "   buffer between the uncolored region and the outside of the square so that\n" +
                "   you don't accidentally color outside of the square.\n",
                sideLength);
    }
}
