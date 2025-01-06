import java.util.ArrayList;

public class DataManager {

    public static ArrayList<Property> createPropertiesArrayList() {
        ArrayList<Property> propertiesArrayList = new ArrayList<>();

        propertiesArrayList.add(new Plot(Plot.TYPE.URBAN, "Zalman Shazar 5, Hod HaSharon", 200, 8_000_000));
        propertiesArrayList.add(new Plot(Plot.TYPE.AGRICULTURE, "Lemon Street 4, Kfar Malal", 2_000, 10_000_000));
        propertiesArrayList.add(new Plot(Plot.TYPE.INDUSTRIAL, "Shaham 13, Petah Tikva", 400, 9_000_000));

        propertiesArrayList.add(new Apartment(5, 2, "Yair Rosenblum 16, Kfar Saba", 350, 9_500_000));
        propertiesArrayList.add(new Apartment(3, 1, "Dizingoff 266, Tel Aviv", 150, 15_000_000));

        propertiesArrayList.add(new Villa(2, 4, "Palm Avenue 7, Herzliya", 500, 25_000_000));
        propertiesArrayList.add(new Villa(3, 6, "Cypress Street 12, Caesarea", 800, 30_000_000));

        propertiesArrayList.add(new Vacation(6, 2, "Ocean Drive 21, Eilat", 300, 12_000_000));
        propertiesArrayList.add(new Vacation(8, 3, "Haroe 6, Ramat Gan", 400, 10000000));

        propertiesArrayList.add(new Commercial(false, 0.07, "Rothschild Blvd 100, Tel Aviv", 1_000, 50_000_000));
        propertiesArrayList.add(new Commercial(true, 0.05, "Har Zion Blvd 3, Haifa", 700, 35_000_000));

        propertiesArrayList.add(new Office("Begin Road 45, Jerusalem", 250, 20_000_000));
        propertiesArrayList.add(new Office("Weizmann Street 10, Rehovot", 400, 18_000_000));

        return propertiesArrayList;
    }
}