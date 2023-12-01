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
                    // Add Recipe
                    System.out.print("Enter recipe name: ");
                    scanner.nextLine();
                    String recipeName = scanner.nextLine();
                    Recipe newRecipe = new Recipe(recipeName); // Hardcoded ID for demonstration

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
                                Ingredient ingredient = new Ingredient(ingredientName); // Hardcoded ID for demonstration
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
                                Instruction instruction = new Instruction(instructionDesc); // Hardcoded ID for demonstration
                                newRecipe.addInstruction(instruction);
                                break;
                            case 2:
                                addInstructions = false;
                                break;
                            default:
                                System.out.println("Invalid choice. Please try again.");
                        }
                    }

                    recipeOrganizer.addRecipe(newRecipe);
                    System.out.println("Recipe added successfully!");
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