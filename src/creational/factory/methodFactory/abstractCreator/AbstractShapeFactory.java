package creational.factory.methodFactory.abstractCreator;

public abstract class AbstractShapeFactory {
  protected abstract Shape factoryMethod();

  public Shape getShape(){
    return factoryMethod();
  }
  //other helpers
}

class SquareFactory extends AbstractShapeFactory {
  @Override
  protected Shape factoryMethod() {
    return new Square();
  }
}

class CircleFactory extends AbstractShapeFactory {
  @Override
  protected Shape factoryMethod() {
    return new Circle();
  }
}

class RectangleFactory extends AbstractShapeFactory {
  @Override
  protected Shape factoryMethod() {
    return new Rectangle();
  }
}





