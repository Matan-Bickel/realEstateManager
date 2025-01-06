import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    static class PriceException extends Exception {
        public PriceException(String message) {
            super(message);
        }
    }
    public static RealEstateManager manager = new RealEstateManager("Matan & Co.");
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n◩ ◩ ◩ Properties Ba-Am ◪ ◪ ◪\n");
        manager.setProperties(DataManager.createPropertiesArrayList());
        int selection = -1;

        while(true) {
            System.out.println("Please select an option from the menu:");
            System.out.println(" 1  >  Search for real-estate\n" +
                               " 2  >  Financial report\n" +
                               " 3  >  Commercial real-estate yield\n" +
                               " 4  >  Real-estate by city\n" +
                               " 5  >  City number\n" +
                               " 9  >  Exit");
            System.out.print("-> ");
            selection = scanner.nextInt();
            System.out.println();

            switch(selection) {
                case 1:
                    scanner.nextLine();
                    try{
                        propertiesList();
                    } catch (PriceException e) {
                        System.out.println(e.getMessage() + "\n");
                    }
                    break;

                case 2:
                    scanner.nextLine();
                    financialReport();
                    break;

                case 3:
                    scanner.nextLine();
                    commercialYield();
                    break;

                case 4:
                    scanner.nextLine();
                    propertiesByCity();
                    break;

                case 5:
                    scanner.nextLine();
                    numberOfCities();
                    break;

                case 9:
                    System.out.println("Thank you for choosing\n◩ ◩ ◩ Properties Ba-Am ◪ ◪ ◪");
                    exit(1);

                default:
                    scanner.nextLine();
                    System.out.println("\nERROR! Invalid selection.\n");
            }
        }
    }

    public static void propertiesList() throws PriceException {
        System.out.print("Enter a maximum price: ");
        int input = scanner.nextInt();
        if(input < 0)
            throw new PriceException("ERROR! Prices can't be negative.");

        ArrayList<Property> matchingProperties = manager.propertiesByPriceCap(input);
        if(matchingProperties.isEmpty()) {
            System.out.println("No property was found priced up to " + input + ".\n");
            return;
        }

        System.out.println("\nHere's a list of every property priced up to " + input + ":");
        for(Property property : matchingProperties) {
            System.out.println(property + "\n");
        }

        scanner.nextLine();
    } // 1

    public static void financialReport() {
        System.out.print("Total taxes payed per property:");

        for(Property property : manager.properties) {
            System.out.println("\n" + property);
            System.out.print(" Taxes payed: ");
            property.taxIt();
        }
        System.out.println();
    } // 2

    public static void commercialYield() {
        double totalYield = 0;

        for(Property property : manager.properties) {
            if(property instanceof Commercial)
                totalYield += ((Commercial)property).getYield();
        }

        System.out.println("Total yield of commercial properties:\n" + totalYield + "\n");
    } // 3

    public static void propertiesByCity() {
        System.out.print("Enter city name: ");
        String cityInput = scanner.nextLine();
        String normalizedCity = cityInput.toLowerCase();
        normalizedCity = normalizedCity.replace("-", " ");

        boolean check = true;
        for(Property property : manager.properties) {
            String address = property.getAddress();
            int cityIndexInAddress = address.lastIndexOf(",") + 2;
            String city = address.substring(cityIndexInAddress).toLowerCase();

            if(normalizedCity.equals(city)) {
                System.out.println(property + "\n");
                check = false;
            }
        }

        if(check) {
            System.out.println("No property was found in " + cityInput + ".\n");
        }
    } // 4

    public static void numberOfCities() {
        HashMap<String, Boolean> countedCity = new HashMap<>();
        int cityNum = 0;

        for(Property property : manager.properties) {
            String address = property.getAddress();
            int cityIndexInAddress = address.lastIndexOf(",") + 2;
            String city = address.substring(cityIndexInAddress);

            if(!countedCity.containsKey(city)) {
                System.out.println(++cityNum + ". " + city);
                countedCity.put(city, true);
            }
        }

        System.out.println();
    } // 5
}