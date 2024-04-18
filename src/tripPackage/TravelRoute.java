package tripPackage;
import tripPackage.*;
import java.util.ArrayList;

public class TravelRoute {
    ArrayList<Activity> activities = new ArrayList<Activity>();
    ArrayList<Hotel> hotels = new ArrayList<Hotel>();
    ArrayList<Transportation> transportations = new ArrayList<Transportation>();

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public void deleteActivity(Activity activity){
        activities.remove(activity);
    }

    public void showActivities(){
        for (Activity activity : activities) {
            System.out.println("(Activiy Name: " + activity.getActivityName() + ", Activity Location: " + activity.getActivityLocation() + ", Activity Costs: "+ activity.getActivityCosts() + " Euros)");
        }
    }

    public void addHotel(Hotel hotel){
        hotels.add(hotel);
    }

    public void deleteHotel(Hotel hotel){
        hotels.remove(hotel);
    }

    public void showHotels(){
        for (Hotel hotel : hotels) {
            System.out.println("(Hotel Name: " + hotel.getHotelName() + ", Hotel Location: " + hotel.getHotelLocation() + ", Hotels Costs: "+ hotel.getHotelCosts() + " Euros)");
        }
    }

    public void addTransportation(Transportation transportation){
        transportations.add(transportation);
    }

    public void deleteTransportation(Transportation transportation){
        transportations.add(transportation);
    }

    public void showTransportations(){
        for (Transportation transportation: transportations) {
            System.out.println("(Type: "+transportation.getTypeTransportation() +"Company Name: " + transportation.getCompanyName() + ", Arrival Location: " + transportation.getArrivalLocation() + ", Arrival Time: "+ transportation.getArrivalTime() + ", Departure Location: "+transportation.getDepartureLocation() + ", Departure Time: " +transportation.getDepartureTime() + ", Duration: " + transportation.getDuration()+")");
        }
    }
}
