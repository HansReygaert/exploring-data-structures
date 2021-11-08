package creational.builder;

public class Director {
  BuilderInterface productBuilder;

  public void construct(BuilderInterface builder) {
    productBuilder = builder;
    productBuilder.buildBody();
    productBuilder.insertWheels();
    productBuilder.addHeadlights();
  }

}
