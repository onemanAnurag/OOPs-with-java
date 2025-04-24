import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor:");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if(userinput == computerInput){
            System.out.println("Match Draw");
        }
       else if(userinput == 0 && computerInput ==2 || userinput == 1 && computerInput == 0 || userinput == 2 && computerInput == 1){
            System.out.println("You Win");
        }

       else {
            System.out.println("Computer Win");
        }
       if(computerInput==0){
           System.out.println("computer choice: Rock");
       }
       else if(computerInput==1){
           System.out.println("computer choice: Paper");
       }
       else if(computerInput==2){
           System.out.println("computer choice: Scissor");
       }
    }
}
