package part2Q4;

//this is very important !!!!!
import java.util.Comparator;

/**
 * TODO: Complete this class
 *
 */
public class CarComparator implements Comparator<Car> {
  public int compare(Car a, Car b) {
    return a.getAge() - b.getAge();
  }
}
