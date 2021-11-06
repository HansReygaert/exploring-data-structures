package creational.factory.methodFactory.staticMethod;

public class ShapeFactory {

  public static  Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    }
    if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    }
    if (shapeType.equalsIgnoreCase("SQUARE")) {
      return new Square();
    }
    return null;
  }
}
