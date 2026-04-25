# Gang of Four Design Patterns

The **Gang of Four (GoF)** refers to the four authors — Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides — who published the seminal book *"Design Patterns: Elements of Reusable Object-Oriented Software"* (1994). The book defines **23 classic design patterns** grouped into three categories based on their purpose.

---

## 1. 🏗️ Creational Design Patterns

Creational patterns are concerned with **how objects are created**. They abstract the instantiation process, making a system independent of how its objects are created, composed, and represented. Instead of instantiating objects directly using constructors, creational patterns provide mechanisms that give greater flexibility in deciding which objects need to be created for a given use case.

| Pattern | Intent |
|---|---|
| **[Abstract Factory](./CreationalDesignPattern/AbstractFactoryPattern/README.md)** | Provides an interface for creating families of related or dependent objects without specifying their concrete classes. |
| **[Builder](./CreationalDesignPattern/BuilderPattern/README.md)** | Separates the construction of a complex object from its representation, allowing the same construction process to create different representations. |
| **[Factory Method](./CreationalDesignPattern/FactoryPattern/README.md)** | Defines an interface for creating an object, but lets subclasses decide which class to instantiate. |
| **[Prototype](./CreationalDesignPattern/PrototypePattern/README.md)** | Specifies the kinds of objects to create using a prototypical instance, and creates new objects by copying (cloning) this prototype. |
| **[Singleton](./CreationalDesignPattern/SingletonPattern/README.md)** | Ensures a class has only one instance and provides a global point of access to it. |

---

## 2. 🧱 Structural Design Patterns

Structural patterns are concerned with **how classes and objects are composed** to form larger structures. They use inheritance and composition to assemble objects and classes into more complex structures, while keeping those structures flexible and efficient.

| Pattern | Intent |
|---|---|
| **[Adapter](./StructuralDesignPattern/AdapterPattern/README.md)** | Converts the interface of a class into another interface that clients expect, allowing incompatible interfaces to work together. |
| **[Bridge](./StructuralDesignPattern/BridgePattern/README.md)** | Decouples an abstraction from its implementation so that the two can vary independently. |
| **[Composite](./StructuralDesignPattern/CompositePattern/README.md)** | Composes objects into tree structures to represent part-whole hierarchies, letting clients treat individual objects and compositions uniformly. |
| **[Decorator](./StructuralDesignPattern/DecoratorPattern/README.md)** | Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality. |
| **[Facade](./StructuralDesignPattern/FacadePattern/README.md)** | Provides a unified, simplified interface to a set of interfaces in a subsystem, making it easier to use. |
| **Flyweight** *(coming soon)* | Uses sharing to efficiently support a large number of fine-grained objects, reducing memory cost of complex object models. |
| **[Proxy](./StructuralDesignPattern/ProxyPattern/README.md)** | Provides a surrogate or placeholder for another object to control access, reduce cost, or add additional behaviour. |

---

## 3. 🔄 Behavioural Design Patterns

Behavioural patterns are concerned with **how objects interact and communicate** with each other. They characterize complex control flow that is difficult to follow at run-time, shifting focus away from control flow and towards the way objects are interconnected and delegate responsibility.

| Pattern | Intent |
|---|---|
| **[Chain of Responsibility](./BehaviourDesignPattern/ChainOfResponsibility/README.md)** | Avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request, passing it along a chain. |
| **[Command](./BehaviourDesignPattern/CommandPattern/README.md)** | Encapsulates a request as an object, allowing parameterization of clients with different requests, queuing, and support for undoable operations. |
| **Interpreter** *(coming soon)* | Given a language, defines a representation for its grammar along with an interpreter that uses the representation to interpret sentences. |
| **[Iterator](./BehaviourDesignPattern/IteratorPattern/README.md)** | Provides a way to sequentially access the elements of an aggregate object without exposing its underlying representation. |
| **Mediator** *(coming soon)* | Defines an object that encapsulates how a set of objects interact, promoting loose coupling by keeping objects from referring to each other explicitly. |
| **Memento** *(coming soon)* | Without violating encapsulation, captures and externalises an object's internal state so that the object can be restored to this state later. |
| **[Observer](./BehaviourDesignPattern/ObserverPattern/README.md)** | Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. |
| **[State](./BehaviourDesignPattern/StatePattern/README.md)** | Allows an object to alter its behaviour when its internal state changes, appearing as if the object has changed its class. |
| **[Strategy](./BehaviourDesignPattern/StrategyPattern/README.md)** | Defines a family of algorithms, encapsulates each one, and makes them interchangeable, letting the algorithm vary independently from clients that use it. |
| **[Template Method](./BehaviourDesignPattern/TemplateMethodPattern/README.md)** | Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses without changing the algorithm's overall structure. |
| **[Visitor](./BehaviourDesignPattern/VisitorPattern/README.md)** | Represents an operation to be performed on the elements of an object structure, letting you define a new operation without changing the classes of the elements. |

---

## Reference

```
* Design Patterns: Elements of Reusable Object-Oriented Software
  by Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides
  Released October 1994
  Publisher(s): Addison-Wesley Professional

* Head First Design Patterns
  by Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra
  Released October 2004
  Publisher(s): O'Reilly Media, Inc.
```
