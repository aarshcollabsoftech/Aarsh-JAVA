package calc;

class Calculator {
    public void calculate(int a,int b){
        System.out.println("Your result is "+a+b);
    }}
class sCCalculator {
    public void calculate(int a,int b){
        System.out.println("Your result is "+Math.sin(a+b));
    }}
class hYCalculator {
    public void calculate(int a,int b){
        System.out.println("Your result is "+a+b);
        System.out.println("Your result is "+Math.sin(a+b));
    }
}
public class PS9 {
    public static void main(String[] args) {
        System.out.println("Public ");
    }
}
