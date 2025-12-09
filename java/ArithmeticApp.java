import java.util.Scanner;
import java.util.Date;
import java.util.Random;
public class ArithmeticApp{
    public static void main(String...args){
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int startTime = (int)System.currentTimeMillis();
        

        int trial = 0;
        int score =0;
        int firstNumber =0;
        int secondNumber = 0;
        int result = 0;
        int range  = 10;

        
    System.out.println("Start Time Now");
           
    System.out.println("Solve Mathematical problems\nOn differences of two Numbers\n");
    while(trial != range){
    
        firstNumber = random.nextInt(15, 30);
        secondNumber = random.nextInt(2,4);
        
        System.out.print((trial+1) + ". " + firstNumber + " - " + secondNumber+ " = ");
        result = input.nextInt();

            if(result != firstNumber - secondNumber){          
                System.out.println("  Try again");
                System.out.print("  "+ firstNumber + " - " + secondNumber+ " = ");
                result = input.nextInt();

                    if(result == firstNumber - secondNumber){ 
                        score++; 
                        System.out.println("  correct");
                    }
           }
           else if(result == firstNumber - secondNumber){ 
                score++; 
                System.out.println("    correct");
            }
                trial++;
    }
    int endTime = (int)System.currentTimeMillis();
    int total = (startTime - endTime)/-1000;
    System.out.println("Total time used(sec): "+ total);
    System.out.println("Score: " + score + " of " + range +" questions");
    

    

        















    }

}
