class Cars{
    public String carName;
    public int regYear;
    public int sellAmount;
   
    public Cars(String carName, int regYear, int sellAmount) {
        this.carName = carName;
        this.regYear = regYear;
        this.sellAmount = sellAmount;
    }
    public Cars(){}
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getRegYear() {
        return regYear;
    }

    public void setRegYear(int regYear) {
        this.regYear = regYear;
    }

    public int getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(int sellAmount) {
        this.sellAmount = sellAmount;
    }
}
    


public class MARKS {
public static void main(String[] args) {
    Cars c1 = new Cars("Alto", 2010, 100000);
    System.out.println(c1.carName+" "+c1.regYear+" "+c1.sellAmount);
    Cars c2 = new Cars();
    c2.setCarName("Swift");
    c2.setRegYear(2015);
    c2.setSellAmount(200000);
    System.out.println(c2.getCarName() + " " + c2.getRegYear() + " " + c2.getSellAmount());
    
}
}
