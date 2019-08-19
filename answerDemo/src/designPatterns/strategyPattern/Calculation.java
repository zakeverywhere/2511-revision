package designPatterns.strategyPattern;

public class Calculation {
  private Strategy strategy;

  public Calculation(Strategy strategy) {
    this.strategy = strategy;
  }
  public void setStrategy(Strategy strategy) {
	  this.strategy = strategy;
  }

  public int executeStrategy(int num1, int num2) {
    return strategy.doOperation(num1, num2);
  }
}