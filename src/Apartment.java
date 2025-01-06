public class Apartment extends Residence {
    private int rooms = 1;

    public Apartment(int rooms, int parkingSpaces, String address, double area, double price) {
        super(parkingSpaces, address, area, price);
        this.rooms = rooms;
    }

    public void taxIt() {
        System.out.println(super.getPrice() * 0.08);
    }

    public int getRooms() {
        return rooms;
    }
    public void setRooms(int rooms) {
        if(rooms < 2) {
            System.out.println("ERROR! Apartment must have at least 2 rooms!");
            return;
        }

        this.rooms = rooms;
    }
}