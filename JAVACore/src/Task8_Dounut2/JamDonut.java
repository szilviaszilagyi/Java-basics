package Task8_Dounut2;

public class JamDonut extends ClassicDoughnut {

    private final String fruitPercentage;

    public JamDonut(String form, String size, String flavor, String ingredients, String decoration, String fruitPercentage) {
        super(form, size, flavor, ingredients, decoration);
        this.fruitPercentage = fruitPercentage;
    }


    public void lekvar(){
        System.out.println("nyami, lekvár");
    }

    @Override
    public String toString() {
        return "JamDonut{" +
                "fruitPercentage='" + fruitPercentage + '\'' +
                super.toString() +
                '}';
    }
}
