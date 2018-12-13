package Command;

//使请求者和接收者解耦，个人理解：请求者只需持有命令即可
public interface Command {
      public void execute();
      public void undo();
}
