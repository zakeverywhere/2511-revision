interface IIterator {
  public boolean hasNext();

  public Object next();
}

interface IContainer {
  public IIterator createIterator();
}

class BooksCollection implements IContainer {
  private String m_titles[] = { "Design Patterns", "1", "2", "3", "4" };

  public IIterator createIterator() {
    BookIterator result = new BookIterator();
    return result;
  }

  private class BookIterator implements IIterator {
    private int m_position;

    public boolean hasNext() {
      if (m_position < m_titles.length)
        return true;
      else
        return false;
    }

    public Object next() {
      if (this.hasNext())
        return m_titles[m_position++];
      else
        return null;
    }
  }
}

public class IteratorDemo {
  public static void main(String[] args) {
    BooksCollection bc = new BooksCollection();
    IIterator i = bc.createIterator();
    while (i.hasNext()) {
      Object o = i.next();
      System.out.println(o);
    }
  }
}