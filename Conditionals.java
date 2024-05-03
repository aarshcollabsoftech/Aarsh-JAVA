import java.util.Scanner;

public class Conditionals {
public static void main(String[] args) {
    System.out.println("Enter Your Age");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age>18){
        System.out.println("Legal Age to Drive");
    }else if(age==18 ){
        System.out.println("Just wait for a year.Why you wanna break rules.");
    }
    else{
        System.out.println("You are not allowed to drive.");
    }
    sc.close();

}
}
