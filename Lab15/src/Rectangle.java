public class Rectangle {
    private double height;
    private double width;
    private String color;
    public Rectangle() {
        this.height = 1;
        this.width = 1;
        this.color = "white";
    }
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        this.color = "white";
    }
    public String toString() { return String.format("Height: %f\nWidth: %f\nColor: %s", this.height, this.width, this.color); }
    public double getHeight() { return this.height; }
    public double getWidth() { return this.width; }
    public String getColor() { return this.color; }
    public void setHeight(double newHeight) { this.height = newHeight; }
    public void setWidth(double newWidth) { this.width = newWidth; }
    public void setColor(String newColor) { this.color = newColor; }
    public double getArea() { return this.width * this.height; }
    public double getPerimeter() { return 2 * (this.width + this.height); }
    public static void main(String[] args) {
        var r1 = new Rectangle(40, 4);
        var r2 = new Rectangle(35.9, 3.5);

        r1.setColor("red");
        r2.setColor("red");

        System.out.println("r1 properties:");
        System.out.println(r1);
        System.out.printf("getArea: %f\ngetPerimeter: %f\n", r1.getArea(), r1.getPerimeter());

        System.out.println("\nr2 properties:");
        System.out.println(r2);
        System.out.printf("getArea: %f\ngetPerimeter: %f\n", r2.getArea(), r2.getPerimeter());
    }
}
