package Task15_salary;

public abstract class Salary {
     protected int dailySalary;
     protected int workedDay;


     abstract void salaryCalculation(int dailySalary, int workedDay);

      public void thanx(){
           System.out.println("Thanks for using me and let me assist in your calculation.");
      }
}
