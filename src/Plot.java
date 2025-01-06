public class Plot extends Property {
    public enum TYPE {
        URBAN,
        AGRICULTURE,
        INDUSTRIAL
    }
    private TYPE type = TYPE.URBAN;

    public Plot(TYPE type, String address, double area, double price) {
        super(address, area, price);
        setType(type);
    }

    public void taxIt() {
        switch(getType()) {
            case URBAN:
                System.out.println(super.getPrice() * 0.10);
                break;

            case AGRICULTURE:
                System.out.println(super.getPrice() * 0.02);
                break;

            case INDUSTRIAL:
                System.out.println(super.getPrice() * 0.05);
                break;
        }
    }

    public TYPE getType() {
        return type;
    }
    public void setType(TYPE type) {
        this.type = type;
    }
}