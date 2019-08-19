package designPatterns.builderPattern;

class CivilEngineer {

  private HouseBuilder houseBuilder;

  public CivilEngineer(HouseBuilder houseBuilder) {
    this.houseBuilder = houseBuilder;
  }

  public House getHouse() {
    return this.houseBuilder.getHouse();
  }
  public void setBuilder(HouseBuilder builder) {
	 this.houseBuilder = builder;
  }

  public void constructHouse() {
    this.houseBuilder.buildBasement();
    this.houseBuilder.buildStructure();
    this.houseBuilder.bulidRoof();
    this.houseBuilder.buildInterior();
  }
}