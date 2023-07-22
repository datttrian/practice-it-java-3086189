package people;

/**
 * Employee
 */
public class Employee extends Person {
  private String employeeId;
  private String title;

  public Employee() {
    super("John Doe");
    System.out.println("In Employee default constructor");
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

}
