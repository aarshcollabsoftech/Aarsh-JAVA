class Circle{
    public int r;
    Circle(int a){
        System.out.println("Circle Para Const");
        this.r =a ;
    }
    public double area(){
        return this.r*this.r*Math.PI;
    }
}

class Cylinder extends Circle{
    Cylinder(int r,int h){
        System.out.println("Cylinder Para Const");
         super(r);
         this.height = h; 
    }
    public int height;
    public double volume(){
            return this.r*this.r*Math.PI*this.height;
    }
}

public class PracticeSet7 {
    public static void main(String[] args) {
       // Q1
        
       // Circle c1= new Circle(12);
      // Cylinder cy1 = new Cylinder(12,4);
    
      //Q2

      
        
    }
}
