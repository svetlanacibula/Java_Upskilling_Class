package Challenge_07.Carpet;

public class Carpet {
  private double width;
  private double length;
  private static double squareMeterCost = 8;

  public Carpet(double width, double length) {
    this.width = (width < 0) ? 0 : width;
    this.length = (length < 0) ? 0 : length;
  }

  public double getWidth() {
    return width;
  }

  public double getLength() {
    return length;
  }

  public void setWidth(double width) {
    this.width = (width < 0) ? 0 : width;
  }

  public void setLength(double length) {
    this.length = (length < 0) ? 0 : length;
  }

  public double getArea(){
     return width * length;
  }
  public double getTotalCost(){
    return getArea() * squareMeterCost;
  }
}



