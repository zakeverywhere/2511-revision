interface HousePlan {
  public void setBasement(String basement);

  public void setStructure(String structure);

  public void setRoof(String roof);

  public void setInterior(String interior);
}

class House implements HousePlan {
  private String basement;
  private String structure;
  private String roof;
  private String interior;

  public void setBasement(String basement) {
    this.basement = basement;
  }

  public void setStructure(String structure) {
    this.structure = structure;
  }

  public void setRoof(String roof) {
    this.roof = roof;
  }

  public void setInterior(String interior) {
    this.interior = interior;
  }
}

interface HouseBuilder {
  public void buildBasement(House house);

  public void buildStructure(House house);

  public void bulidRoof(House house);

  public void buildInterior(House house);

  public House getHouse(House house);
}

class IglooHouseBuilder implements HouseBuilder {

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

class TipiHouseBuilder implements HouseBuilder {

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
  public void setBuilder(Builder b){
    this.houseBuilder = b;
  }
}

class BuilderDemo {
  public static void main(String[] args) {
    IglooHouseBuilder iceBuilder = new IglooHouseBuilder();
    TipiHouseBuilder woodBuilder = new TipiHouseBuilder();
    CivilEngineer engineer = new CivilEngineer(iceBuilder);
    engineer.buildBasement();
    engineer.setBuilder(woodBuilder);
    engineer.buildStructure();
    engineer.setBuilder(iceBuilder);
    engineer.buildInterior();
    engineer.bulidRoof();

    House house = engineer.getHouse();

    System.out.println("Builder constructed: " + house);
  }
}
