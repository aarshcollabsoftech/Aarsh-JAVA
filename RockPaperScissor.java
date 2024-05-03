import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock , Paper  & Scissors");
        System.out.println("3");
        System.out.println("2");
        System.out.println("1");
        System.out.println("Let's Rumble");
        System.out.println("Enter 0 for Rock, 1 for Paper & 2 for Scissor");
        int userChoice = sc.nextInt();
        Random random = new Random();
        int computerChoice = random.nextInt(3);

        for (int i=4; i>3; i++) {
            if (userChoice > 2) {
                System.out.println("Wrong choice\nPlease try again");
                break;
            }
        }

        if(userChoice == 0){
            System.out.println("User : Rock");
        }
        else if(userChoice == 1){
            System.out.println("User : Paper");
        }
        else if(userChoice == 2){
            System.out.println("User : Scissor");
        }
        if(computerChoice == 0){
            System.out.println("Computer : Rock");
        }
        else if(computerChoice == 1){
            System.out.println("Computer : Paper");
        }
        else if(computerChoice == 2){
            System.out.println("Computer : Scissor");
        }

        if (userChoice == computerChoice) {
            System.out.println("Draw");
        } else if (userChoice == 2 && computerChoice == 1 || userChoice == 0 && computerChoice == 2 || userChoice == 1 && computerChoice == 0) {
            System.out.println("Congrats,User WIN!!");
        } else if (userChoice == 1 && computerChoice == 2 || userChoice == 2 && computerChoice == 0 || userChoice == 0 && computerChoice == 1) {
            System.out.println("Sorry,User LOSE!!");
        }
    sc.close();
}
}