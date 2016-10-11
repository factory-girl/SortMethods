import java.util.*;
/**
 * Class that removes duplicates from an array.
 * @author softskeleton
 *
 */
public class RemoveDuplicates {
	private static int count;
	
	/**
	 * Method which iterates every time a duplicate is found and removes the value if count
	 * is iterated.
	 * @param values ArrayList of Integer values
	 * @return values ArrayList with duplicates removed
	 */
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> values) {
		int value;
		for (int i = 0; i < values.size(); i++) {
			for (int j = i + 1; j < values.size(); j++) {
				if (values.get(i) == values.get(j)) {
					count++;
				}
				if (count > 1) {
					values.remove(j);
					count = 0;
				}
			}
			i++;
		}
		return values;
	}
}
