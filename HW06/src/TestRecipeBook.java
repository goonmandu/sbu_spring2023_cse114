/** CSE 114 (S23 Fodor) Homework 6, TestRecipeBook.java
 * @author Mingi Hwang
 * @author 114639231
 */

import java.util.ArrayList;
import static java.util.Arrays.asList;

public class TestRecipeBook {
    public static void main(String[] args) {

        /* Note: Not all methods were explicitly tested as they would automatically be invoked
         *       when calling the methods that use those methods anyway. Methods that are not
         *       invoked in other methods were either simple getter/setter methods, or were
         *       indeed called explicitly to demonstrate that their functions work as intended.
         */

        Ingredient kimchi = new Ingredient("Kimchi", "100g", 40);
        Ingredient kimchiJuice = new Ingredient("Kimchi Juice", "100ml", 40);
        Ingredient porkShoulder = new Ingredient("Pork Shoulder", "100g", 236);
        Ingredient onion = new Ingredient("Onion", "wholes", 44);
        Ingredient garlicCloves = new Ingredient("Garlic Cloves", "cloves", 13);
        Ingredient serrano = new Ingredient("Serrano Pepper", "100g", 32);
        Ingredient greenOnion = new Ingredient("Green Onion", "100g", 32);
        Ingredient garlicGround = new Ingredient("Ground Garlic", "tbsp", 28);
        Ingredient cookingWine = new Ingredient("Cooking Wine", "tbsp", 29);
        Ingredient pepper = new Ingredient("Pepper", "tbsp", 17);
        Ingredient sesameOil = new Ingredient("Sesame Oil", "tbsp", 130);
        Ingredient sugar = new Ingredient("Sugar", "tbsp", 48);
        Ingredient beefTenderloin = new Ingredient("Beef Tenderloin", "100g", 324);
        Ingredient salt = new Ingredient("Salt", "tbsp", 0);
        Ingredient butter = new Ingredient("Butter", "100g", 717);

        RecipeIngredient kimchi_500g = new RecipeIngredient(kimchi, 5);
        RecipeIngredient porkShoulder_300g = new RecipeIngredient(porkShoulder, 3);
        RecipeIngredient onion_half = new RecipeIngredient(onion, 0.5);
        RecipeIngredient garlicCloves_four = new RecipeIngredient(garlicCloves, 4);
        RecipeIngredient serrano_10g = new RecipeIngredient(serrano, 0.1);
        RecipeIngredient greenOnion_20g = new RecipeIngredient(greenOnion, 0.2);
        RecipeIngredient garlicGround_halftbsp = new RecipeIngredient(garlicGround, 0.5);
        RecipeIngredient cookingWine_1tbsp = new RecipeIngredient(cookingWine, 1);
        // RecipeIngredient pepper_quartertbsp = new RecipeIngredient(pepper, 0.25);
        RecipeIngredient sesameOil_1tbsp = new RecipeIngredient(sesameOil, 2);
        RecipeIngredient sugar_halftbsp = new RecipeIngredient(sugar, 0.5);
        RecipeIngredient kimchiJuice_50ml = new RecipeIngredient(kimchiJuice, 0.5);

        RecipeIngredient beefTenderloin_250g = new RecipeIngredient(beefTenderloin, 2.5);
        RecipeIngredient salt_quartertbsp = new RecipeIngredient(salt, 0.25);
        RecipeIngredient butter_30g = new RecipeIngredient(butter, 0.3);
        RecipeIngredient pepper_halftbsp = new RecipeIngredient(pepper, 0.5);

        ArrayList<RecipeIngredient> stirFriedKimchiAndPorkList = new ArrayList<>(asList(
                kimchi_500g,
                porkShoulder_300g,
                onion_half,
                garlicCloves_four,
                serrano_10g,
                greenOnion_20g,
                garlicGround_halftbsp,
                cookingWine_1tbsp,
                pepper_halftbsp,
                sesameOil_1tbsp,
                sugar_halftbsp,
                kimchiJuice_50ml
        ));
        ArrayList<RecipeIngredient> tenderloinSteakList = new ArrayList<>(asList(
                beefTenderloin_250g,
                salt_quartertbsp,
                butter_30g,
                pepper_halftbsp
        ));
        ArrayList<RecipeIngredient> partialList = new ArrayList<>(asList(
                pepper_halftbsp
        ));

        CookingRecipe stirFriedKimchiAndPork = new CookingRecipe("Stir Fried Kimchi and Pork", stirFriedKimchiAndPorkList);
        CookingRecipe tenderloinSteak = new CookingRecipe("Tenderloin Steak", tenderloinSteakList);

        RecipeBook testbook = new RecipeBook("Favorites");
        testbook.addRecipe(stirFriedKimchiAndPork);
        testbook.addRecipe(tenderloinSteak);

        RecipeBook comparebook = new RecipeBook("Favorites");
        comparebook.addRecipe(tenderloinSteak);
        comparebook.addRecipe(stirFriedKimchiAndPork);

        System.out.println("======== Invoking the toString() method of testbook ========\n");
        System.out.println(testbook);

        System.out.println("\n======== Invoking the toString() method of comparebook ========\n");
        System.out.println(comparebook);

        System.out.println("\n======== Seeing if testbook is the same as comparebook ========\n");
        System.out.println(testbook.equals(comparebook));              // Should print true

        System.out.println("\n======== Printing the recipes that have ingredients in partialList ========\n");
        ArrayListHelper.printline(testbook.findRecipes(partialList));  // Should print both recipes

        System.out.println("\n======== Printing the recipe with the lowest calories ========\n");
        ArrayListHelper.printline(testbook.findRecipesLowCalories());  // Should print

        System.out.println("\n======== Printing the recipe with <=8 ingredients ========\n");
        ArrayListHelper.printline(testbook.findRecipesWithFewIngredients(8));

        System.out.println("\n========  Deleting beefTenderloin from tenderloinSteak recipe   ========\n" +
                             "======== by invoking the method that takes an Ingredient object ========\n");
        tenderloinSteak.removeRecipeIngredient(beefTenderloin_250g);
        System.out.println("\n========     Deleting pepper from tenderloinSteak recipe     ========\n" +
                             "======== by invoking the method that takes an String object  ========\n");
        tenderloinSteak.removeRecipeIngredient("Pepper");
        System.out.println(tenderloinSteak);

        System.out.println("\n======== Deleting stirFriedKimchiAndPork from tenderloinSteak recipe from testbook ========\n");
        testbook.removeRecipe("Stir Fried Kimchi and Pork");
        System.out.println(testbook);

        System.out.println("\n======== Adding porkShoulder, 300g to tenderloinSteak ========\n");
        tenderloinSteak.addOrUpdateRecipeIngredient(porkShoulder_300g);
        System.out.println(tenderloinSteak);

        System.out.println("\n======== Seeing if salt exists in tenderloinSteak via String ========\n");
        System.out.println(tenderloinSteak.getRecipeIngredient("Salt"));

        System.out.println("\n======== Seeing if salt exists in tenderloinSteak via Ingredient object ========\n");
        System.out.println(tenderloinSteak.getRecipeIngredient(salt_quartertbsp));
    }
}
