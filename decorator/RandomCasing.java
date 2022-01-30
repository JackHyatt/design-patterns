import java.util.Random; 

/**
 * Class that takes in a password, and adds random casing to it.
 * @author Jack Hyatt
 */
public class RandomCasing extends PasswordDecorator{
    /**
     * Contstructor that takes in a password. It calls the super class's constructor and then adds random casing to the password.
     * @param passwordBeginning
     */
    public RandomCasing(Password passwordBeginning){
        super(passwordBeginning);
        Random seed = new Random();
        for(int i=0;i<passwordBeginning.password.length()-1;i++){
            if((int) password.charAt(i)>=65 && (int) password.charAt(i)<=122){
                if(seed.nextGaussian()<.5){
                    password = password.substring(0, i) + Character.toUpperCase(password.charAt(i)) + password.substring(i+1,password.length());
                }
            }
        }
        if(seed.nextGaussian()<.5){
            password = password.substring(0,password.length()-1) + (char)(password.charAt(password.length()-1));
        }
    }

    /**
     * Returns password
     * @return the password string
     */
    public String getPassword() {
        return password;
    }
}