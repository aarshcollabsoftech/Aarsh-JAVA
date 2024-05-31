interface Bicycle{
    int a= 50;
    void applyBrakes(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int a = 45;
    void blowHornK3g();
    void blowHornMhn();
   
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("PEEP");
    }
    void blowHornK3g(){
        System.out.println("K3G");
    }
    void blowHornMhn(){
        System.out.println("MHN");
    }
   public void applyBrakes(int decrement){
        System.out.println("Apply Break");
    };
    public void speedUp(int increment){
        System.out.println("Speeding Up");
    }
}



public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle1 = new AvonCycle();
        cycle1.applyBrakes(1);
        System.out.println(cycle1.a);
        cycle1.blowHornK3g();
    }
}

