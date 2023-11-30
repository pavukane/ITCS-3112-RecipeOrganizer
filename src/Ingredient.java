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
}
