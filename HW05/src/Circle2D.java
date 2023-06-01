/** CSE 114 (S23 Fodor) Homework 5, Part 5
 * @author Mingi Hwang
 * @author 114639231
 */

public class Circle2D {
    private final double x;
    private final double y;
    private final double radius;

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }
    public Circle2D(double x, double y, double radius) {
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
    public boolean contains(Circle2D circle) {
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
    public boolean overlaps(Circle2D circle) {
        double dist = Math.sqrt(Math.pow(this.x - circle.x, 2) + Math.pow(this.y - circle.y, 2));
        return this.radius + circle.radius > dist;
    }

    public static void main(String[] args) {
        var c1 = new Circle2D(2, 2, 5.5);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.contains(3, 3));
        // the new Circle2D instance contains c1, but not vice versa
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
