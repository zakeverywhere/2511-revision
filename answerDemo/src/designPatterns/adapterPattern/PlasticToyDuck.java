package designPatterns.adapterPattern;

class PlasticToyDuck implements ToyDuck {
  public void squeak() {
    System.out.println("Squeak");
  }
}