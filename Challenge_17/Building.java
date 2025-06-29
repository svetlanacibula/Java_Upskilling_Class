package Challenge_17;

public class Building implements Mappable {

  public Building(String name) {
  }

  @Override
  public String getLabel() {
    return "Opera";
  }

  @Override
  public Geometry getGeometryType() {
    return Geometry.POINT;
  }

  @Override
  public String getIconType() {
    return "Blue house";
  }
}
