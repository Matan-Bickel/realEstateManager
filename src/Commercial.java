public class Commercial extends Property {
    private boolean storeroom = false;
    private double yield = 0.0;

    public Commercial(boolean storeroom, double yield, String address, double area, double price) {
        super(address, area, price);
        setStoreroom(storeroom);
        setYield(yield);
    }
    public Commercial(double yield, String address, double area, double price) {
        super(address, area, price);
        this.yield = yield;
    }

    public void calculateMonthlyProfit() {
        System.out.println((super.getPrice() * (getYield() / 100)) / 12);
    }
    public void taxIt() {
        System.out.println(super.getPrice() * 0.05);
    }

    public boolean getStoreroom() {
        return storeroom;
    }
    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public double getYield() {
        return yield;
    }
    public void setYield(double yield) {
        if(yield < 0) {
            System.out.println("ERROR! Yearly yield can't be a negative value.");
            return;
        }

        this.yield = yield;
    }
}