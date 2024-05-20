import java.util.Scanner;

public class Recurrsion {
    //factorial(n)=n*factorial(n-1)
    //factorial(0)=1
    static int factorial(int n ){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    static int factorial_iterative(int n){
        if(n==0 ||n==1){
            return 1;
        }
        else{
            int product =1;
            for(int i=1;i<=n;i++){
                product*=i;
            }
            return product;
        }
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n :");
    int n = sc.nextInt();
    System.out.println("The Factorial of "+n+" is : "+factorial(n));
    System.out.println("The Factorial of "+n+" is : "+factorial_iterative(n));
    sc.close();
}
}
