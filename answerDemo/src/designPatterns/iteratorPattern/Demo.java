package designPatterns.iteratorPattern;
public class Demo {
  public static void main(String[] args) {
    BooksCollection bc = new BooksCollection();
    MyIterator i = bc.createIterator();
    while (i.hasNext()) {
      Object o = i.next();
      System.out.println(o);
    }
  }
}