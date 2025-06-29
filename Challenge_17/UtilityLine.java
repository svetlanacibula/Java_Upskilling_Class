package Challenge_17;

public class UtilityLine implements Mappable {

  public UtilityLine(String name) {
  }

  @Override
  public String getLabel() {
    return "Electricity";
  }

  @Override
  public Geometry getGeometryType() {
    return Geometry.LINE;
  }

  @Override
  public String getIconType() {
    return "Orange line";
  }
}
