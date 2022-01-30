/**
 * Class to replaces certain letters with symbols
 * @author Jack Hyatt
 */
public class Symbols extends PasswordDecorator{
    /**
     * Constructor that calls PasswordDecorator's constructor and then replaces certain letters with other symbols
     * @param passwordBeginning type Password.
     */
    public Symbols(Password passwordBeginning){
        super(passwordBeginning);
        String phrase = passwordBeginning.getPassword().replace("a","@");
        phrase = phrase.replace("b","8");
        phrase = phrase.replace("e","3");
        phrase = phrase.replace("g","9");
        phrase = phrase.replace("i","!");
        phrase = phrase.replace("o","0");
        phrase = phrase.replace("s","$");
        passwordBeginning.password = phrase.replace("t","7");
    }

    /**
     * Returns the password
     * @return the password string
     */
    public String getPassword(){
        return super.getPassword();
    }
}