package lab2;

public class ProductionWorker extends Employee{
    int payrate = 0;
    private int shiftNumber;

    public ProductionWorker(String name, int number, int shiftNumber, int payrate) {
        super(name, number);
        this.shiftNumber = shiftNumber;
        this.payrate = payrate;
        //System.out.println("Constructing a Production Worker");
    }

    public int getShiftNumber() {
        return shiftNumber;
    }
    public int getPayrate() {
        return payrate;
    }

    public static class ExtraPay{
        int extra = 100;
        public int getExtraPayRate(){
            return extra;
        }
    }
}
