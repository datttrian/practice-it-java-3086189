package exceptions;

import java.util.Scanner;

public class ThrowingExceptions {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter hours worked: ");
      double hoursWorked = scanner.nextDouble();

      System.out.print("Enter pay rate: ");
      double payRate = scanner.nextDouble();

      double totalPay = calculatePay(hoursWorked, payRate);
      System.out.println("Total Pay: $" + totalPay);
    } catch (NegativeInputException e) {
      System.out.println("Error: Negative input found.");
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (java.util.InputMismatchException e) {
      System.out.println("Error: Invalid input format. Please enter valid numbers.");
    } finally {
      scanner.close();
    }
  }

  public static double calculatePay(double hours, double payRate) throws NegativeInputException {
    if (hours > 40) {
      throw new IllegalArgumentException("Hours must be less than or equal to  40");
    }
    if (hours < 0 || payRate < 0) {
      throw new NegativeInputException();
    }
    return hours * payRate;
  }
}
