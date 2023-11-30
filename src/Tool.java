import java.util.Random;

public class Tool {
    private int toolID;
    private String description;

    public Tool(String description) {
        this.toolID = generateRandomID();
        this.description = description;
    }

    public void displayDescription() {
        System.out.println(description);
    }

    public int getToolID() {
        return toolID;
    }

    public void setToolID(int toolID) {
        this.toolID = toolID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private int generateRandomID() {
        Random random = new Random();
        return random.nextInt(1000); // Change the range as needed
    }
}
