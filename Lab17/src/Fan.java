public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed;
    private boolean powerStatus;
    private double radius;
    private String color;
    public Fan() {
        this.speed = SLOW;
        this.powerStatus = false;
        this.radius = 5;
        this.color = "blue";
    }
    public Fan(int speed, boolean powerStatus, double radius, String color) {
        this.speed = speed;
        this.powerStatus = powerStatus;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean getPowerStatus() {
        return powerStatus;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPowerStatus(boolean powerStatus) {
        this.powerStatus = powerStatus;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String toString() {
        String speedString;
        if (speed == SLOW) {
            speedString = "SLOW";
        } else if (speed == MEDIUM) {
            speedString = "MEDIUM";
        } else {
            speedString = "FAST";
        }
        if (powerStatus) {
            return String.format("Speed: %s\nColor: %s\nRadius: %f\n", speedString, color, radius);
        } else {
            return String.format("Fan is OFF\nColor: %s\nRadius: %f\n", color, radius);
        }
    }
    public static void main(String[] args) {
        Fan f1 = new Fan(FAST, true, 10, "yellow");
        Fan f2 = new Fan(MEDIUM, false, 5, "blue");
        System.out.println(f1);
        System.out.println(f2);
    }
}
