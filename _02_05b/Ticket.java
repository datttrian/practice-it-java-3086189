package _02_05b;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  public String getDestination() {
    return this.destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public boolean isIsReturn() {
    return this.isReturn;
  }

  public boolean getIsReturn() {
    return this.isReturn;
  }

  public void setIsReturn(boolean isReturn) {
    this.isReturn = isReturn;
  }
}
