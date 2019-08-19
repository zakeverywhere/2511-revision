package designPatterns.builderPatternModified;

class CivilEngineer {
  House house = new House();
  private HouseBuilder houseBuilder;

  public CivilEngineer(HouseBuilder houseBuilder) {
    this.houseBuilder = houseBuilder;
  }

  public House getHouse() {
    return  this.house;
  }

  public void buildBasement() {
    this.houseBuilder.buildBasement(this.house);
  }

  public void buildStructure() {
    this.houseBuilder.buildStructure(this.house);
  }

  public void bulidRoof() {
    this.houseBuilder.bulidRoof(this.house);
  }

  public void buildInterior() {
    this.houseBuilder.buildInterior(this.house);
  }
  public void setBuilder(HouseBuilder b){
    this.houseBuilder = b;
  }
}