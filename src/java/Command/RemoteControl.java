package Command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;      //最后一次按下的命令

    public RemoteControl() {
        onCommands = new Command[7] ;
        offCommands = new Command[7];

        Command noCommand = new NoCommand();    //什么都不做
        for (int i = 0 ; i < 7 ; i ++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot , Command onCommand , Command offCommand) {      //插槽的位置， 开的命令，关的命令
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        return "";
    }
}
