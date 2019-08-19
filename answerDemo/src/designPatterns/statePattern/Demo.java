// Java program to demonstrate working of 
// State Design Pattern 
package designPatterns.statePattern;

class Demo {
  public static void main(String[] args) {
    Alarm myAlarm = new Alarm();
    //switching to silence after 3 vibration
    myAlarm.alert();
    myAlarm.alert();
    myAlarm.alert();
    myAlarm.alert();
    myAlarm.alert();
    
    //manually set to vibration
    System.out.println("mannually set to vibration now");
    myAlarm.setState(new Vibration());
    myAlarm.alert();
  }
}