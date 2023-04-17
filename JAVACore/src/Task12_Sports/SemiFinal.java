package Task12_Sports;

public class SemiFinal implements Sports, Event {
    private String location;
    private String eventName;
    private String awayTeam;
    private String homeTeam;
    private String sportType;


    public SemiFinal(String location, String sportType) {
        this.location = location;
        this.sportType = sportType;
    }

    @Override
    public void setEventName() {
        eventName = "WorldCup Semifinal";

    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setHomeTeam(String teamName) {
        homeTeam = teamName;

    }

    @Override
    public void setAwayTeam(String teamName) {
        awayTeam = teamName;

    }

    @Override
    public String getSportType() {
        return sportType;
    }

    @Override
    public String toString() {
        return "SemiFinal{" +
                "location='" + location + '\'' +
                ", eventName='" + eventName + '\'' +
                ", awayTeam='" + awayTeam + '\'' +
                ", homeTeam='" + homeTeam + '\'' +
                ", sportType='" + sportType + '\'' +
                '}';
    }
}
