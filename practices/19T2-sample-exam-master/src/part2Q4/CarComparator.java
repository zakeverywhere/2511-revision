package part2Q4;

//this is very important !!!!!
import java.util.Comparator;

/**
 * TODO: Complete this class
 *
 */
public class CarComparator implements Comparator<Car> {
  public int compare(Car a, Car b) {
	if (a.getManufacturer().equals(b.getManufacturer())){
		return a.getAge() - b.getAge();
	}else {
		return a.getManufacturer().compareTo(b.getManufacturer());
	}
  }
}
