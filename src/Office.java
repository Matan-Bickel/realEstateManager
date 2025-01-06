public class Office extends Property {

    public Office(String address, double area, double price) {
        super(address, area, price);
    }

    public void taxIt() {
        System.out.println(super.getPrice() * 0.05);
    }
}