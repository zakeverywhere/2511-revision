package designPatterns.statePattern;

class Alarm {
  private MobileAlertState currentState;
  private int counter;
  public Alarm() {
	 this.counter = 0;
    currentState = new Vibration();
  }

  public void incCounter() {
	  this.counter ++;
  }
  public int getCounter() {
	  return this.counter;
  }
  public void setState(MobileAlertState state) {
    currentState = state;
  }

  public void alert() {
    currentState.alert(this);
  }
}