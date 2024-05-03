import java.util.Scanner;

public class Exercise {
public static void main(MyString[] args) {
    System.out.println("Welcome To Percentage Calculator");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Marks of Subject 1");
    float m1 = sc.nextFloat();
    System.out.println("Enter Marks of Subject 2");
    float m2 = sc.nextFloat();
    System.out.println("Enter Marks of Subject 3");
    float m3 = sc.nextFloat();
    System.out.println("Enter Marks of Subject 4");
    float m4 = sc.nextFloat();
    System.out.println("Enter Marks of Subject 5");
    float m5 = sc.nextFloat();
    float percentage = ((m1+m2+m3+m4+m5)/500.0f)*100;
    System.out.println("Percentage : "+percentage);


   sc.close();
    float a = 7/4.0f*9/2.0f;
    System.out.println(a);
}
}
