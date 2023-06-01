public class LiquidFood extends Food {
    private double viscosity;

    public double getViscosity() { return viscosity; }
    public void setViscosity(double newViscosity) {
        this.viscosity = newViscosity;
    }

    public int caloriesInServings(int servings) {
        return servings * caloriesPerServing;
    }

    public boolean equals(Food rhs) {
        return this.getClass() == rhs.getClass()
                && this.description.equals(rhs.description)
                && this.caloriesPerServing == rhs.caloriesPerServing
                && this.viscosity == ((LiquidFood) rhs).viscosity;
    }

    public String toString() {
        return String.format("%s, Viscosity: %f", super.toString(), viscosity);
    }

    public LiquidFood(String description, int caloriesPerServing, double viscosity) {
        super(description, caloriesPerServing);
        this.viscosity = viscosity;
    }
}
