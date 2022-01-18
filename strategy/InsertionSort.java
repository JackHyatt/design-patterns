// Author: Jack Hyatt

import java.util.*;

public class InsertionSort implements SortBehavior{
    public ArrayList<String> sort(ArrayList<String> data){
        // Clone the array to return it without changing the original
		ArrayList<String> clone = new ArrayList<String>(Arrays.asList(new String[data.size()]));
		Collections.copy(clone,data);
		// Now to sort the cloned array
        int size = clone.size();
        // Bits of idea to compact insetion sort obtained from https://stackabuse.com/insertion-sort-in-java/
        for(int i=1;i<size;i++){
            String currentItem = clone.get(i);
            int j = i-1;
            while((j>-1) && (clone.get(j).compareTo(currentItem)>0)){
                clone.set(j+1, clone.get(j));
                j--;
            }
            clone.set(j+1,currentItem);
        }
        return clone;
    }
}
