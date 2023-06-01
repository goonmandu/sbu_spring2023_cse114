/** CSE 114 (S23 Fodor) Homework 6, RecipeIngredient.java
 * @author Mingi Hwang
 * @author 114639231
 */

public class RecipeIngredient extends Ingredient implements Cloneable {
    private float quantity;

    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }

    public RecipeIngredient(Ingredient base, float quantity) {
        super(base.getName(), base.getMeasuringUnit(), base.getCaloriesPerUnit());
        this.quantity = quantity;
    }

    public RecipeIngredient(Ingredient base, double quantity) {
        super(base.getName(), base.getMeasuringUnit(), base.getCaloriesPerUnit());
        this.quantity = (float) quantity;
    }

    public float getQuantity() { return quantity; }
    public void setQuantity(float newQuantity) { this.quantity = newQuantity; }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "quantity = %f",
                super.toString(), quantity);
    }

    public Object clone() {
        try {
            RecipeIngredient ret = (RecipeIngredient) super.clone();
            ret.setName(this.getName());
            ret.setMeasuringUnit(this.getMeasuringUnit());
            ret.setCaloriesPerUnit(this.getCaloriesPerUnit());
            ret.setQuantity(this.getQuantity());
            return ret;
        } catch (CloneNotSupportedException e) {
            System.err.println(e);
            return null;
        }
    }

    public boolean equals(Object rhs) throws IllegalArgumentException {
        if (!(rhs instanceof RecipeIngredient)) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected argument type of RecipeIngredient, got %s instead",
                            rhs.getClass().getName()
                    )
            );
        }
        return super.equals(rhs)
                && this.quantity == ((RecipeIngredient) rhs).quantity;
    }
}
