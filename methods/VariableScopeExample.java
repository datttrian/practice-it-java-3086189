package methods;

public class VariableScopeExample {
  String myVariable = "abc";

  public void method1() {
    System.out.println("global: " + myVariable);
    String myVariable = "def";
    System.out.println("local: " + myVariable);
  }

  public void method2() {
    System.out.println("global: " + myVariable);
    myVariable = "ghi";
    System.out.println("global: " + myVariable);
  }
}
