package part2Q4;

/**
 * TODO: Complete this class
 *
 */
public class CarComparator implements Comparator<Car> {
  public int compare(Car a,Car b){
    return a.getAge() - b.getAge()
  }
}
