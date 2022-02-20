import java.util.Random;
import java.util.Scanner;

public class MathGame{
    private static MathGame mathGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private String[] operands;
    private MathGame(){
        this.rand = new Random();
        this.reader = new Scanner(System.in);
        score = 0;
        operands = new String[]{"+","-","*","/"};
        System.out.println("Let's have fun with Math!");
    }

    public static MathGame getInstance(){
        if(mathGame==null)
            mathGame = new MathGame();
        return mathGame;
    }

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

    private boolean playRound(){
        int[] nums = new int[]{rand.nextInt(101),rand.nextInt(101)};
        String operator = operands[rand.nextInt(4)];
        double answer = getAnswer(nums, operator);
        System.out.println("Round your answer to 1 decimal");
        System.out.println(nums[0] + operator + nums[1] +"= ");
        double userAnswer = Double.parseDouble(reader.next());
        reader.nextLine();// To grab the extra new line from sys in.
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
