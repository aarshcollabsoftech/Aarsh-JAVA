class Calc{

    public int x;
    public int y;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
 

    
}



public class Ques {
public static void main(String[] args) {
    Calc c = new Calc();
    c.setX(2);
    c.setY(5);
    System.out.println(c.getX()+" "+c.getY());
    
}
}
