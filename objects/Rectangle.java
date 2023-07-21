package objects;

public class Rectangle {
  private double length;
  private double width;

  public Rectangle() {
    length = 0;
    width = 0;
  }

  public Rectangle(double length, double width) {
    setLength(length);
    setWidth(width);
  }

  public double calculatePerimeter() {
    return (length + width) * 2;
  }

  public double calculateArea() {
    return length * width;
  }

  public double getLength() {
    return this.length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return this.width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

}
