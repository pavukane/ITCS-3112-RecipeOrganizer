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

    public int getInstructionID() {
        return instructionID;
    }

    public void setInstructionID(int instructionID) {
        this.instructionID = instructionID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
