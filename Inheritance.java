class Vehicle {
    // Fields
    protected String brand;
    protected int year;

    // Parameterized constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    // Field
    private int price;

    // Parameterized constructor
    public Car(String brand, int year, int price) {
        super(brand, year); // Call to superclass constructor
        this.price = price;
    }

    // Overriding method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call to superclass method
        System.out.println("Price: " + price);
    }

    // Method to demonstrate accessing superclass variable
    public void displayBrand() {
        System.out.println("Vehicle Brand: " + super.brand); // Access to superclass variable
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating an instance of Car
        Car myCar = new Car("Toyota", 2020, 30000);

        // Display information using overridden method
        myCar.displayInfo();

        // Display brand using method accessing superclass variable
        myCar.displayBrand();
    }
}
