package designPatterns.builderPatternModified;
class Demo {
  public static void main(String[] args) {
    IceHouseBuilder iceBuilder = new IceHouseBuilder();
    WoodHouseBuilder woodBuilder = new WoodHouseBuilder();
    CivilEngineer engineer = new CivilEngineer(iceBuilder);
    engineer.buildBasement();
    engineer.setBuilder(woodBuilder);
    engineer.buildStructure();
    engineer.buildInterior();
    engineer.setBuilder(iceBuilder);
    engineer.bulidRoof();
    House house = engineer.getHouse();

    System.out.println(house.toString());
  }
}
