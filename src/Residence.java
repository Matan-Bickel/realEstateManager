public abstract class Residence extends Property {
    private int parkingSpaces = 0;

    public Residence(int parkingSpaces, String address, double area, double price) {
        super(address, area, price);
        setParkingSpaces(parkingSpaces);
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }
    public void setParkingSpaces(int parkingSpaces) {
        if(parkingSpaces < 0) {
            System.out.println("ERROR! Residence must have at least 1 parking space.");
            return;
        }

        this.parkingSpaces = parkingSpaces;
    }
}