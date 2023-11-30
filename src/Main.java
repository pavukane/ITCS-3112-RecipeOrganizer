import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecipeOrganizer recipeOrganizer = new RecipeOrganizer();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
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

                    break;
                case 2:
                    // Edit Recipe
                    // You can prompt the user for the index of the recipe to edit
                    // Then retrieve the recipe by index using recipeOrganizer.editRecipe(index, newRecipe);
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
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}