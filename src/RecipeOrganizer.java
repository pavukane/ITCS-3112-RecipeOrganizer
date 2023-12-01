import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeOrganizer {
    private List<Recipe> recipes;

    public RecipeOrganizer() {
        this.recipes = new ArrayList<>();
        recipes.add(new Recipe("Sample Recipe A"));
        recipes.add(new Recipe("Sample Recipe B"));
        recipes.add(new Recipe("Sample Recipe C"));
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
    public boolean isRecipeIdExist(int recipeId){
        for (int i=0;i<recipes.size();i++){
            if (recipes.get(i).getRecipeID() == recipeId){
                return true;
            }
        }
        return false;
    }
    public void editRecipe(int recipeId, Recipe updatedRecipe) {
        boolean found = isRecipeIdExist(recipeId);
        for (int i=0;i<recipes.size();i++){
            if (recipes.get(i).getRecipeID() == recipeId){
                recipes.set(i, updatedRecipe);
                found = true;
                break;
            }
        }
        if (found) System.out.println("Recipe edited successfully!");
        else System.out.println("No recipe with that ID");
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
        if (found) System.out.println("Recipe deleted successfully!");
        else System.out.println("No recipe with that ID");
    }

    public void displayAllRecipes() {
        for (Recipe recipe : recipes) {
            System.out.println("Recipe name: " + recipe.getName());
            System.out.println("Ingredients: ");
            recipe.displayIngredients();
            System.out.println("Instructions: ");
            recipe.displayInstructions();
            System.out.println("=================================");
            // Display other recipe details as needed
        }
    }

    public void previewAllRecipes(){
        System.out.println("Current Recipes:");
        for (int i = 0; i < recipes.size(); i++) {
            System.out.println("ID: " + recipes.get(i).getRecipeID() + " | Name: " + recipes.get(i).getName());
        }
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public Recipe createNewRecipeFromUserInput(Scanner scanner){
        System.out.print("Enter recipe name: ");
        scanner.nextLine();
        String recipeName = scanner.nextLine();
        Recipe newRecipe = new Recipe(recipeName);

        boolean addIngredients = true;
        while (addIngredients) {
            System.out.println("Add Ingredient:");
            System.out.println("1. Add Ingredient");
            System.out.println("2. Finish Adding Ingredients");
            System.out.print("Select an option: ");
            int ingredientChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (ingredientChoice) {
                case 1:
                    System.out.print("Enter ingredient name: ");
                    String ingredientName = scanner.nextLine();
                    Ingredient ingredient = new Ingredient(ingredientName);
                    newRecipe.addIngredient(ingredient);
                    break;
                case 2:
                    addIngredients = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        boolean addInstructions = true;
        while (addInstructions) {
            System.out.println("Add Instruction:");
            System.out.println("1. Add Instruction");
            System.out.println("2. Finish Adding Instructions");
            System.out.print("Select an option: ");
            int instructionChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (instructionChoice) {
                case 1:
                    System.out.print("Enter instruction description: ");
                    String instructionDesc = scanner.nextLine();
                    Instruction instruction = new Instruction(instructionDesc);
                    newRecipe.addInstruction(instruction);
                    break;
                case 2:
                    addInstructions = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        return newRecipe;
    }
}
