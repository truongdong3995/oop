package Bai1;

import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerHotel managerHotel = new ManagerHotel();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add customer");
            System.out.println("2. Remove customer by ID card number");
            System.out.println("3. Calculate bill for customer by ID card number");
            System.out.println("4. Show customer info by ID card number");
            System.out.println("5. Show all information");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter customer's full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter customer's age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter customer's ID card number: ");
                    String idCardNumber = scanner.nextLine();
                    System.out.print("Enter room type: ");
                    String roomType = scanner.nextLine();
                    Room room = null;
                    switch (roomType) {
                        case "A": room = new Room("A", 500);break;
                        case "B": room = new Room("B", 300);break;
                        case "C": room = new Room("C", 200);break;
                        default: room = new Room("D", 100);break;
                    }

                    managerHotel.addCustomer(new Customer(fullName, age, idCardNumber, room));
                    break;
                case 2:
                    System.out.print("Enter customer's ID card number to remove: ");
                    String removeIdCardNumber = scanner.nextLine();
                    managerHotel.removeCustomer(removeIdCardNumber);
                    break;
                case 3:
                    System.out.print("Enter customer's ID card number to calculate bill: ");
                    String calculateIdCardNumber = scanner.nextLine();
                    System.out.print("Enter number of days stayed: ");
                    int numOfDays = scanner.nextInt();
                    double bill = managerHotel.calculateBill(calculateIdCardNumber, numOfDays);
                    if (bill != -1) {
                        System.out.println("Total bill for customer with ID card number " + calculateIdCardNumber + ": " + bill + "$");
                    } else {
                        System.out.println("Customer with ID card number " + calculateIdCardNumber + " not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter customer's ID card number to show info: ");
                    String showInfoIdCardNumber = scanner.nextLine();
                    managerHotel.showCustomerInfo(showInfoIdCardNumber);
                    break;
                case 5:
                    managerHotel.showAllInfo();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
