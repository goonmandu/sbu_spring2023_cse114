public class MotorizedVehicle extends Vehicle {
    private double engineDisplVol;
    
    public double horsepower() {
        return engineDisplVol * wheels;
    }
    
    public MotorizedVehicle(String owner, int wheels, double engineDisplVol) {
        super(owner, wheels);
        this.engineDisplVol = engineDisplVol;
    }
    
    public double getEngineDisplVol() { return engineDisplVol; }
    public void setEngineDisplVol(double liters) {
        this.engineDisplVol = liters;
    }
    
    public String toString() {
        return String.format("%s's %s: %d wheels, EngineDispl: %f L, %f HP",
                owner, getClass().getName(), wheels, engineDisplVol, horsepower());
    }
    
    public boolean equals(Vehicle rhs) {
        if (this.getClass() != rhs.getClass()) {
            return false;
        }
        return this.owner.equals(rhs.owner)
                && this.engineDisplVol == ((MotorizedVehicle) rhs).engineDisplVol
                && this.wheels == rhs.wheels;
    }
}
