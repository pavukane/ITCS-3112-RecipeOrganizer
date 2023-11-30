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
}
