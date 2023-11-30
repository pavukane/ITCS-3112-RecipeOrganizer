public class Ingredient {
    private int ingredientID;
    private String name;

    public Ingredient(int ingredientID, String name) {
        this.ingredientID = ingredientID;
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
}
