package tripPackage;

import javax.swing.SizeRequirements;

public class Hotel {

    private String hotelName;
    private String hotelLocation;
    private int hotelCosts;

    public Hotel(String hotelName, String hotelLocation, int hotelCosts){
        this.hotelName = hotelName;
        this.hotelLocation = hotelLocation;
        this.hotelCosts = hotelCosts;
    }

    public String getHotelName(){
        return hotelName;
    }

    public String getHotelLocation(){
        return hotelLocation;
    }

    public int getHotelCosts(){
        return hotelCosts;
    }
}
