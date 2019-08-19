package designPatterns.builderPatternModified;

class IceHouseBuilder implements HouseBuilder {

  public void buildBasement(House house) {
    house.setBasement("Ice Bars");
  }

  public void buildStructure(House house) {
    house.setStructure("Ice Blocks");
  }

  public void buildInterior(House house) {
    house.setInterior("Ice Carvings");
  }

  public void bulidRoof(House house) {
    house.setRoof("Ice Dome");
  }
}