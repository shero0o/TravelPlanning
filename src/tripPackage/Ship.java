package tripPackage;
public class Ship extends Transportation{
    
    private String type_of_transportation = "Ship";

    public Ship(String companyName, String departure_location, String departure_time, String arrival_location, String arrival_time, String duration){
        super(companyName, arrival_location, arrival_time, departure_location, departure_time, duration);
    }

    public String getTypeTransportation(){
        return type_of_transportation;
    }
}
