package creational.factory.method.abstractCreator;

public class SquareFactory extends AbstractShapeFactory {

  @Override
  protected Shape factoryMethod() {
    return new Square();
  }
}
