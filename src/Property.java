public abstract class Property {
    private String address = "Na, na";
    private double area = 0;
    private double price = 0;

    public Property(String address, double area, double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }

    public abstract void taxIt();

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        if(address.isBlank() || !address.contains(" ")) {
            System.out.println("ERROR! Address must contain two or more words.");
            return;
        }

        this.address = address;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        if(area < 0) {
            System.out.println("ERROR! Area can't be a negative value.");
            return;
        }

        this.area = area;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price < 0) {
            System.out.println("ERROR! Price can't be a negative value.");
            return;
        }

        this.price = price;
    }

    @Override
    public String toString() {
        return " Address: " + address +
                "\n Area: " + area +
                "\n Price: " + String.format("%.0f", price);
    }
}