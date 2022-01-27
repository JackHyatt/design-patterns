/**
 * 
 * @author Jack Hyatt
 */
public class SpecialChars extends PasswordDecorator{
    public SpecialChars(Password passwordBeginning){
        super(passwordBeginning);
    }

    public String getPassword(){
        return super.getPassword();
    }
}