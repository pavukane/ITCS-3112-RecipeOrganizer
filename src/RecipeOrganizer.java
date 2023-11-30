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

    public void editRecipe(int recipeId, Recipe updatedRecipe) {
        boolean found = false;
        for (int i=0;i<recipes.size();i++){
            if (recipes.get(i).getRecipeID() == recipeId){
                recipes.set(i, updatedRecipe);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("No recipe with that ID");
        }
    }

    public void deleteRecipe(int recipeId) {
        boolean found = false;
        for (int i=0;i<recipes.size();i++){
            if (recipes.get(i).getRecipeID() == recipeId){
                recipes.remove(i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("No recipe with that ID");
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
