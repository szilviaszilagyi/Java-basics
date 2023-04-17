package Task3_Dounut;

public class Dounut {
    private String form;
    private String size;
    private String flavor;
    private String ingredients;
    private String decoration;


    public Dounut(String form, String size, String flavor, String ingredients, String decoration) {
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

    public String ingredients() {
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

    @Override
    public String toString() {
        return "Task3_Dounut{" +
                "form='" + form + '\'' +
                ", size='" + size + '\'' +
                ", flavoring='" + flavor + '\'' +
                ", rawMaterial='" + ingredients + '\'' +
                ", decoration='" + decoration + '\'' +
                '}';
    }
}
