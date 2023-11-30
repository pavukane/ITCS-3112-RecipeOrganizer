import java.util.Random;

public class Ingredient {
    private int ingredientID;
    private String name;

    public Ingredient(String name) {
        this.ingredientID = generateRandomID();
        this.name = name;
    }

    public void displayName() {
        System.out.println(name);
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int generateRandomID() {
        Random random = new Random();
        return random.nextInt(1000); // Change the range as needed
    }
}
