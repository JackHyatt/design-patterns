/**
 * 
 * @author Jack Hyatt
 */
public class RandomCasing extends PasswordDecorator{

    public RandomCasing(Password passwordBeginning){
        super(passwordBeginning);
    }

    public String getPassword() {
        return super.getPassword();
    }
}