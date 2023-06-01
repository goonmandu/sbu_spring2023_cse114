public class Square extends GeometricObject {
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
    public Object clone() {
        Square ret = (Square) super.clone();
        ret.sideLength = this.sideLength;
        return ret;
    }

    public boolean equals(Square rhs) {
        return this.sideLength == rhs.sideLength;
    }
}
