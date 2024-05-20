public class VarArgs {
  
    // static int sum(int a,int b){
    //     return a+b;
    // }
    // static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // static int sum(int a,int b,int c,int d){
    //     return a+b+c+d;
    // }

    static int sum(int ...arr){
        // available as int [] arr ;
        int result=0;
        for (int a : arr) {
            result+=a;
        }
        return result;
    }
public static void main(String[] args) {
    // System.out.println("Varargs :");
    // System.out.println("Sum of 4 & 5 is"+sum(4, 5));
    // System.out.println("Sum of 4,6 & 5 is"+sum(4,6, 5));
    // System.out.println("Sum of 4,8,6 & 5 is"+sum(4,8,6, 5));
    System.out.println("Sum : "+sum(1,2,3,4,5,6,7,8,9,10));
    System.out.println("Sum : "+sum());
} 
}
