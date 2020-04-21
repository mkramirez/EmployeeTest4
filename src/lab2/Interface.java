package lab2;
import java.util.Scanner;

public class Interface {
    interface lookUp {
        public void lookupInterface();
    }

    interface addEmployee {
        public void addEmployeeInterface();
    }

    interface changeIDemployee {
        public void changeIDemployee();
    }

    interface deleteEmployee {
        public void deleteEmployee();
    }

    interface quitMenu {
        public void quitMenu();
    }

    class mainInterface implements lookUp, addEmployee, changeIDemployee, deleteEmployee, quitMenu {
        public void lookupInterface() {

        }

        public void addEmployeeInterface() {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter Employee Name");
            String name = input.nextLine();
            System.out.println("Please Enter Employee ID number");
            int number = input.nextInt();
            System.out.println("Please Enter Employee Shift Number (1,2,3)");
            int shift = input.nextInt();
            System.out.println("Please Enter Employee Payrate");
            int payrate = input.nextInt();
            new ProductionWorker(name, number, shift, payrate);
        }

        public void changeIDemployee() {

        }

        public void deleteEmployee() {

        }

        public void quitMenu() {

        }
    }
}
