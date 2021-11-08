package creational.builder;

public class CarBuilder implements BuilderInterface{
  private Product product = new Product();


  @Override
  public void buildBody() {
    product.add("add car body");
  }

  @Override
  public void insertWheels() {
    product.add("add 4 wheels of a car");
  }

  @Override
  public void addHeadlights() {
    product.add("add 2 headlights");
  }

  @Override
  public Product getVehicle() {
    return product;
  }
}
