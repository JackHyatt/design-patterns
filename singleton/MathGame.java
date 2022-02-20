import java.util.Random;
import java.util.Scanner;

/**
 * Class for a math game that asks equations and gets an answer from the user. Only allows one instance of the class
 * @author Jack Hyatt
 */
public class MathGame{
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private String[] operands;
    /**
     * Constructor that initializes the random seed, the scanner, the score, and the operands.
     * Is private so that the only way to create an instance is through the getInstance method
     */
    private MathGame(){
        this.rand = new Random();
        this.reader = new Scanner(System.in);
        score = 0;
        operands = new String[]{"+","-","*","/"};
        System.out.println("Let's have fun with Math!");
    }

    /**
     * Method to create an instance of the class if there isn't one, and return the sole instance of the class
     * @return the sole instance of the class
     */
    public static MathGame getInstance(){
        if(mathGame==null)
            mathGame = new MathGame();
        return mathGame;
    }

    /**
     * Method to play the game. Asks each round if the user wants to play, and does so accordingly.
     */
    public void play(){
        String playOrQuit = "P";
        while(!playOrQuit.equalsIgnoreCase("Q")){
            System.out.println("(P)lay or (Q)uit: ");
            playOrQuit = reader.nextLine();
            if(playOrQuit.equalsIgnoreCase("Q")){
                System.out.println("You won " +score+ " games!");
                continue;
            }
            if(!playOrQuit.equalsIgnoreCase("P")){
                System.out.println("Sorry, you must enter p or q.");
                continue;
            }
            if(playRound())
                score++;
        }
        
    }

    /**
     * Method to play the round. Tells the user the equation and gets their response.
     * @return true if the user got the answer right and false if they didnt.
     */
    private boolean playRound(){
        int[] nums = new int[]{rand.nextInt(101),rand.nextInt(101)};
        String operator = operands[rand.nextInt(4)];
        double answer = getAnswer(nums, operator);
        System.out.println("Round your answer to 1 decimal");
        System.out.println(nums[0] + operator + nums[1] +"= ");
        double userAnswer;
        while(true){
            try{
                userAnswer = Double.parseDouble(reader.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("That is not a number, try answering again.");
            }
        }
        if(userAnswer == answer){
            System.out.println("You got it!");
            return true;
        }
        else{
            System.out.println("The correct answer is "+ answer);
            return false;
        }
    }

    /**
     * Helper method to parse in an equation and return the answer
     * @param nums array of two integers
     * @param operator operator to use on the numbers
     * @return the answer of the equation as a double rounded to 1 decimal place
     */
    private double getAnswer(int[] nums, String operator){
        switch(operator){
            case "+":
                return (double) nums[0]+nums[1];
            case "-":
                return (double) nums[0]-nums[1];
            case "*":
                return (double) nums[0]*nums[1];
            case "/":
                return roundDouble(((double) nums[0])/((double) nums[1]),1);
        }
        return 1.0;
    }

    /**
     * Helpter method to round a double to a decimal place
     * @param num double to round
     * @param decimalPlaces decimal places to round to
     * @return the rounded double
     */
    private double roundDouble(double num, int decimalPlaces){
            int factor = (int) Math.pow(10, decimalPlaces);
            return (double) Math.round(num * factor) / factor;   
    }
}
