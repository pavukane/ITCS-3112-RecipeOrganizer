public class Instruction {
    private int instructionID;
    private String description;

    public Instruction(int instructionID, String description) {
        this.instructionID = instructionID;
        this.description = description;
    }

    public void displayDescription() {
        System.out.println(description);
    }
}
