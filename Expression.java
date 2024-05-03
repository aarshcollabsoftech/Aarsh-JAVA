import java.util.Scanner;

public class Expression {
public static void main(MyString[] args) {
    float a=0,v=0,u=0,s=0;
    System.out.println("Enter the following values :");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter v :");
    v = sc.nextFloat();
    System.out.println("Enter u :");
    u = sc.nextFloat();
    System.out.println("Enter a :");
    a = sc.nextFloat();
    System.out.println("Enter s :");
    s = sc.nextFloat();
    float expression = (v*v-u*u)/(2*a*s);
    System.out.println("Expression Result :"+expression);
    sc.close();
    
}
}
