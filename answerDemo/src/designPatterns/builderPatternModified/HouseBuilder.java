package designPatterns.builderPatternModified;

interface HouseBuilder {
  public void buildBasement(House house);

  public void buildStructure(House house);

  public void bulidRoof(House house);

  public void buildInterior(House house);

  
}