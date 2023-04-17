package Task4_steak;

public class Steak {
    private String typeOfMeat;
    private int cookingTimeInMinutes;
    private String cookingMethod;
    private String spice;
    private String marinate;

    public Steak(String typeOfMeat, int cookingTimeInMinutes, String cookingMethod, String spice, String marinate ) {
        this.typeOfMeat = typeOfMeat;
        this.cookingTimeInMinutes = cookingTimeInMinutes;
        this.cookingMethod =cookingMethod;
        this.spice = spice;
        this.marinate = marinate;
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }

    public void setTypeOfMeat(String typeOfMeat) {
        this.typeOfMeat = typeOfMeat;
    }

    public int getCookingTimeInMinutes() {
        return cookingTimeInMinutes;
    }

    public String getCookingMethod() {
        return cookingMethod;
    }

    public void setCookingMethod(String cookingMethod) {
        this.cookingMethod = cookingMethod;
    }

    public void setCookingTimeInMinutes(int cookingTimeInMinutes) {
        this.cookingTimeInMinutes = cookingTimeInMinutes;
    }

    public String getSpice() {
        return spice;
    }

    public void setSpice(String spice) {
        this.spice = spice;
    }

    public String getMarinate() {
        return marinate;
    }

    public void setMarinate(String marinate) {
        this.marinate = marinate;
    }

    @Override
    public String toString() {
        return "Task4_steak.Steak_task4{" +
                "typeOfMeat='" + typeOfMeat + '\'' +
                ", cookingTimeInMinutes=" + cookingTimeInMinutes +
                ", cookingMethod='" + cookingMethod + '\'' +
                ", spice='" + spice + '\'' +
                ", marinate='" + marinate + '\'' +
                '}';
    }
}
