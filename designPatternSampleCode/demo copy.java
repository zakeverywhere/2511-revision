public interface I {
  public void pirnt();
}

class A implements I {
  public void demo() {
    A a = new A();
    I i = new A();
    a = i;
  }
}

class A {
  private void print() {

  }
}

class B extends A {
  private void print() {
  }

  public void printB() {
    A a = A();
    a.print();// X
    this.print();
  }
}