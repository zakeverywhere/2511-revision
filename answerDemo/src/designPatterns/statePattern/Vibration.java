package designPatterns.statePattern;

class Vibration implements MobileAlertState {

  @Override
  public void alert(Alarm ctx) {
    System.out.println("vibration...");
    ctx.incCounter();
    if(ctx.getCounter() >= 3) {
    	 ctx.setState(new Silent());
    }
  }

}