package _01_06;

public class Employee {
  String name;
  String locations;
  double salary;
  int age;

  public Employee(String name, String locations, double salary, int age) {
    this.name = name;
    this.locations = locations;
    this.salary = salary;
    this.age = age;
  }

  void raiseSalary() {
    this.salary = this.salary * 1.2;
  }
}
