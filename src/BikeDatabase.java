import java.time.LocalDateTime;
import java.util.ArrayList;

public class BikeDatabase {
    public static final ArrayList<Bike> bikes = new ArrayList<>();

    static {
        bikes.add(new Bike("B105", true, 88, LocalDateTime.now().minusHours(2), "North Canteen Lot"));
        bikes.add(new Bike("B106", false, 40, LocalDateTime.now().minusHours(5), "North Canteen Lot"));
        bikes.add(new Bike("B201", true, 76, LocalDateTime.now().minusHours(3), "South Canteen Lot"));
        bikes.add(new Bike("B305", true, 64, LocalDateTime.now().minusDays(1), "Library"));
        bikes.add(new Bike("B410", false, 20, LocalDateTime.now().minusDays(2), "Main Gate"));
    }
}
