package designPatterns.observerPattern;
public class Demo {
  public static void main(String[] args) {
    Subject subject = new Subject();

    new HexaObserver(subject);
    new OctalObserver(subject);
    new BinaryObserver(subject);

    //15 = 0xF or 0b1111 or 17(8)
    System.out.println("First state change: 15");
    subject.setState(15);
    
    //10 = 0xA or 0b1010 or 12(8)
    System.out.println("Second state change: 10");
    subject.setState(10);
  }
}