package tripPackage;

public class Activity {
    private String activityName;
    private String activityLocation;
    private int activityCosts;

    public Activity(String activityName, String activityLocation, int activityCosts){
        this.activityName = activityName;
        this.activityLocation = activityLocation;
        this.activityCosts = activityCosts;
    }

    public String getActivityName(){
        return activityName;
    }

    public String getActivityLocation(){
        return activityLocation;
    }

    public int getActivityCosts(){
        return activityCosts;
    }
}
