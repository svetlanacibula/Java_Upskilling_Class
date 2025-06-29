package Challenge_17;

public interface Mappable {

  String JSON_PROPERTY = "\"properties\" :  { %s }";

  String getLabel();

  Geometry getGeometryType();

  String getIconType();

  default String toJSON() {
    String properties = "\"type\": \"" + getGeometryType() + "\",\n\"label\": \"" + getLabel() + "\",\n\"marker\": \"" + getIconType() + "\"\n";

    return String.format(JSON_PROPERTY, properties);
  }

  default void printProperties() {
    System.out.println("Standard Mappable Properties:");
    System.out.println("Type: " + getGeometryType());
    System.out.println("Label: " + getLabel());
    System.out.println("Marker: " + getIconType());

    System.out.println("\nAdditional Fields from " + getClass().getSimpleName() + ":");
  }
}
