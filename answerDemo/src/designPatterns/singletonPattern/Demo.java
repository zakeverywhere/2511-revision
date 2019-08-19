package designPatterns.singletonPattern;
class Demo {
  public static void main(String[] args) {
	  Singleton s = Singleton.getInstance();
	  s.setData(5);
	  Singleton anotherS = Singleton.getInstance();
	  System.out.println(anotherS.getData());
  }
}