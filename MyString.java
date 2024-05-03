import java.util.Scanner;

public class MyString {
public static void main(String[] args) {
    String name = new String("Aarsh");   // new way 
    String Myname = "Aarsh Sevak ";    // easy way 
    System.out.print(name);                 // doesnot give new line after printing
    System.out.println(Myname);         // gives new line after printing
    int value = name.length();
    int value1 =Myname.length();
    String lowerString = Myname.toLowerCase();
    System.out.println(lowerString);
    String nonTrimmed = "        HArry ";
    System.out.println(nonTrimmed);
    
    String Trimmed = nonTrimmed.trim();
    System.out.println(Trimmed);

    System.out.println(Myname.substring(1,5));

    System.out.println("The value :"+value+"\nThe value 1:"+value1);
    int a =6;
    float b= 5.6454f;
    System.out.printf("The value of a and b are %d and %f respectively",a,b);
    System.out.format("The value of a and b are %d and %f respectively",a,b); // same with printf

    System.out.println("-------------------");
    System.out.println("-------------------");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Str : ");
    // String str = sc.next();
    String str = sc.nextLine();
    System.out.println(str);
    sc.close();

}
}
