package Eloadasanyag.abstractClass;

public class Yorkie extends AbstractDog{
    protected Yorkie(String gender, String birthDay, double weight) {
        super(gender, birthDay, weight);
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String doSomethingBad() {
        return null;
    }
}
