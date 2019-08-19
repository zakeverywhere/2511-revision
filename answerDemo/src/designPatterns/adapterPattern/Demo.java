// Java implementation of Adapter pattern 
package designPatterns.adapterPattern;
class Demo {
  public static void main(String args[]) {
    Sparrow sparrow = new Sparrow();
    ToyDuck toyDuck = new PlasticToyDuck();

    // Wrap a bird in a birdAdapter so that it
    // behaves like toy duck
    ToyDuck birdedDuck = new BirdAdapter(sparrow);

    System.out.println("Sparrow...");
    sparrow.fly();
    sparrow.makeSound();

    System.out.println("ToyDuck...");
    toyDuck.squeak();

    // toy duck behaving like a bird
    System.out.println("BirdAdapter...");
    birdedDuck.squeak();
  }
}