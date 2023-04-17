package Task17_IT_csv;
/**
 * Adott egy csv fájl, ami munkavállalókat tartalmaz egy IT cégnél. A munkavállalónak van pozíciója, neve, fizetése és egy “egyéb mező” amibe egyéb
 * információkat lehet tárolni a munkavállalóról.
 * Position, Name, Salary, Custom Field
 * Tester, Teszt Elek, 1000000, -
 * Developer, Mekk Elek, 1150000, contractor
 * HrAssistant, Eszet Lenke, 550000, -
 * FinanceAssistant, Mezei Virág, 620000, -
 * ExecutiveDirector, Dísz Nóra, 1200000, -
 * Developer, Vincs Eszter, 1300000, -
 * Tester, Gipsz Jakab, 1210000, contractor
 * <p>
 * Készítsetek egy programot, ami képes a megadott fájl tartalmát egy List<Employee> listába felolvasni. Az Employee legyen egy abstract osztály,
 * melynek leszármazottai a Tester, Developer, HrAssistant, FinanceAssistant és ExecutiveDirector osztályok. A programban bizonyosodjunk meg róla, hogy
 * a fájlokban szereplő employee-k mind a fentebbi öt kategória valamelyikébe tartoznak ellenkező esetben dobjunk hibát.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader {
    List<Employee> employees = new ArrayList<>();

    void readCsvFile() {
        try {
            List<String> fileContent = Files.readAllLines(Path.of("src/resources/employee.csv"));
            for (String row : fileContent) {
                String[] rowData = row.split(", ");
                String position = rowData[0];
                String name = rowData[1];
                String salary = rowData[2];
                String customField = rowData[3];

                switch (position) {
                    case "Tester" -> employees.add(new Tester(position, name, salary, customField));
                    case "Developer" -> employees.add(new Developer(position, name, salary, customField));
                    case "HrAssistant" -> employees.add(new HrAssistant(position, name, salary, customField));
                    case "FinanceAssistant" -> employees.add(new FinanceAssistant(position, name, salary, customField));
                    case "ExecutiveDirector" ->
                            employees.add(new ExecutiveDirector(position, name, salary, customField));
                    default -> System.out.println("Wrong data: " + row);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
