package Task8_Dounut2;

public class ChocolateDonut extends ClassicDoughnut{
    private int calorie;

    public ChocolateDonut(String form, String size, String flavor, String ingredients, String decoration, int calorie) {
        super(form, size, flavor, ingredients, decoration);
        this.calorie = calorie;
    }

    public void csokitoltelekkeszites (){
        System.out.println("nyami");
    }

    @Override
    public String toString() {
        return "ChocolateDonut{" +
                "calorie=" + calorie +
                "form='" + getForm() + '\'' +
                ", size='" + getSize() + '\'' +
                ", flavor='" + getFlavor() + '\'' +
                ", ingredients='" + getIngredients() + '\'' +
                ", decoration='" + getDecoration() + '\'' +
                '}';
    }
}
