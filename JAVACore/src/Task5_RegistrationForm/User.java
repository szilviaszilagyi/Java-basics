/**
 * (Órai) Regisztrációs lap. Egy közösségi oldal regisztrációs űrlapját kell elkészíteni. Készíts egy POJO-t amely magába foglalja a
 * következő információkat a felhasználóról:
 * email
 * név
 * születési idő
 * telefonszám
 * munkahely
 * A sikeres regisztrációhoz kötelező megadni az email címet, nevet, illetve a születési dátumot. A többi adatot opcionálisan adhatja meg a felhasználó.
 * Készíts olyan osztályt, amely rendelkezik a megfelelő konstruktorokkal, illetve getter és setter metódusokkal. Ha egy felhasználó nem rendelkezik a
 * megfelelő adatokkal, a program írjon ki hibaüzentet. Abban az esetben, ha a felhasználó kitöltötte a kötelező mezőket, a program írja ki az összes
 * megadott adatot.
 */
package Task5_RegistrationForm;

public class User {
    private String email;
    private String name;
    private String birthday;
    private int phoneNumber;
    /**
     * nem lehet +36-tal kezdődő
     */
    private String company;

    public User(String email, String name, String birthday) {
        this.email = email;
        this.name = name;
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", company='" + company + '\'' +
                '}';
    }
}
