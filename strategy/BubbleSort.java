// Author: Jack Hyatt

import java.util.*;

public class BubbleSort implements SortBehavior{
    public ArrayList<String> sort(ArrayList<String> data){
        // Clone the array to return it without changing the original
		ArrayList<String> clone = new ArrayList<String>(Arrays.asList(new String[data.size()]));
		Collections.copy(clone,data);
		// Now to sort the cloned array
		boolean hasSwapped = true;
		while(hasSwapped) {
			hasSwapped = false;
			for(int i=0;i<clone.size()-1;i++) {
				if(clone.get(i).compareTo(clone.get(i+1))>0) {
					//Swap
					Collections.swap(clone, i, i+1);
					hasSwapped = true;
				}
			}
		}
        return clone;
    }
}
