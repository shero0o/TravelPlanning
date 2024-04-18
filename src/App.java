import javax.sql.rowset.spi.TransactionalWriter;

import tripPackage.Activity;
import tripPackage.Ship;
import tripPackage.Transportation;
import tripPackage.TravelRoute;

public class App {
    public static void main(String[] args) throws Exception {
       
        TravelRoute travelRoute = new TravelRoute();
        Activity activity = new Activity("swimming", "Dornbirn", 20);
        Transportation transportation = new Ship("Austrian Ship", "England", "16:40", "India", "9:20", "3 days");

        travelRoute.addActivity(activity);
        travelRoute.showActivities();

        travelRoute.addTransportation(transportation);
        travelRoute.showTransportations();
    }
}
