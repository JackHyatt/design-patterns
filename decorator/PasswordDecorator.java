/**
 * 
 * @author Jack Hyatt
 */
public abstract class PasswordDecorator extends Password{
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning){
        this.passwordBeginning = passwordBeginning;
    }

    public String getPassword(){
        return this.passwordBeginning.getPassword();
    }
}