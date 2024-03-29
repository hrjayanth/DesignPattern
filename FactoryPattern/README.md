# Factory Design Pattern

* The *Factory Pattern* is a Creational design pattern and is part of the GoF‘s formal list of design patterns.
* This pattern defines an interface for creating an object, but let subclasses decide which class to instantiate.
* This pattern delegates the responsibility of initializing a class from the client to a particular factory class by creating a type of virtual constructor.

## Class Diagram

![FactoryPattern](https://user-images.githubusercontent.com/73529297/141454940-cbf9a7a8-2c5d-4b72-b705-56739edc09c7.jpg)

## When to Use Factory Pattern

* When the implementation of an interface or an abstract class is expected to change frequently
* When the current implementation cannot comfortably accommodate new change
* When the initialization process is relatively simple, and the constructor only requires a handful of parameters