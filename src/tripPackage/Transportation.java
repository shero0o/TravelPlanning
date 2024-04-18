package tripPackage;
public abstract class Transportation {
    private String type_of_transportation;
    private String companyName;
    private String arrival_time;
    private String departure_time;
    private String duration;
    private String departure_location;
    private String arrival_location;

    public Transportation(String companyName, String arrival_location, String arrival_time, String departure_location, String departure_time, String duration) {
        this.companyName = companyName;
        this.arrival_location = arrival_location;
        this.arrival_time = arrival_time;
        this.departure_location = departure_location;
        this.departure_time = departure_time;
        this.duration = duration;
    }


    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(){
        this.companyName = companyName;
    }

    public String getDepartureLocation(){
        return departure_location;
    }
    public void setDepartureLocation(){
        this.departure_location = departure_location;
    }

    public String getArrivalLocation(){
        return arrival_location;
    }
    public void setArrivalLocation(){
        this.arrival_location = arrival_location;
    }

    public String getArrivalTime(){
        return arrival_time;
    }
    public void setArrivalTime(){
        this.arrival_time = arrival_time;
    }
    
    public String getDepartureTime(){
        return departure_time;
    }
    public void setDepartureTime(){
        this.departure_time = departure_time;
    }

    public String getDuration(){
        return duration;
    }
    public void setDuration(){
        this.duration = duration;
    }
}
