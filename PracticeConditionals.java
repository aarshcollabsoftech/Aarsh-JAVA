import java.util.Scanner;

public class PracticeConditionals {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);

    // ---Q1
    // int a = 10;
    // if(a==11){
    //     System.out.println("I am 11");
    // }
    // else{
    //     System.out.println("I'm not 11");
    // }

    // ---Q2
    // float m1,m2,m3;
    // System.out.println("Enter Marks of Subject 1");
    // m1=sc.nextFloat();
    // System.out.println("Enter Marks of Subject 2");
    // m2=sc.nextFloat();
    // System.out.println("Enter Marks of Subject 3");
    // m3=sc.nextFloat();
    // float avg = (m1+m2+m3)/3.0f;
    // if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
    //     System.out.println("You Passed The Exam");
    // }
    // else{
    //     System.out.println("You Failed");
    // }


    // ---Q3
    // float tax = 0;
    // System.out.println("Enter Income in Lacs:");
    // float income = sc.nextFloat();
    // if(income<=2.5f){
    //     tax+=0;
    // }
    // else if(income>2.5f && income<=5f ){
    //     tax = tax +(income - 2.5f)*0.05f;
    // }
    // else if(income>5f && income<=10f ){
    //     tax = tax+0.05f * (5.0f-2.5f);
    //     tax = tax +0.2f*(income - 2.5f); 
    // }
    // else if(income>10.0f){
    //     tax = tax+0.05f * (5.0f-2.5f);
    //     tax = tax +0.05f * (10.0f-5f);
    //     tax =tax +0.3f * (income-10.0f);
    // }
    // System.out.println("Tax to be Paid is :"+tax);


    // ---Q4
    // System.out.println("Enter a no. b/w 1-7");
    // int day =sc.nextInt();
    // switch (day) {
    //     case 1:
    //         System.out.println("Monday");
    //         break;
    //     case 2:
    //         System.out.println("Tuesday");
    //         break;
    //     case 3:
    //         System.out.println("Wednesday");
    //         break;
    //     case 4:
    //         System.out.println("Thursday");
    //         break;
    //     case 5:
    //         System.out.println("Friday");
    //         break;
    //     case 6:
    //         System.out.println("Saturday");
    //         break;
    //     case 7:
    //         System.out.println("Sunday");
    //         break;
    
    //     default:
    //         break;
    // }


    // ---Q5
    // System.out.println("Enter the year to be checked");
    //     int year= sc.nextInt();

    //     if((year%4==0 && year%100!=0)|| year%400==0)
    //         System.out.println("Leap year");
    //     else
    //         System.out.println("Not a leap year");
    
    
    // ---Q6
    System.out.println("Enter a website url :");
    String website = sc.next();
    if(website.endsWith(".org")){
       System.out.println("Organizational Website"); 
    }
    else if (website.endsWith(".com")){
        System.out.println("Commercial Website");
    }
    else if (website.endsWith(".in")){
        System.out.println("Indian Website");
    }
    sc.close();

}
}
