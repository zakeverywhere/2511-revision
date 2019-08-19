package designPatterns.builderPatternModified;

class WoodHouseBuilder implements HouseBuilder {

  public void buildBasement(House house) {
    house.setBasement("Wooden Poles");
  }

  public void buildStructure(House house) {
    house.setStructure("Wood and Ice");
  }

  public void buildInterior(House house) {
    house.setInterior("Fire Wood");
  }

  public void bulidRoof(House house) {
    house.setRoof("Wood, caribou and seal skins");
  }

}