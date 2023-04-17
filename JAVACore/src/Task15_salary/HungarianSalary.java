package Task15_salary;

public class HungarianSalary extends Salary {
    private int hungarianTaxes;
    private double totalSalary;

    public HungarianSalary(int hungarianTaxes, int dailySalary, int workedDay) {
        this.hungarianTaxes = hungarianTaxes;
        salaryCalculation(dailySalary, workedDay);


    }

    @Override
    void salaryCalculation(int dailySalary, int workedDay) {
        double taxesdouble = (hungarianTaxes+100)/100;
        totalSalary = dailySalary * workedDay * taxesdouble;


    }

    @Override
    public String toString() {
        return "HungarianSalary{" +
                "hungarianTaxes=" + hungarianTaxes +
                ", totalSalary=" + totalSalary +
                '}';
    }
}
