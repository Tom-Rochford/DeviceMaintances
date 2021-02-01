
package devicerepair;


public class Device {
    
    protected String IdentificationCode;
    protected String MakeAndModel;
    protected String owner;
    protected String ProblemDescription;
    protected String RepairNotes;
    protected int priority;
    
    //constructor
    public Device(String IdentificationCode, String MakeAndModel, String owner, String ProblemDescription, String RepairNotes, int priority) {
        this.IdentificationCode = IdentificationCode;
        this.MakeAndModel = MakeAndModel;
        this.owner = owner;
        this.ProblemDescription = ProblemDescription;
        this.RepairNotes = RepairNotes;
        this.priority = priority;
    }
    
    public String toString() {
        return IdentificationCode + ", " + MakeAndModel + ", " + owner + ", " + ProblemDescription + ", " + RepairNotes + ", " + priority;
    }
    
    //Getter and Setter
    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public void setIdentificationCode(String IdentificationCode) {
        this.IdentificationCode = IdentificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public void setMakeAndModel(String MakeAndModel) {
        this.MakeAndModel = MakeAndModel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProblemDescription() {
        return ProblemDescription;
    }

    public void setProblemDescription(String ProblemDescription) {
        this.ProblemDescription = ProblemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }

    public void setRepairNotes(String RepairNotes) {
        this.RepairNotes = RepairNotes;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
}
