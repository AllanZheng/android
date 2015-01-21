package filtering;

/**
 * @author Jack
 *
 */

public interface IFilter {
/**
 * gets the currentDatabeing filtered
 * 
 * 
 * @return Object[]
 */
 public Object[] getData();
 /**
  * returns the filtered data to be put into a search
  * 
  * 
  * @param dataToFilter
  * @return Object[]
  */
 
 public Object[] filterData(Object[] dataToFilter);
 /**
  *  the number of objects that were filtered
  * 
  * @return int
  */
 public int numberOfObjectsOrder();
}
