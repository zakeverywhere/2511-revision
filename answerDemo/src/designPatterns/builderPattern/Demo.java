package designPatterns.builderPattern;

class Demo {
  public static void main(String[] args) {
    HouseBuilder myBuilder = new IceHouseBuilder();
    CivilEngineer engineer = new CivilEngineer(myBuilder);
    engineer.constructHouse();
    House iceHouse = engineer.getHouse();
    System.out.println(iceHouse.toString());
    
    engineer.setBuilder(new WoodHouseBuilder());
    engineer.constructHouse();
    House woodHouse = engineer.getHouse();
    System.out.println(woodHouse.toString());
  }
}
