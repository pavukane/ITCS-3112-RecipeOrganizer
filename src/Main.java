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
                    recipeOrganizer.previewAllRecipes();

                    System.out.print("Enter the recipe ID to edit: ");
                    int editRecipeID = scanner.nextInt();
                    if (!recipeOrganizer.isRecipeIdExist(editRecipeID)) {
                        System.out.println("No recipe with that ID");
                        break;
                    }
                    Recipe updatedRecipe = recipeOrganizer.createNewRecipeFromUserInput(scanner);
                    recipeOrganizer.editRecipe(editRecipeID, updatedRecipe);
                    break;
                case 3:
                    // Display all current recipes' names and IDs
                    recipeOrganizer.previewAllRecipes();

                    System.out.print("Enter the recipe ID to delete: ");
                    int deleteRecipeID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    recipeOrganizer.deleteRecipe(deleteRecipeID);
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