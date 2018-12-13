package Command;

public class RemoteLoader {
    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilFanHighCommand ceilFanHighCommand = new CeilFanHighCommand(ceilingFan);
        remoteControl.setCommand(0 , ceilFanHighCommand , ceilFanHighCommand);  //讲道理这里应该是ceiloff

    }
}
