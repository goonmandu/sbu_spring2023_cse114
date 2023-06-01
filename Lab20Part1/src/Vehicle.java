public abstract class Vehicle {
    protected String owner;
    protected int wheels;

    protected Vehicle(String owner, int wheels) {
        this.owner = owner;
        this.wheels = wheels;
    }

    public int getWheels() { return wheels; }
    public String getOwner() { return owner; }
    public void setWheels(int wheels) { this.wheels = wheels; }
    public void setOwner(String owner) { this.owner = owner; }

    @Override
    public abstract String toString();
    public abstract boolean equals(Vehicle rhs);

    public static void main(String[] args) {
        // CSE 114: Java
        Bicycle fodorsBike = new Bicycle("Fodor");
        // ESE 224: C++
        Bicycle xinWangsBike = new Bicycle("Wang");
        // ESE 118: Digital Logic Design
        MotorizedVehicle mildersSedan = new MotorizedVehicle("Milder", 4, 1.9);
        // ESE 124: C
        MotorizedVehicle dobolisMotorcycle = new MotorizedVehicle("Doboli", 2, 0.92);

        System.out.println(fodorsBike);
        System.out.println(xinWangsBike);
        System.out.println(mildersSedan);
        System.out.println(dobolisMotorcycle);

        // Are two bikes with different owners the same?
        // Fodor's bicycle yoinked by Tripathi
        System.out.println("\nTripathi buys Fodor's bicycle.");
        fodorsBike.setOwner("Tripathi");
        System.out.println(fodorsBike);
        System.out.printf("Is now-Tripathi's bike the same as Wang's?\n%b\n\n",
                fodorsBike.equals(xinWangsBike));

        // Is a motorcycle the same thing as a bike, when they have the same owner?
        // Doboli's motorcycle yoinked by Xin Wang
        System.out.println("Wang buys Doboli's motorcycle.");
        dobolisMotorcycle.setOwner("Wang");
        System.out.println(dobolisMotorcycle);
        System.out.printf("Is now-Wang's motorcycle the same as Wang's bike?\n%b\n\n",
                xinWangsBike.equals(dobolisMotorcycle));

        // Is a bike the same thing as another bike, when they have the same owner?
        // Tripathi's bike yoinked by Wang
        System.out.println("Wang buys Tripathi's bicycle.");
        fodorsBike.setOwner("Wang");
        System.out.println(fodorsBike);
        System.out.printf("Is now-Wang's bike the same as Wang's bike?\n%b\n",
                fodorsBike.equals(xinWangsBike));
    }
}