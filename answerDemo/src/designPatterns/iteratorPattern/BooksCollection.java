package designPatterns.iteratorPattern;

class BooksCollection implements IteratorContainer {
  private String m_titles[] = { "Book 0", "Book 1", "Book 2", "Book 3", "Book 4" };

  public BookIterator createIterator() {
    BookIterator result = new BookIterator();
    return result;
  }

  private class BookIterator implements MyIterator {
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