// Author: Jack Hyatt

import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private HashMap<String,Integer> votes;
    private String school;
    private int numUpdates;

    /**
     * Constructor takes in school name and makes var for school name and 
     * initializes list of observers, hashmap of votes, and number of updates.
     * @param school: string of name of school
     */
    public StudentGovPoll(String school){
        this.school = school;
        this.observers = new ArrayList<Observer>();
        this.votes = new HashMap<String,Integer>();
        this.numUpdates = 0;
    }

    /**
     * Method to add observers to the list of observers
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * Method to remove a specified observer from the list of observers.
     * Does nothing if observer isn't in the list
     * @param observer: Class Observer for the specific observer to be removed 
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * Method to notify all observers that a change to the votes has occured.
     */
    public void notifyObservers(){
        numUpdates++;
        if(numUpdates%4 == 0){
            for(Observer observer:observers){
                observer.update(this.votes);
            }
        }
    }

    /**
     * Method to add presidential candidates to the hashmap. They start with 0 votes.
     * @param president: String for the name of presidential candidate
     */
    public void addCandidate(String president){
        votes.put(president,Integer.valueOf(0));
    }

    /**
     * Method to enter votes for the specified presdiential candidate.
     * @param president: String of the name of presidential candidate
     * @param num: int for the amount of votes to be added to the candidate
     */
    public void enterVotes(String president, int num){
        if(votes.get(president)!=null){
            votes.put(president,votes.get(president)+num);
            notifyObservers();
        }
    }

    /**
     * Method to get the name of the school
     * @return String of the name of the school
     */
    public String getSchool(){
        return this.school;
    }
}
