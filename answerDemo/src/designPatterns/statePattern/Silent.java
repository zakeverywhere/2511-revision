package designPatterns.statePattern;

class Silent implements MobileAlertState {
  @Override
  public void alert(Alarm ctx) {
    System.out.println("silent...");
   
  }

}