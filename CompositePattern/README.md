# Composite Design Pattern

* The *Composite Pattern* is a Structural design pattern and is part of the GoF‘s formal list of design patterns.
* The composite pattern is meant to allow treating individual objects and compositions of objects, or "composites" in the same way.
* It can be viewed as a tree structure made up of types that inherit a base type, and it can represent a single part or a whole hierarchy of objects.
* The pattern can be broken down into:
  * **Component:** is the base interface for all the objects in the composition. It should be either an interface or an abstract class with the common methods to manage the child composites.
  * **Leaf:** implements the default behavior of the base component. It doesn't contain a reference to the other objects.
  * **Composite:** has leaf elements. It implements the base component methods and defines the child-related operations.
  * **Client:** has access to the composition elements by using the base component object.