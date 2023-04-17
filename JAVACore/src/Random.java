public class Random {
    private String akarmi;
    private String barmi;
    private String anythig;
    private String something;
    private int num;

    public Random(String akarmi, String barmi, String anythig, String something, int num) {
        this.akarmi = akarmi;
        this.barmi = barmi;
        this.anythig = anythig;
        this.something = something;
        this.num = num;
    }

    public String getAkarmi() {
        return akarmi;
    }

    public void setAkarmi(String akarmi) {
        this.akarmi = akarmi;
    }

    public String getBarmi() {
        return barmi;
    }

    public void setBarmi(String barmi) {
        this.barmi = barmi;
    }

    public String getAnythig() {
        return anythig;
    }

    public void setAnythig(String anythig) {
        this.anythig = anythig;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Random{" +
                "akarmi='" + akarmi + '\'' +
                ", barmi='" + barmi + '\'' +
                ", anythig='" + anythig + '\'' +
                ", something='" + something + '\'' +
                ", num=" + num +
                '}';
    }
}
