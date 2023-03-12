package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ingredient i1 = new Ingredient(200, "gram", "ongezouten roomboter");
        Ingredient i2 = new Ingredient(200, "gram", "witte bastard suiker");
        Ingredient i3 = new Ingredient (400, "gram", "zelfrijzend bakmeel");
        Ingredient i4 = new Ingredient (8, "gram", "vanillesuiker");
        Ingredient i5 = new Ingredient (1, "snuf", "zout");
        Ingredient i6 = new Ingredient (1.5, "kilo", "zoetzure appels");
        Ingredient i7 = new Ingredient (75, "gram", "kristal suiker");
        Ingredient i8 = new Ingredient (3, "theelepels", "kaneel");
        Ingredient i9 = new Ingredient (15, "gram", "paneermeel");

        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(i1);
        ingredients.add(i2);
        ingredients.add(i3);
        ingredients.add(i4);
        ingredients.add(i5);
        ingredients.add(i6);
        ingredients.add(i7);
        ingredients.add(i8);
        ingredients.add(i9);

        for (Ingredient i : ingredients) {
            i.print();
        }

        ApplePieRecipe.step1();
        ApplePieRecipe.step2();
        ApplePieRecipe.step3();
        ApplePieRecipe.step4();
        ApplePieRecipe.step5();
        ApplePieRecipe.step6();
        ApplePieRecipe.step7();
        ApplePieRecipe.step8();
        ApplePieRecipe.step9();
        ApplePieRecipe.step10();
    }
}
