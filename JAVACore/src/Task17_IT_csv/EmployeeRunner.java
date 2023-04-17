package Task17_IT_csv;

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeReader employeeReader = new EmployeeReader();
        employeeReader.readCsvFile();
        System.out.println(employeeReader.getEmployees());
    }
}
