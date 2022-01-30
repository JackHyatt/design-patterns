/**
 * Abstract class that is for decorating passwords. Takes in a password and sets the string and password.
 * @author Jack Hyatt
 */
public abstract class PasswordDecorator extends Password{
    protected Password passwordBeginning;
    /**
     * Constructor that takes in the password, then sets it as the password and its string as the string.
     * @param passwordBeginning Password to be modified
     */
    public PasswordDecorator(Password passwordBeginning){
        this.passwordBeginning = passwordBeginning;
        this.password = passwordBeginning.getPassword();
    }
    /**
     * returns the password
     * @return the password string
     */
    public String getPassword(){
        return this.passwordBeginning.getPassword();
    }
}