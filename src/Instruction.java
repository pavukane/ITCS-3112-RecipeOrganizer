import java.util.Random;

public class Instruction {
    private int instructionID;
    private String description;

    public Instruction(String description) {
        this.instructionID = generateRandomID();
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

    private int generateRandomID() {
        Random random = new Random();
        return random.nextInt(1000); // Change the range as needed
    }
}
