package creational.builder;

public class MotorcycleBuilder implements BuilderInterface{
  private Product product = new Product();

  @Override
  public void buildBody() {
    product.add("add motorcycle body");
  }

  @Override
  public void insertWheels() {
    product.add("add 2 wheels");
  }

  @Override
  public void addHeadlights() {
    product.add("add 1 headlight");
  }

  @Override
  public Product getVehicle() {
    return product;
  }
}
