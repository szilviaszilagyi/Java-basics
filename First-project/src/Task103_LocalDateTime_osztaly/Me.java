package Task103_LocalDateTime_osztaly;

/**
 * Refactoráljátok úgy a kódot, hogy az adatok beolvasása egy metódusban történik, mely a String-ként beolvasott elemeket egy List-be pakolja és a
 * metódus ezzel a listával tér vissza. A példányosításkor pedig a konstruktor ezen lista elemeit kapja meg és kerüljön neki átadásra.
 * Pl.: getUserInputList()
 */
public class Me {
    private String firstName;
    private String secondName;
    private String placeOfBirth;
    private String dateOfBirth;
    private String favMovies;
    private String isHappy;
    private String height;
    private String gender;
    private String numberOfYearlyBlackout;

    public Me(String firstName, String secondName, String placeOfBirth, String dateOfBirth, String favMovies, String isHappy, String height) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.placeOfBirth = placeOfBirth;
        this.dateOfBirth = dateOfBirth;
        this.favMovies = favMovies;
        this.isHappy = isHappy;
        this.height = height;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNumberOfYearlyBlackout(String numberOfYearlyBlackout) {
        this.numberOfYearlyBlackout = numberOfYearlyBlackout;
    }

    @Override
    public String toString() {
        return "Me{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", favMovies='" + favMovies + '\'' +
                ", isHappy='" + isHappy + '\'' +
                ", height='" + height + '\'' +
                ", gender='" + gender + '\'' +
                ", numberOfYearlyBlackout='" + numberOfYearlyBlackout + '\'' +
                '}';
    }
}
