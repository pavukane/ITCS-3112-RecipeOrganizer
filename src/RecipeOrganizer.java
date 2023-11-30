import java.util.ArrayList;
import java.util.List;

public class RecipeOrganizer {
    private List<Recipe> recipes;

    public RecipeOrganizer() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public void editRecipe(int index, Recipe recipe) {
        if (index >= 0 && index < recipes.size()) {
            recipes.set(index, recipe);
        } else {
            System.out.println("Invalid index");
        }
    }

    public void deleteRecipe(int index) {
        if (index >= 0 && index < recipes.size()) {
            recipes.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    public void displayAllRecipes() {
        for (Recipe recipe : recipes) {
            recipe.displayIngredients();
            recipe.displayInstructions();
            // Display other recipe details as needed
        }
    }
}
