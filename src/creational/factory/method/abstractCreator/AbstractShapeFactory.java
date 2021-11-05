package creational.factory.method.abstractCreator;

public abstract class AbstractShapeFactory {
  protected abstract Shape factoryMethod();

  public Shape getShape(){
    return factoryMethod();
  }
  //other helpers
}
