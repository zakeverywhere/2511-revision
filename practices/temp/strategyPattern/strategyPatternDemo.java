package strategyPattern;
public interface Strategy {
  public int doOperation(int num1, int num2);
}

public class OperationAdd implements Strategy {
  @Override
  public int doOperation(int num1, int num2) {
    return num1 + num2;
  }
}

public class OperationSubstract implements Strategy {
  @Override
  public int doOperation(int num1, int num2) {
    return num1 - num2;
  }
}

public class OperationMultiply implements Strategy {
  @Override
  public int doOperation(int num1, int num2) {
    return num1 * num2;
  }
}

public class Context {
  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public int executeStrategy(int num1, int num2) {
    return strategy.doOperation(num1, num2);
  }
}

public class strategyPatternDemo {
  public static void main(String[] args) {
    Context context = new Context(new OperationAdd());
    System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

    context = new Context(new OperationSubstract());
    System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

    context = new Context(new OperationMultiply());
    System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
  }
}