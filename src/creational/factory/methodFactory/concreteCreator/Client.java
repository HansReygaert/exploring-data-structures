package creational.factory.methodFactory.concreteCreator;

public class Client {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape circle = shapeFactory.getShape("Circle");
    Shape rectangle = shapeFactory.getShape("Rectangle");
    Shape square = shapeFactory.getShape("Square");

    circle.draw();
    rectangle.draw();
    square.draw();
  }
}
