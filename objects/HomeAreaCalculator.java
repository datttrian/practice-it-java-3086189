package objects;

import java.util.Scanner;

public class HomeAreaCalculator {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    Rectangle kitchen = getRoom();
    Rectangle bathroom = getRoom();

    double area = calculateTotalArea(kitchen, bathroom);
    System.out.println("The total area is: " + area);

    scanner.close();
  }

  public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
    return rectangle1.calculateArea() + rectangle2.calculateArea();
  }

  public static Rectangle getRoom() {
    double length = getValidInput("Enter the length of your room:");
    double width = getValidInput("Enter the width of your room:");

    return new Rectangle(length, width);
  }

  public static double getValidInput(String prompt) {
    System.out.println(prompt);
    String input = scanner.next();

    try {
      double value = Double.parseDouble(input);
      if (value <= 0) {
        System.out.println("Invalid input! Please enter a positive number.");
        return getValidInput(prompt); // Recursive call to get valid input
      } else {
        return value;
      }
    } catch (NumberFormatException e) {
      System.out.println("Invalid input! Please enter a valid number.");
      return getValidInput(prompt); // Recursive call to get valid input
    }
  }
}
