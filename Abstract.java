abstract class Parent2{
    public Parent2(){
        System.out.println("Base constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}


class Child2  extends Parent2{
    @Override
     public void greet(){
         System.out.println("GM");
     }
  }

public class Abstract{
    public static void main(String[] args) {
        
    }
 }
