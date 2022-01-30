import java.util.Random;

/**
 * Class that takes in some phrase to be a password, then takes out the spaces and adds a number on the end.
 * @author Jack Hyatt
 */
public class EasyPassword extends Password{
    /**
     * Constructor to take in a phrase, and turn it into a password with no spaces and a number at the end.
     * @param phrase string to be a password
     */
    public EasyPassword(String phrase){
        Random seed = new Random();
        this.password = phrase.replace(" ","") + seed.nextInt(101);
    }
    /**
     * Returns the password
     * @return password string
     */
    public String getPassword(){
        return password;
    }
    
}