// Author: Jack Hyatt

import java.util.ArrayList;

public class Listing {
    
    private String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior;
    
    /** 
     * 
     * 
    */
    public Listing(String title){
        this.title = title;
        this.items = new ArrayList<String>();
        this.sortBehavior = new BubbleSort();
    }

    /**
     * Method to add items into the list
     * @param item: string of what the item being added into the list is
     */
    public void add(String item){
        items.add(item);
    }

    /**
     * Method to remove item from list
     * @param item: if item is in the list, it gets removed. If it isn't, nothing happens
     */
    public void remove(String item){
        items.remove(item);
    }

    /**
     * @return title string of list
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets which sort the list will use when sorted.
     * @param sortBehavior is a sort implemented from SortBehavior interface.
     */
    public void setSortBehavior(SortBehavior sortBehavior){
        this.sortBehavior = sortBehavior;
    }

    /**
     * Method clones the list, then sorts it based on the sortBehavior and returns that clone. Leaves the original untouched.
     * @return a sorted clone of the item list
     */
    public ArrayList<String> getSortedList(){
        return sortBehavior.sort(items);
    }

    /**
     * Method to get the unsorted list
     * @return items: the unsorted list
     */
    public ArrayList<String> getUnSortedList(){
        return items;
    }

}
