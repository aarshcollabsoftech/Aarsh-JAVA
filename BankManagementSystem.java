import java.util.Scanner;

public class BankManagementSystem {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount("Aarsh", "9099969376");
        bank1.showMenu();
    }
}

class BankAccount {
    int balance ;
    int previousTransaction;
    String customerName;
    String customerId;
    BankAccount(String cName,String cId){
        customerName =cName;
        customerId =cId;
    }

    void deposit(int amount){
        if(amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }
    void withDraw(int amount){
        if(amount != 0){
            balance -= amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited :"+previousTransaction);
        }
        else if(previousTransaction<0){
            System.out.println("Withdraw :"+Math.abs(previousTransaction));
        }
        else{
            System.out.println("Transactinos Failed...");
        }
    }

    void showMenu(){
        Scanner sc = new Scanner(System.in);
        char option  ='\0';
        System.out.println("Welcome "+ customerName);
        System.out.println("Id:"+customerId);
        System.out.println();
        System.out.println("A : Check Balance");
        System.out.println("B : Deposit");
        System.out.println("C : Withdraw");
        System.out.println("D : Previous Transaction");
        System.out.println("E : Exit");
do {
    System.out.println("==============================");
    System.out.println("Enter an option ");
    System.out.println("==============================");
    option = sc.next().charAt(0);
    Character.toUpperCase(option);
    switch (option) {
        case 'A':
            System.out.println("==============================");
            System.out.println("Available Balance :"+balance);
            System.out.println();
            break;
        case 'B':
            System.out.println("==============================");
            System.out.println("Enter the amount to be deposited :");
            int amount =sc.nextInt();
            deposit(amount);
            System.out.println();
            break;
        case 'C':
            System.out.println("==============================");
            System.out.println("Enter the amount to be withdrawn :");
            int amount2 =sc.nextInt();
            withDraw(amount2);
            System.out.println();
            break;
        case 'D':
            System.out.println("==============================");
            getPreviousTransaction();
            System.out.println();
            break;
        case 'E':
            System.out.println("==============================");
            System.out.println("Thankyou");
            break;
    
        default:
        System.out.println("Invalid Option. Please try again ");
            break;
    }
} while (option != 'E');
sc.close();
    }
}
