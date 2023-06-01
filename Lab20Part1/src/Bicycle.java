public class Bicycle extends Vehicle {
    public Bicycle(String owner) {
        super(owner, 2);
    }

    public String toString() {
        return String.format("%s's %s: %d wheels", owner, getClass().getName(), wheels);
    }

    public boolean equals(Vehicle rhs) {
        if (this.getClass() != rhs.getClass()) {
            return false;
        }
        return this.owner.equals(rhs.owner);
    }
}
