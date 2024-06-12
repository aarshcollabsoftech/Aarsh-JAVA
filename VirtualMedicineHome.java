import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Define the abstract Medicine class
abstract class Medicine {
    String name;
    double price;
    int quantity;

    public Medicine(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract void displayInfo();
}

// Define the PrescriptionMedicine class
class PrescriptionMedicine extends Medicine {
    String doctorName;

    public PrescriptionMedicine(String name, double price, int quantity, String doctorName) {
        super(name, price, quantity);
        this.doctorName = doctorName;
    } 

    @Override
    public void displayInfo() {
        System.out.println("Prescription Medicine: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Prescribed by: " + doctorName);
    }
}

// Define the OverTheCounterMedicine class
class OverTheCounterMedicine extends Medicine {
    public OverTheCounterMedicine(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Over-the-Counter Medicine: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

// Inventory class to manage medicines
class Inventory {
    private List<Medicine> medicines = new ArrayList<>();

    public synchronized void addMedicine(Medicine medicine) {
        medicines.add(medicine);
        System.out.println("Added medicine: " + medicine.name);
    }

    public synchronized void removeMedicine(String name) {
        for (int i = 0; i < medicines.size(); i++) {
            if (medicines.get(i).name.equals(name)) {
                System.out.println("Removed medicine: " + medicines.get(i).name);
                medicines.remove(i);
                return;
            }
        }
        System.out.println("Medicine not found: " + name);
    }

    public synchronized void displayMedicines() {
        if (medicines.isEmpty()) {
            System.out.println("No medicines in inventory.");
        } else {
            for (Medicine medicine : medicines) {
                medicine.displayInfo();
            }
        }
    }
}

// Thread to add medicines to inventory
class AddMedicineThread extends Thread {
    private Inventory inventory;
    private Medicine medicine;

    public AddMedicineThread(Inventory inventory, Medicine medicine) {
        this.inventory = inventory;
        this.medicine = medicine;
    }

    @Override
    public void run() {
        inventory.addMedicine(medicine);
    }
}

// Thread to remove medicines from inventory
class RemoveMedicineThread extends Thread {
    private Inventory inventory;
    private String medicineName;

    public RemoveMedicineThread(Inventory inventory, String medicineName) {
        this.inventory = inventory;
        this.medicineName = medicineName;
    }

    @Override
    public void run() {
        inventory.removeMedicine(medicineName);
    }
}

// Main class to run the virtual medicine home
public class VirtualMedicineHome {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        // Simple menu-driven interface
        while (true) {
            System.out.println("\nVirtual Medicine Home");
            System.out.println("1. Add Prescription Medicine");
            System.out.println("2. Add Over-the-Counter Medicine");
            System.out.println("3. Remove Medicine");
            System.out.println("4. Display All Medicines");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter medicine name: ");
                    String pName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double pPrice = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int pQuantity = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter doctor's name: ");
                    String doctorName = scanner.nextLine();
                    Medicine prescriptionMedicine = new PrescriptionMedicine(pName, pPrice, pQuantity, doctorName);
                    Thread addPrescriptionThread = new AddMedicineThread(inventory, prescriptionMedicine);
                    addPrescriptionThread.start();
                    break;
                case 2:
                    System.out.print("Enter medicine name: ");
                    String oName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double oPrice = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int oQuantity = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    Medicine overTheCounterMedicine = new OverTheCounterMedicine(oName, oPrice, oQuantity);
                    Thread addOTCThread = new AddMedicineThread(inventory, overTheCounterMedicine);
                    addOTCThread.start();
                    break;
                case 3:
                    System.out.print("Enter medicine name to remove: ");
                    String rName = scanner.nextLine();
                    Thread removeThread = new RemoveMedicineThread(inventory, rName);
                    removeThread.start();
                    break;
                case 4:
                    inventory.displayMedicines();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }

            // Pause to allow threads to complete actions
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
