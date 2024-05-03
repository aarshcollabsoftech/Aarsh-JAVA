import java.util.Scanner;

public class Main {
public static void main(MyString[] args) {
    System.out.println("Hello World");
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter No 1 :");
    int a = scan.nextInt();
    System.out.println("Enter No 2 :");
    float b = scan.nextFloat();
    float sum = a+b;
    System.out.print(sum);
    scan.close();
}
}
