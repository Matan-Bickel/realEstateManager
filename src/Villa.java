public class Villa extends Residence {
    private int levels = 1;

    public Villa(int levels, int parkingSpaces, String address, double area, double price) {
        super(parkingSpaces, address, area, price);
        setLevels(levels);
    }

    public void taxIt() {
        System.out.println(super.getPrice() * 0.08);
    }

    public int getLevels() {
        return levels;
    }
    public void setLevels(int levels) {
        if(levels < 1) {
            System.out.println("ERROR! Villas must have at least 1 floor!");
            return;
        }

        this.levels = levels;
    }
}