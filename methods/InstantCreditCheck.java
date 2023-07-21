package methods;

import java.util.Scanner;

public class InstantCreditCheck {
  public static void main(String[] args) {
    // Get inputs
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your salary:");
    double actualSalary = scanner.nextDouble();

    System.out.println("Enter your credit score:");
    int actualCreditScore = scanner.nextInt();
    scanner.close();

    // Check if the user is qualified
    boolean qualify = isUserQualified(actualCreditScore, actualSalary);

    notifyUser(qualify);
  }

  public static boolean isUserQualified(int creditScore, double salary) {
    double requiredSalary = 25000;
    int requiredCreditScore = 700;

    if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
      return true;
    } else {
      return false;
    }
  }

  public static void notifyUser(boolean isUserQualified) {
    if (isUserQualified) {
      System.out.println("Congrats");
    } else {
      System.out.println("Sorry");
    }
  }
}
