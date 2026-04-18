# Singleton Pattern

* The *Singleton Pattern* is a Creational design pattern and is part of the GoF‘s formal list of design patterns.
* This pattern aims to keep a check on initialization of objects of a particular class by ensuring that only one instance of the object exists throughout the Java Virtual Machine.
* A Singleton class also provides one unique global access point to the object so that each subsequent call to the access point returns only that particular object.

## When to Use Singleton Design Pattern

* For resources that are expensive to create (like database connection objects)
* It's good practice keeping all loggers as Singletons which increases performance
* Classes which provide access to configuration settings for the application
* Classes that contain resources that are accessed in shared mode
