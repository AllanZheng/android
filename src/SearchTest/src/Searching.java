import java.util.ArrayList;

final class SearchTuple {
	String data;
	int cost;

	public SearchTuple(String data, int cost) {
		this.data = data;
		this.cost = cost;
	}
}

public class Searching {

	// needs to get distance of every search term and then sort it based on the
	// lowest number

	public static ArrayList<SearchTuple> getResults(String search,
			ArrayList<String> data, int limit) {
		ArrayList<SearchTuple> sortedList = new ArrayList<SearchTuple>();//create a empty list for the results to be stored
		for (int i = 0; i < data.size(); i++) {
			SearchTuple tempTuple = new SearchTuple(data.get(i), getDistance(
					data.get(i), search));//set up a empty tuple

			if (sortedList.size() == 0) {//if the list if empty add it to the start
				sortedList.add(tempTuple);
			} else {
				for (int j = 0; j < sortedList.size(); j++) {//loop through the list to sort
					if (sortedList.size() > limit
							&& sortedList.get(limit).cost <= tempTuple.cost)// if the object cost at the limit is greater than the current
						//don't bother adding it to the list
						break;

					if (sortedList.get(j).cost > tempTuple.cost) {//if it's a lower cost than the current index

						sortedList.add(j, tempTuple);//add to position j pushing everything up

						break;
					} else if (sortedList.get(j).cost == tempTuple.cost) {//if it's the same add it after
						sortedList.add(j+1, tempTuple);//add after it
						break;
					} else if (j == sortedList.size()) {//
						sortedList.add(tempTuple);// add to end if match can't
													// be found
						break;
					}
				}
			}
		}
		return sortedList;//return all the the sorted list
	}

	private static int getDistance(final String s1, final String s2) {

		if (s1.equalsIgnoreCase(s2))//if they're the same return a distance of 0
			return 0;
		if (s1.length() == 0)
			return s2.length();//if the length is 0 return the size of the opposite string
		if (s2.length() == 0)
			return s1.length();

		int len1 = s1.length() + 1;//get the length 1+
		int len2 = s2.length() + 1;

		int[] row1 = new int[len1]; //create a cost array for each character in the string
		int[] row2 = new int[len1];

		for (int i = 0; i < len1; i++)//set the first ones values
			row1[i] = i;

		for (int j = 1; j < len2; j++) {
			for (int i = 1; i < len1; i++) {//loop through both lists

				int correct = (s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 : 1;//check if each character matches, this could be changed to have higher value for closer letters
//on the keyboard
				// need to add the cost for the computations
				int replace = row1[i - 1] + correct;//add a offset to the correct give priority to replace characters
				int insert = row1[i] + 1;//add a offset for any instered data use +2 for less priority
				int delete = row2[i - 1] + 1;//add a value for anything that's deleted

				row2[i] = getMinimum(replace, insert, delete);//gets the smallest cost from these
			}
			int[] swap = row1;
			row1 = row2;
			row2 = swap;
		}
		return row1[len1 - 1];// last element in the array is the value

	}

	private static int getMinimum(int a, int b, int c) {
		return Math.min(Math.min(a, b), c);

	}
}
