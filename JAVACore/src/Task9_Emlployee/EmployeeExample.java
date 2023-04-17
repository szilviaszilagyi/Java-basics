package Task9_Emlployee;

/** Készítsetek tetszőleges tulajdonságokkal és metódusokkal az alábbi hierarchiát:*/

public class EmployeeExample {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 35);
        DirectReport employee = new DirectReport("Katy", 36);

        manager.getSalary(); /** ősosztályból jön */
        manager.overTime(); /** ősosztályból jön */
        manager.leadigThePeople();  /** saját metódus */
        System.out.println(manager);
        employee.getSalary();    /** ősosztályból jön */
        employee.overTime();     /** ősosztályból jön */
        employee.createExcelTable(); /** saját metódus */
        employee.setGoal("Create 5 excel sheet.");
        System.out.println(employee);
    }
}
