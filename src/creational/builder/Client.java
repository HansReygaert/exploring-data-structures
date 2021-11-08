package creational.builder;

public class Client {

  public static void main(String[] args) {
    System.out.println("Builder Pattern Demo");
    Director director = new Director();
    BuilderInterface carBuilder = new CarBuilder();
    BuilderInterface motorcycleBuilder = new MotorcycleBuilder();

    director.construct(carBuilder);
    Product car = carBuilder.getVehicle();
    car.show();

    director.construct(motorcycleBuilder);
    Product motorcycle = motorcycleBuilder.getVehicle();
    motorcycle.show();
  }

}
