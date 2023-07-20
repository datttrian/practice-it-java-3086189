package _03_03;

public class Main {
  public static void main(String[] args) {
    // Creating an Analyst object
    Analyst analyst = new Analyst("John Doe", 50000, 30);
    System.out.println("Analyst: " + analyst.getName());
    System.out.println("Salary: $" + analyst.getSalary());
    System.out.println("Age: " + analyst.getAge());
    System.out.println("Annual Bonus: $" + analyst.getAnnualBonus());

    // Creating a SalesPerson object
    SalesPerson salesPerson = new SalesPerson("Jane Smith", 60000, 35, 0.2);
    System.out.println("\nSales Person: " + salesPerson.getName());
    System.out.println("Salary: $" + salesPerson.getSalary());
    System.out.println("Age: " + salesPerson.getAge());
    System.out.println("Commission Percentage: " + salesPerson.getCommissionPercentage());

    // Raise salary and commission
    analyst.raiseSalary();
    salesPerson.raiseCommission();

    System.out.println("\nAfter Raise:");
    System.out.println("Analyst Salary: $" + analyst.getSalary());
    System.out.println("Sales Person Commission Percentage: " + salesPerson.getCommissionPercentage());
  }
}
