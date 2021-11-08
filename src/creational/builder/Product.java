package creational.builder;

import java.util.LinkedList;
import java.util.List;

public class Product {
  private final List<String> parts;

  public Product(){
    parts = new LinkedList<>();
  }

  public void add(String part){
    parts.add(part);
  }

  public void show(){
    System.out.println("\n Product completed as below");
    parts.forEach(System.out::println);
  }

}
