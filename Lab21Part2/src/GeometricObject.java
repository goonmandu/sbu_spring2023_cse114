import java.util.Date;

public abstract class GeometricObject
        implements Comparable, Cloneable {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }
    protected GeometricObject(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public java.util.Date getDateCreated() { return dateCreated; }
    public String toString() {
        return "color: " + color + ", filled: " + filled
                + ", created on " + dateCreated;
    }

    public int compareTo(Object rhs) throws IllegalArgumentException {
        if (rhs instanceof GeometricObject sanit) {
            return (int) ((sanit.getArea() - this.getArea())
                    / Math.abs(sanit.getArea() - this.getArea()));
        } else {
            throw new IllegalArgumentException("Expected argument type of GeometricObject");
        }
    }

    public Object clone() {
        try {
            GeometricObject ret = (GeometricObject) super.clone();
            ret.color = this.color;  // Strings are immutable
            ret.filled = this.filled;  // boolean primitive
            ret.dateCreated = (Date) this.dateCreated.clone();
            return ret;
        } catch (CloneNotSupportedException e) {
            System.err.println("Clone not supported!");
            return null;
        }
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public static GeometricObject max(GeometricObject go1, GeometricObject go2) {
        if (go1.getArea() < go2.getArea()) {
            return go2;
        } else {
            return go1;
        }
    }
}

