/** CSE 114 (S23 Fodor) Homework 6, CookingRecipe.java
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.ArrayList;

public class CookingRecipe implements Cloneable {
    private String name;
    private ArrayList<RecipeIngredient> recipeIngredients = new ArrayList<>();

    public CookingRecipe(String name) {
        this.name = name;
    }

    public CookingRecipe(String name, ArrayList<RecipeIngredient> ingrarrl) {
        this.name = name;
        this.recipeIngredients = ingrarrl;
    }

    public String getName() { return name; }
    public ArrayList<RecipeIngredient> getRecipeIngredients() { return recipeIngredients; }
    public void setName(String newName) { this.name = newName; }
    public void setRecipeIngredients(ArrayList<RecipeIngredient> newIngrs) {
        this.recipeIngredients = newIngrs;
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
        boolean found = false;
        for (RecipeIngredient ri : recipeIngredients) {
            if (((Ingredient) ri).equals(ingredient)) {
                ri.setQuantity(quantity);
                found = true;
            }
        }
        if (!found) {
            recipeIngredients.add((RecipeIngredient) ingredient);
            recipeIngredients.get(recipeIngredients.size() - 1).setQuantity(quantity);
        }
    }

    public void addOrUpdateRecipeIngredient(RecipeIngredient ingredient) {
        addOrUpdateRecipeIngredient(ingredient, ingredient.getQuantity());
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
        for (RecipeIngredient ri : recipeIngredients) {
            if (ri.equals(ingredient)) {
                return ri;
            }
        }
        return null;
    }

    public RecipeIngredient getRecipeIngredient(String ingredientName) {
        for (RecipeIngredient ri : recipeIngredients) {
            if (ri.getName().equals(ingredientName)) {
                return ri;
            }
        }
        return null;
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
        int idx = 0;
        boolean found = false;
        RecipeIngredient ret = null;
        for (RecipeIngredient ri : recipeIngredients) {
            if (((Ingredient) ri).equals(ingredient)) {
                ret = (RecipeIngredient) ri.clone();
                found = true;
                break;
            }
            idx++;
        }
        if (found) {
            recipeIngredients.remove(idx);
        }
        return ret;
    }

    public RecipeIngredient removeRecipeIngredient(String ingredientName) {
        int idx = -1;
        RecipeIngredient ret = null;
        for (RecipeIngredient ri : recipeIngredients) {
            idx++;
            if (ri.getName().equals(ingredientName)) {
                ret = (RecipeIngredient) ri.clone();
                break;
            }
        }
        if (idx >= 0) {
            recipeIngredients.remove(idx);
        }
        return ret;
    }

    public float calculateCalories() {
        float ret = 0;
        for (RecipeIngredient ri : recipeIngredients) {
            ret += ri.getQuantity() * ri.getCaloriesPerUnit();
        }
        return ret;
    }

    public int getNumberOfIngredients() {
        return recipeIngredients.size();
    }

    public String stringifyIngredientsNewline() {
        String ret = "";
        for (RecipeIngredient ri : recipeIngredients) {
            ret += String.format("%s\n\n", ri);
        }
        return ret;
    }

    public String toString() {
        return String.format("[[[ Dish: <%s> ]]]\n\n%s", name, stringifyIngredientsNewline());
    }

    public boolean equals(Object rhs) throws IllegalArgumentException {
        if (!(rhs instanceof CookingRecipe)) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected argument type of CookingRecipe, got %s instead",
                            rhs.getClass().getName()
                    )
            );
        }
        return this.name.equals(((CookingRecipe) rhs).name)
                   && ArrayListHelper.arrayListEqualsIgnoreOrder(this.recipeIngredients, ((CookingRecipe) rhs).recipeIngredients);
    }

    public Object clone() {
        try {
            CookingRecipe ret = (CookingRecipe) super.clone();
            ret.setName(this.getName());
            ret.setRecipeIngredients(this.getRecipeIngredients());
            return ret;
        } catch (CloneNotSupportedException e) {
            System.err.println(e);
            return null;
        }
    }

    public boolean containsIngredients(ArrayList<RecipeIngredient> ingredList) {
        int count = 0;
        for (RecipeIngredient ri : ingredList) {
            if (this.recipeIngredients.contains(ri)) count++;
        }
        return count == ingredList.size();
    }
}
