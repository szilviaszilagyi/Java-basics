package Task103_LocalDateTime_osztaly;

import java.time.LocalDate;
import java.util.List;

public class Person {
    private String firstName;
    private String secondName;
    private String placeOfBirth;
    private LocalDate dateOfBirth;
    private List<String> favMovies;
    private boolean isHappy;
    private int height;
    private String gender;
    private int numberOfYearlyBlackout;

    public Person(String firstName, String secondName, String placeOfBirth, LocalDate dateOfBirth, List<String> favMovies, boolean isHappy, int height) {
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

    public void setNumberOfYearlyBlackout(int numberOfYearlyBlackout) {
        this.numberOfYearlyBlackout = numberOfYearlyBlackout;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\n' +
                ", secondName='" + secondName + '\n' +
                ", placeOfBirth='" + placeOfBirth + '\n' +
                ", dateOfBirth=" + dateOfBirth + '\n' +
                ", favMovies=" + favMovies + '\n' +
                ", isHappy=" + isHappy + '\n' +
                ", height=" + height + '\n' +
                ", gender='" + gender + '\n' +
                ", numberOfYearlyBlackout=" + numberOfYearlyBlackout +
                '}';
    }
}

