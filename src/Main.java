import lab2.*;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.runMenu();;
        //ProductionWorker workers = new ProductionWorker("Nam", 123123, 1, 25);
        //ProductionWorker.ExtraPay extra = new ProductionWorker.ExtraPay();
        //System.out.println("The extra pay rate is: " + extra.getExtraPayRate());
        //new SimpleClass();
    }
}

class SimpleClass {
    public SimpleClass() {
        System.out.println("multiple classes in a top-level .java file is not a good idea");
    }
}
