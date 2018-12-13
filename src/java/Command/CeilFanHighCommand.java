package Command;

public class CeilFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int prespeed;

    public CeilFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prespeed = ceilingFan.getSpeed();
        ceilingFan.High();
    }

    @Override
    public void undo() {
        if(prespeed == CeilingFan.HIGH) {
            ceilingFan.High();
        }
        else if (prespeed == CeilingFan.MEDIUM) {
            ceilingFan.Medium();
        }
        else if (prespeed == CeilingFan.LOW) {
            ceilingFan.Low();
        }
        else {
            ceilingFan.Off();
        }
    }
}
