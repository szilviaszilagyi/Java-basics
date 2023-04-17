package Task8_Dounut2;

public class ClassicDoughnut {
    private String form;
    private String size;
    private String flavor;
    private String ingredients;
    private String decoration;


    public ClassicDoughnut(String form, String size, String flavor, String ingredients, String decoration) {
        this.form = form;
        this.size = size;
        this.flavor = flavor;
        this.ingredients = ingredients;
        this.decoration = decoration;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public void runsOut(){
        System.out.println("I eat all doughnut.");
    }

    public void taste(){
        System.out.println("This doughnut is very delicious.");
    }
    public void megkel(){
        System.out.println("A fánk 1 óra alatt kel meg.");
    }
    public void táplál(){
        System.out.println("djfhfrr");
    }
    public void hizlal(){
        System.out.println("Minél többet eszek, annál nagyobb leszek.");
    }

    @Override
    public String toString() {
        return "ClassicDoughnut{" +
                "form='" + form + '\'' +
                ", size='" + size + '\'' +
                ", flavor='" + flavor + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", decoration='" + decoration + '\'' +
                '}';
    }
}
