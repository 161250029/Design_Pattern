package Observer;

public interface Oversable {
      public void regsiter(Observer observer) ;
      public  void remove(Observer observer);
      public void notified();
}
