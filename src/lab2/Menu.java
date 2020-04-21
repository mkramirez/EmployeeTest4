package lab2;
import java.util.Scanner;

public class Menu {
    int arrayIndex = 2;
    ProductionWorker myArray[] = new ProductionWorker[20];
    boolean exit;

    public void runMenu() {
        printHeader();
        addInitialEmployees();
        while (!exit) {
            printMenu();
            int choice = getMenuChoice();
            performAction(choice);
        }
    }

    private void addInitialEmployees() {
        myArray[0] = new ProductionWorker("Nam", 5920390, 1, 25);
        myArray[1] = new ProductionWorker("Bryan", 1029301, 2, 20);
    }

    private void printHeader() {
        System.out.println("Welcome to your business application");
    }

    private void printMenu() {
        displayHeader("Please make a selection");
        System.out.println("1) Look up an employee in the list");
        System.out.println("2) Add a new employee to the list");
        System.out.println("3) Change an existing employee's ID");
        System.out.println("4) Delete an employee using the ID");
        System.out.println("0) Exit");
    }

    private int getMenuChoice() {
        Scanner keyboard = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Numbers only please.");
            }
            if (choice < 0 || choice > 4) {
                System.out.println("Choice outside of range. Please chose again.");
            }
        } while (choice < 0 || choice > 4);
        return choice;
    }

    private void displayHeader(String message){
        System.out.println();
        int width = message.length() + 6;
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        for(int i = 0; i < width; ++i){
            sb.append("-");
        }
        sb.append("+");
        System.out.println(sb.toString());
        System.out.println("|   " + message + "   |");
        System.out.println(sb.toString());
    }

    private void performAction(int choice) {
        switch (choice) {
            case 0:
                System.out.println("Thank you for using our application.");
                System.exit(0);
                break;
            case 1:
                lookUp();
                break;
            case 2:
                addEmp();
                break;
            case 3:
                changeEmp();
                break;
            case 4:
                deleteEmp();
                break;
            default:
                System.out.println("Unknown error has occured.");
        }
    }

    private void lookUp() {
        displayHeader("Here is the list of all Employees Currently");
        for (int i = 0; i < arrayIndex; i++) {
            System.out.println((i + 1) + ")" + "Name: " + myArray[i].getName()+ "ID: " + myArray[i].getNumber() + "ShiftNumber: " + myArray[i].getShiftNumber() + "Pay Rate:$" + myArray[i].getPayrate());
        }
    }

    private void addEmp() {
        Scanner input = new Scanner(System.in);
        displayHeader("Create Employee by starting with the name");
        String name = input.nextLine();
        System.out.println("Please Enter Employee ID number");
        int number = input.nextInt();
        System.out.println("Please Enter Employee Shift Number (1,2,3)");
        int shift = input.nextInt();
        System.out.println("Please Enter Employee Payrate");
        int payrate = input.nextInt();
        myArray[arrayIndex] = new ProductionWorker(name, number, shift, payrate);
        arrayIndex ++;
    }

    private void changeEmp() {
        displayHeader("Please pick which employees ID you would like to edit by typing the number");
        int thisEmployee = 0;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 0; i < arrayIndex; i++) {
            if (myArray[i].getNumber() == number) {
                thisEmployee = i;
            }
        }
        if (thisEmployee == 0) {
            System.out.println("This is not a valid Employee ID");
        }
        else {
            System.out.println("Enter a new Employee ID");
            int changeID = input.nextInt();
            String currentName = myArray[thisEmployee].getName();
            int currentShiftNum = myArray[thisEmployee].getShiftNumber();
            int currentPayRate = myArray[thisEmployee].getPayrate();
            myArray[thisEmployee] = new ProductionWorker(currentName, changeID, currentShiftNum, currentPayRate);
        }
    }

    private void deleteEmp() {
        displayHeader("Please pick which employee you would like to delete by typing their ID");
        int thisEmployee = 0;
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 0; i < arrayIndex; i++) {
            if (myArray[i].getNumber() == number) {
                thisEmployee = i;
            }
        }
        if (thisEmployee == 0) {
            System.out.println("This is not a valid Employee ID");
        }
        else {
            System.out.println("This Employee has been Deleted");
                    for (int j = thisEmployee; j < myArray.length - 1; j++) {
                        myArray[j] = myArray[j + 1];
                    }
                    arrayIndex--;
            }
        }
}
