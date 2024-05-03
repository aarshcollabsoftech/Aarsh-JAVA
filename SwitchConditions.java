import java.util.Scanner;

public class SwitchConditions {
public static void main(String[] args) {
    int a ;
     System.out.println("Enter From Below");
     System.out.println("Press 1 for age <18");
System.out.println("Press 2 for age b/w 18-55");
System.out.println("Press 3 for age >55");
     Scanner sc= new Scanner(System.in);
     a = sc.nextInt();

     switch (a) {
        case 1:
            System.out.println("Just some years to be an adult");
            break;
        case 2:
            System.out.println("You will be stress free after years from career tension");
            break;
        case 3:
            System.out.println("Retirement is near.Preapare for party");
            break;
     
        default:
        System.out.println("Relax & Enjoy Your Life..");
            break;
     }
     System.out.println("Switch Case Example");
     sc.close();

}

}
