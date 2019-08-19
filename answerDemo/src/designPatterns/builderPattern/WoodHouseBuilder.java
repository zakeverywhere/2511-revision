package designPatterns.builderPattern;

class WoodHouseBuilder implements HouseBuilder {
  private House house;

  public WoodHouseBuilder() {
    this.house = new House();
  }

  public void buildBasement() {
    house.setBasement("Wooden Poles");
  }

  public void buildStructure() {
    house.setStructure("Wood and Ice");
  }

  public void buildInterior() {
    house.setInterior("Fire Wood");
  }

  public void bulidRoof() {
    house.setRoof("Wood, caribou and seal skins");
  }

  public House getHouse() {
    return this.house;
  }

}