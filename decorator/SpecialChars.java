import java.util.Random;

/**
 * Class to take in passwords and add random special characters in them
 * @author Jack Hyatt
 */
public class SpecialChars extends PasswordDecorator{
    /**
     * Constructor takes in a Password. Calls the PasswordDecorator constructor and then adds special characters in it.
     * @param passwordBeginning
     */
    public SpecialChars(Password passwordBeginning){
        super(passwordBeginning);
        String specials = "*!%+.{}";
        Random seed = new Random();
        for(int i=0;i<password.length()-1;i++){
            if(seed.nextGaussian()<.3){
                password = password.substring(0,i+1) + specials.charAt(seed.nextInt(7)) + password.substring(i+1,password.length());
                i++;
            }
        }
        if(seed.nextGaussian()<.3){
            password = password.substring(0,password.length()) + specials.charAt(seed.nextInt(7));
        }
    }
    /**
     * Returns the password
     * @return the password string
     */
    public String getPassword(){
        return password;
    }
}