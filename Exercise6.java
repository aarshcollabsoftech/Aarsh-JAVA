public class Exercise6 {
    public static void main(String[] args) throws InvalidInputException, MaxInputException, CantDivideByZero{
        
        //Create Calculator
        Calculator cal = new Calculator();
        // System.out.println(cal.add(9000000,80000));
        System.out.println(cal.div(9,0));

    }
}



class Calculator {
    double add(double a,double b)throws InvalidInputException,MaxInputException{
        if(a==9 ||b ==8 ){
            throw new InvalidInputException("Can't add 9 & 8");
        }
        if(a>100000 ||b >100000 ){
            throw new MaxInputException("Max Limit exceeded");
        }
        return a+b;
    }
    double sub(double a,double b)throws InvalidInputException{
        return a-b;
    }
    double mul(double a,double b)throws InvalidInputException{
        return a*b;
    }
    double div(double a,double b)throws CantDivideByZero{
        if(b==0){
            throw new CantDivideByZero("Can't Divide By Zero");
        }
        return a/b;
    }

}


class InvalidInputException extends Exception{
    InvalidInputException(String msg){
        super(msg);
    }
}
class MaxInputException extends Exception{
    MaxInputException(String msg){
        super(msg);
    }
}
class CantDivideByZero extends Exception{
    CantDivideByZero(String msg){
        super(msg);
    }
}