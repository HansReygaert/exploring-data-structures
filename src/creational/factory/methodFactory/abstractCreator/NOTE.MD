# Factory Method - The Absctract Creator

> A very strict implementation of the pattern

- The Creator is an abstract class
- You create a subclass of the creator class for each product type 
which contains the implementation of the factory method
- To use the factory method (create objects), you simply specify the instance of the type 
and invoke the factory method

**Disadvantages**: Every new product needs to be an instance of the creator class 
and implement the factory method

**Features**: 
The creator is the interface that defines the Factory Method
- The creator class is written without knowledge of the actual products that will be created
- Any methods implemented by the creator are written to 
operate on products produced by the factory method
