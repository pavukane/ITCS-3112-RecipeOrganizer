import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecipeOrganizer recipeOrganizer = new RecipeOrganizer();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;
        while (!exit){
            System.out.println("Recipe Organizer Menu:");
            System.out.println("1. Add Recipe");
            System.out.println("2. Edit Recipe");
            System.out.println("3. Delete Recipe");
            System.out.println("4. Show All Recipes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Recipe
                    Recipe newRecipe = recipeOrganizer.createNewRecipeFromUserInput(scanner);
                    recipeOrganizer.addRecipe(newRecipe);
                    System.out.println("Recipe added successfully!");
                    break;
                case 2:
                    System.out.println("Current Recipes:");
                    List<Recipe> currentRecipes = recipeOrganizer.getRecipes();
                    for (int i = 0; i < currentRecipes.size(); i++) {
                        System.out.println("ID: " + currentRecipes.get(i).getRecipeID() + " | Name: " + currentRecipes.get(i).getName());
                    }

                    System.out.print("Enter the recipe ID to edit: ");
                    int editRecipeID = scanner.nextInt();

                    Recipe updatedRecipe = recipeOrganizer.createNewRecipeFromUserInput(scanner);
                    recipeOrganizer.editRecipe(editRecipeID, updatedRecipe);
                    System.out.println("Recipe edited successfully!");
                    break;
                case 3:
                    // Delete Recipe
                    // You can prompt the user for the index of the recipe to delete
                    // Then delete the recipe by index using recipeOrganizer.deleteRecipe(index);
                    break;
                case 4:
                    // Show All Recipes
                    recipeOrganizer.displayAllRecipes();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }

        scanner.close();
    }
}