public class Tool {
    private int toolID;
    private String description;

    public Tool(int toolID, String description) {
        this.toolID = toolID;
        this.description = description;
    }

    public void displayDescription() {
        System.out.println(description);
    }
}
