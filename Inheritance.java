
class Base{
    public int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am setting X now");
        this.x= x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{         // extends base makes everything from base class available to Derived class
   public  int y;
    
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("I am setting Y now");
        this.y= y;
    }
}
public class Inheritance {
 public static void main(String[] args) {
    Base b = new Base();
    b.setX(4);
    System.out.println(b.getX());
    
    Derived d = new Derived();
    d.setX(45);
    System.out.println(d.getX());
    d.setY(62);
    System.out.println(d.getY());
    

 }
}
