package creational.factory.methodFactory.concreteCreator;

public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("Inside Circle::draw() method.");
  }
}
