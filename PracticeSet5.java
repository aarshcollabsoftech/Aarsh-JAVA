class Employee{
     int salary;
     String name;

     public int getSalary(){
        return salary;
     }

     public String getName(){
        return name;
     }

     public void  setName(String n){
        name = n ;
     }
}

class CellPhone {
    public void ring(){
        System.out.println("Ringing .............");
    }
    public void vibrate(){
        System.out.println("Vibrating .............");
    }
    public void callFriend(){
        System.out.println("Calling .............");
    }
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int length ;
    int breadth;

    public int perimeter(){
        return 2*(length+breadth);
    }
    public int area(){
        return length * breadth;
    }
}


class TommyVercetti{
    
    public void hit(){
        System.out.println("Hitting.......");
    }

    public void run(){
        System.out.println("Running.......");
    }
    public void fire(){
        System.out.println("Firing.......");
    }
}


class Circle{
    int radius;
    double pie = 3.14;
    public double area(){
        return pie*radius*radius;
    }
    public double perimeter(){
        return 2*pie*radius;
    }
}
public class PracticeSet5 {
    public static void main(String[] args) {
        // Q1
        // Employee aarsh = new Employee();
        // aarsh.setName("Aarsh");
        // aarsh.salary =500000;
        // System.out.println(aarsh.getName());
        // System.out.println(aarsh.getSalary());
        

        // Q2
        // CellPhone vivo = new CellPhone();
        // vivo.callFriend();
        // vivo.ring();
        // vivo.vibrate();

        //Q3

        // Square sq = new Square();
        // sq.side = 5;
        // System.out.println(sq.area());
        // System.out.println(sq.perimeter());
 
        //Q4

         // Rectangle rc = new Rectangle();
        // rc.length = 5;
        // rc.breadth = 4;
        // System.out.println(rc.area());
        // System.out.println(rc.perimeter());

        //Problem5
        // TommyVercetti player1 = new TommyVercetti();
        // player1.fire();
        // player1.run();
        // player1.hit();

        //Problem6
    //     Circle cr = new Circle();
    //     cr.radius=5;
    //    System.out.println(cr.area());
    //    System.out.println(cr.perimeter());b
       
    }
}
