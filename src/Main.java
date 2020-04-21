import lab2.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.runMenu();
    }
}

class SimpleClass {
    public SimpleClass() {
        System.out.println("multiple classes in a top-level .java file is not a good idea");
    }
}
