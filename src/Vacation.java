public class Vacation extends Residence {
    private int guests = 1;

    public Vacation(int guests, int parkingSpaces, String address, double area, double price) {
        super(parkingSpaces, address, area, price);
        setGuests(guests);
    }

    public void taxIt() {
        System.out.println(super.getPrice() * 0.25);
    }

    public int getGuests() {
        return guests;
    }
    public void setGuests(int guests) {
        if(guests < 1) {
            System.out.println("ERROR! At least 1 guest must go on a vacation.");
        }

        this.guests = guests;
    }
}