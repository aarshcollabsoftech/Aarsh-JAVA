class Employee1 {
    int id;
    int salary;
    String name;
    public void printDetails(){

        System.out.println(id);
        System.out.println(name);
    }

    public int getSalary(){
        return salary;
    }
}

public class OOPS {

    public static void main(String[] args) {
        System.out.println("This is our first custom class.");
        Employee1 aarsh = new Employee1();  //Instantiating a new Employee Object
        Employee1 deval = new Employee1();  //Instantiating a new Employee Object
        aarsh.id = 12;
        aarsh.name = "Aarsh";
        aarsh.salary =12000;
        deval.id =13;
        deval.name = "Deval Sinh";
        aarsh.printDetails();
        deval.printDetails();
        int salary = aarsh.getSalary();
       System.out.println(salary);
    }
 
}
