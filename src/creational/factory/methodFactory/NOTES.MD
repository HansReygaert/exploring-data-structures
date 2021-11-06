#The factory method

> factories handle the details of object creation

**Commonality**: very, especially in frameworks 

**Goal**: defines an interface for creating an object (Creator)

**Common method names**: getInstance(); 

**When to use**: 
when a class needs to instantiate a subclass of another class, but doesn't know which subclass to instantiate

 - If a class cannot anticipate the class of objects it needs to create 
 - If a class wants its subclasses to specify the objects it creates 
 
Useful when implementing parallel class hierarchies where the responsibilities can shift between classes

**How**: It lets the subclass decide which class to instantiate

**Advantages**: 
- Decouples the logic of creation of a class from the actual logic of the class
- More robust code, easier to extend 
- Promotes the use of an interface over concrete implementations
- Provides abstraction between implementation and client classes using polymorphism
- Reduces maintenance, since the creation of code is in one spot

**Disadvantages**
- Clients might need to subclass the creator class just to create a particular object
- The extra abstraction layer might hide other abstractions and in turn make code hard to read
- When incorrectly used, is an anti-pattern 
  - Do not use it to wire up an entire application for example
- Can be overused to create too many objects, which impacts performance (don't worry about this one)

**Features**: 

- Create objects without exposing the creation logic to the client (creator) and refers to the newly 
created object using  a common interface 

- Encapsulates the instantiation logic of concrete type


###Real world examples

You have two guitars, an electric one and an acoustic one. 
One breaks down and you call the store. 

The store first asks which type of guitar that is broken. 
Based on your input, they will bring the necessary tools to fix it. 

You tell the store the type and that you want it fixed -> The responsibility lays with the store to do so 
It's the store's job to actually fix it based on your requirements. 

