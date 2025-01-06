import java.util.ArrayList;

public class RealEstateManager {
    private String name;
    ArrayList<Property> properties = new ArrayList<>();

    public RealEstateManager(String name) {
        setName(name);
    }

    public void addPropertyToProperties(Property property) {
        properties.add(property);
    }
    public ArrayList<Property> propertiesByPriceCap(double price) {
        ArrayList<Property> matchingPropertyList = new ArrayList<>();

        for(Property property : properties) {
            if(property.getPrice() <= price) {
                matchingPropertyList.add(property);
            }
        }

        return matchingPropertyList;
    }
    public double totalPropertiesValue() {
        double totalValue = 0;

        for(Property property : properties) {
            totalValue += property.getPrice();
        }

        return totalValue;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }
    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
}