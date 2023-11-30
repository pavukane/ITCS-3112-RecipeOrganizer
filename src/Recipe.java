import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private int recipeID;
    private String name;
    private List<Ingredient> ingredients;
    private List<Instruction> instructions;
    private List<Tool> tools;

    public Recipe(int recipeID, String name) {
        this.recipeID = recipeID;
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.instructions = new ArrayList<>();
        this.tools = new ArrayList<>();
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    public void addInstruction(int index, Instruction instruction) {
        instructions.add(index, instruction);
    }

    public void removeInstruction(int index) {
        if (index >= 0 && index < instructions.size()) {
            instructions.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    public void displayIngredients() {
        for (Ingredient ingredient : ingredients) {
            ingredient.displayName();
        }
    }

    public void displayInstructions() {
        for (Instruction instruction : instructions) {
            instruction.displayDescription();
        }
    }

    public void addTool(Tool tool) {
        tools.add(tool);
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }
    // Other recipe methods as needed
}
