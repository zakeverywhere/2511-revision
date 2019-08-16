
public interface Shape {
  void draw();
}

public class Rectangle implements Shape {
  @Override
  public void draw() {
    System.out.println("Shape: Rectangle");
  }
}

public class Circle implements Shape {
  private static Circle c;
  private int radius = 1;

  public Circle(int radius) {
    this.radius = radius;
  }

  public static changeRadius(int radius){
    c.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("Shape: Circle");
  }

  public static Circle getInstance() {
    if (c == null)
      c = new Circle(1);
    return c;
  }
}

public abstract class ShapeDecorator implements Shape {
  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape) {
    this.decoratedShape = decoratedShape;
  }

  public void draw() {
    decoratedShape.draw();
  }
}

public class RedShapeDecorator extends ShapeDecorator {

  public RedShapeDecorator(Shape decoratedShape) {
    super(decoratedShape);
  }

  @Override
  public void draw() {
    decoratedShape.draw();
    setRedBorder(decoratedShape);
  }

  private void setRedBorder(Shape decoratedShape) {
    System.out.println("Border Color: Red");
  }
}

public class DecoratorPatternDemo {
  public static void main(String[] args) {

    Shape redCircle = new RedShapeDecorator(Circle().getInstance());

    Shape redRectangle = new RedShapeDecorator(new Rectangle());

    System.out.println("Circle with normal border");
    circle.draw();

    System.out.println("\nCircle of red border");
    redCircle.draw();

    System.out.println("\nRectangle of red border");
    redRectangle.draw();

  }
}

public class DecoratorPatternDemo2 {
  public printDemo2(){
    Circle circleSingleton = Circle().getInstance();
    Circle().changeRadius(4);
  
  }

}