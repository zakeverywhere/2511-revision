package designPatterns.strategyPattern;
public class Demo {
  public static void main(String[] args) {
    Calculation myCalculation = new Calculation(new AddStrategy());
    System.out.println("10 + 5 = " + myCalculation.executeStrategy(10, 5));

    myCalculation.setStrategy(new SubstractStrategy());
    System.out.println("10 - 5 = " + myCalculation.executeStrategy(10, 5));

    myCalculation.setStrategy(new MultiplyStrategy());
    
    System.out.println("10 * 5 = " + myCalculation.executeStrategy(10, 5));
  }
}