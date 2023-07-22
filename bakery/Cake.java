package bakery;

public class Cake {

  private String flavor;
  private double price;

  public Cake() {
    this("vanilla");
  }

  public Cake(String flavor) {
    setFlavor(flavor);
    setPrice(9.99);
  }

  public String getFlavor() {
    return this.flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}
