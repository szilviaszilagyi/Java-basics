package Task14_Employee;

public abstract class Abstract_Employee {
    protected String name;
    /**
     * ezek a package-en belül láthatóak
     */
    protected String position;

    /**
     * ezek a package-en belül láthatóak
     */

    public Abstract_Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    abstract void comutePay();

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

}
