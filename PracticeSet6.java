class Cylinder{
    private int radius;
    private int height;
    // using Getters & Setters 
    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }
    // using Constructors  

    public Cylinder(int radius,int height){
        this.radius =radius;
        this.height = height;
    }
    

    public double surfaceArea(){
        return 2*3.14*radius*radius+2*3.14*radius*height;
    }
    public double volume(){
        return 3.14*radius*radius*height;
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int l,int b){
        this.length =l;
        this.breadth =b;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int l) {
        this.length = l;
    }
    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int b) {
        this.breadth = b;
    }

    
}

class Sphere{
    private int radius;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public double sphereVolume(){
        return  (4*Math.PI*radius*radius*radius)/3; 
    }
    public double sphereSurfaceArea(){
        return 4*Math.PI*radius*radius;
    }
}
public class PracticeSet6 {
public static void main(String[] args) {

    // Q1
     //Cylinder myCylinder = new Cylinder();
     //myCylinder.setRadius(12);
    //  myCylinder.setHeight(15);
    //  System.out.println("Radius is "+ myCylinder.getRadius()+"\nHeight is "+myCylinder.getHeight());

    // Q2
    //  Cylinder myCylinder = new Cylinder();
    //  myCylinder.setRadius(12);
    //  myCylinder.setHeight(15);
    //  System.out.println("Radius is "+ myCylinder.getRadius()+"\nHeight is "+myCylinder.getHeight());
    //  System.out.println("Surface Area : " + myCylinder.surfaceArea());
    //  System.out.println("Volume : " + myCylinder.volume());


    // Q3
    // Cylinder mCylinder = new Cylinder(12, 15);
    // System.out.println(mCylinder.surfaceArea());
    // System.out.println(mCylinder.volume());
    // System.out.println(mCylinder.volume());
    
    //Q4
    // Rectangle r = new Rectangle(120, 56);
    // System.out.println(r.getLength());
    // System.out.println(r.getBreadth());

    //Q5
    // Sphere s = new Sphere();
    // s.setRadius(5);
    // System.out.format("The Volume of a sphere with radius %d is %f and Surface area of sphere is %f",s.getRadius(),s.sphereVolume(),s.sphereSurfaceArea());


}
}
