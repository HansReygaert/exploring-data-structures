#Design Pattern - Creational - Builder

> Separates the construction of a complex object from its representation
 
## About

The builder design pattern allows you to construct the same object, but with different representational states. 
Each representational state can be added in a step-by-step process.
The builder itself is independent of the class.

An example would be a computer where each part can be assembled to form a whole system. 
e.g. plug in a 250 GB drive, or a 500 GB drive etc. 

The builder design pattern tries to address problems the factory pattern can not. 
The construction of an object with multiple parameters, especially parameters that are optional which are sent as null, 
always need to be included in the factory design pattern. This can create a lot of unnecessary complexity in the system. 
The builder addresses the construction of an object by assembling each part and then constructing it. 

### Advantages

It encapsulates the way a complex object is constructed.
  - separates the code of assembling from its representation 
  - hides the complex construction process and represents it as simple as possible

It allows objects to be constructed in a multistep and varying process ( as opposed to a one-step construction)
It hides the internal representation of the product from the client

The product implementations can be swapped in and out because the client only sees an abstract interface.
Focus on "how the product will be made"

### Disadvantages

- often used for building composite structures
- constructing objects requires more domain knowledge of the client than when using a factory


### When To Use

The algorithm for creating a complex object should be independent of the parts that make up the object
and how they are assembled

The construction process must allow different representations for the object that is constructed

>  DO NOT USE THIS IF THE OBJECT NEEDS TO BE IMMUTABLE

## Implementation

### Overview
    
The main participants are the builder and director. 

**(interface) Builder**: 
  - specifies an abstract interface for creating parts of a Product object
  - defines an operation for each component that a director may ask it to create
  - must be general enough to allow the construction of products for all kinds of concrete builders
  
**(concrete) Builder**: 
  - constructs and assembles parts of the product by implementing the builder interface
    - overrides operations for components it is interested in creating
  - defines and keeps track of the representation it creates
    - usually appends to some type of list
    - sometimes might need access to parts of the product constructed earlier
      - In this case the builder would return child nodes to the director, which then would pass them back to 
        the builder to build the parent nodes
    - provides an interface for retrieving the product ( usually called getProduct() )
  
**Director**:
- constructs an object using the builder interface

**Product**
- represents the complex object under construction  ( the end product)
- the concrete builder builds the products internal representation and defines the process by which it is assembled
- includes classes that define the constituent parts, including interfaces for assembling the parts into the final result


### Builder Flow

-> The client creates the director object
  -> configures it with the desired builder object
-> The director notifies the builder whenever a part of the product should be built
-> the builder handles requests from the director and adds parts to the product
-> the client retrieves the product from the builder