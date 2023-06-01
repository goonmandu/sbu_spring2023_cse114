/** CSE 114 (S23 Fodor) Homework 6, Ingredient.java
 * @author Mingi Hwang
 * @author 114639231
 */

public class Ingredient {
    private String name;
    private String measuringUnit;
    private int caloriesPerUnit;

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public String getName() { return name; }
    public String getMeasuringUnit() { return measuringUnit; }
    public int getCaloriesPerUnit() { return caloriesPerUnit; }

    public void setName(String newName) { this.name = newName; }
    public void setMeasuringUnit(String newUnit) { this.measuringUnit = newUnit; }
    public void setCaloriesPerUnit(int newCalsPerUnit) { this.caloriesPerUnit = newCalsPerUnit; }

    @Override
    public String toString() {
        return String.format("Ingredient\n" +
                "name = %s\n" +
                "measuringUnit = %s\n" +
                "caloriesPerUnit = %d",
                name, measuringUnit, caloriesPerUnit);
    }

    public boolean equals(Object rhs) throws IllegalArgumentException {
        if (!(rhs instanceof Ingredient)) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected argument type of Ingredient, got %s instead",
                            rhs.getClass().getName()
                    )
            );
        }
        return this.name.equals(((Ingredient) rhs).name)
                && this.measuringUnit.equals(((Ingredient) rhs).measuringUnit)
                && this.caloriesPerUnit == ((Ingredient) rhs).caloriesPerUnit;
    }
}
