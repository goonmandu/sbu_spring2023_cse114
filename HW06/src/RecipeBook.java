/** CSE 114 (S23 Fodor) Homework 6, RecipeBook.java
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.ArrayList;
import java.util.HashSet;

public class RecipeBook {
    private String bookName;
    private ArrayList<CookingRecipe> recipes = new ArrayList<>();

    public RecipeBook(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() { return bookName; }
    public ArrayList<CookingRecipe> getRecipes() { return recipes; }
    public void setBookName(String newBookName) { this.bookName = newBookName; }
    public void setRecipes(ArrayList<CookingRecipe> newRecipes) { this.recipes = newRecipes; }

    public CookingRecipe addRecipe(String name, ArrayList<RecipeIngredient> ingredients) {
        CookingRecipe ret = new CookingRecipe(name, ingredients);
        boolean found = false;
        for (CookingRecipe recipe : recipes) {
            if (recipe.equals(ret)) {
                found = true;
                break;
            }
        }
        if (!found) {
            recipes.add(ret);
            return ret;
        } else {
            return null;
        }
    }

    public CookingRecipe addRecipe(CookingRecipe recipe) {
        return addRecipe(recipe.getName(), recipe.getRecipeIngredients());
    }

    public CookingRecipe removeRecipe(String name) {
        int idx = 0;
        boolean found = false;
        CookingRecipe ret = null;
        for (CookingRecipe recipe : recipes) {
            if (recipe.getName().equals(name)) {
                ret = (CookingRecipe) recipe.clone();
                found = true;
                break;
            }
            idx++;
        }
        if (found) {
            recipes.remove(idx);
        }
        return ret;
    }

    public ArrayList<CookingRecipe> findRecipes(ArrayList<RecipeIngredient> ingredients) {
        ArrayList<CookingRecipe> ret = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.containsIngredients(ingredients)) ret.add(recipe);
        }
        return ret.size() == 0 ? null : ret;
    }

    public ArrayList<CookingRecipe> findRecipesWithFewIngredients(int numberOfIngredients) {
        ArrayList<CookingRecipe> ret = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.getNumberOfIngredients() < numberOfIngredients + 1) ret.add(recipe);
        }
        return ret.size() == 0 ? null : ret;
    }

    public ArrayList<CookingRecipe> findRecipesLowCalories() {
        ArrayList<CookingRecipe> ret = new ArrayList<>();
        float lowestCals = Float.MAX_VALUE;
        for (CookingRecipe recipe : recipes) {
            if (lowestCals > recipe.calculateCalories()) lowestCals = recipe.calculateCalories();
        }
        for (CookingRecipe recipe : recipes) {
            if (lowestCals == recipe.calculateCalories()) ret.add(recipe);
        }
        return ret.size() == 0 ? null : ret;
    }

    public String toString() {
        String ret = "";
        for (CookingRecipe recipe : recipes) {
            ret += String.format("%s\n", recipe.getName());
        }
        return String.format("RecipeBook \"%s\":\n\n%s", bookName, ret);
    }

    public boolean equals(Object rhs) {
        if (!(rhs instanceof RecipeBook)) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected argument type of RecipeBook, got %s instead",
                            rhs.getClass().getName()
                    )
            );
        }
        RecipeBook cast = (RecipeBook) rhs;
        HashSet<CookingRecipe> thisRecipes = new HashSet<>(this.recipes);
        HashSet<CookingRecipe> rhsRecipes = new HashSet<>(cast.recipes);
        HashSet<HashSet<RecipeIngredient>> thisRecipesIngredients = new HashSet<>();
        HashSet<HashSet<RecipeIngredient>> rhsRecipesIngredients = new HashSet<>();
        for (CookingRecipe thisRecipe : thisRecipes) {
            thisRecipesIngredients.add(new HashSet<>(thisRecipe.getRecipeIngredients()));
        }
        for (CookingRecipe rhsRecipe : rhsRecipes) {
            rhsRecipesIngredients.add(new HashSet<>(rhsRecipe.getRecipeIngredients()));
        }
        boolean nameIsSame = this.bookName.equals(cast.bookName);
        // boolean recipesAreSame = thisRecipes.equals(rhsRecipes);
        boolean recipeIngredientsAreSame = thisRecipesIngredients.equals(rhsRecipesIngredients);

        return nameIsSame && recipeIngredientsAreSame;
    }
}
