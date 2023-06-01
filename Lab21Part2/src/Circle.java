public class Circle extends GeometricObject {
    private double x;
    private double y;
    private double radius;

    public Circle() {
        x = 0;
        y = 0;
        radius = 1;
    }
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }
    public double getArea() { return radius * radius * Math.PI; }

    public double getPerimeter() { return radius * 2 * Math.PI; }
    public boolean contains(double x, double y) {
        return Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) <= Math.pow(this.radius, 2);
    }
    public boolean contains(Circle circle) {
        double[][] points = {{circle.x - circle.radius, circle.y - circle.radius},
                {circle.x + circle.radius, circle.y - circle.radius},
                {circle.x - circle.radius, circle.y + circle.radius},
                {circle.x + circle.radius, circle.y + circle.radius}};
        for (double[] point : points) {
            if (!this.contains(point[0], point[1])) {
                return false;
            }
        }
        return true;
    }
    public boolean overlaps(Circle circle) {
        double dist = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));
        return this.radius + circle.radius > dist;
    }

    @Override
    public Object clone() {
        Circle ret = (Circle) super.clone();
        ret.x = this.x;
        ret.y = this.y;
        ret.radius = this.radius;
        return ret;
    }

    public boolean equals(Object rhs) throws IllegalArgumentException {
        if (rhs instanceof Circle) {

        }
        return this.radius == ((Circle) rhs).radius
                && this.x == ((Circle) rhs).x
                && this.y == ((Circle) rhs).y;
    }

    @Override
    public String toString() {
        return String.format("Circle at (%f, %f) with radius %f\n%s", x, y, radius, super.toString());
    }
}