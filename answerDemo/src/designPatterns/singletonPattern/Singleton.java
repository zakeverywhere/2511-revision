package designPatterns.singletonPattern;

// Classical Java implementation of singleton  
// design pattern 
class Singleton {
  private static Singleton obj;
  private int data;
  // private constructor to force use of
  // getInstance() to create Singleton object
  private Singleton() {
  }
  public void setData(int data) {
	  this.data = data;
  }
  
  public int getData() {
	  return this.data;
  }


  public static Singleton getInstance() {
    if (obj == null)
      obj = new Singleton();
    return obj;
  }
}