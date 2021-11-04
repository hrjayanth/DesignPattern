# Visitor Pattern

* Visitor pattern is to define a new operation without introducing the modifications to an existing object structure.

![VisitorPattern](https://user-images.githubusercontent.com/73529297/140265780-64078764-f164-4be1-ada1-34592ad553ef.jpg)

## Drawbacks

* As each design pattern, even the Visitor has its downsides, particularly, its usage makes it more difficult to maintain the code if we need to add new elements to the object's structure.
* For example, if we add new YamlElement, then we need to update all existing visitors with the new method desired for processing this element. Following this further, if we have ten or more concrete visitors, that might be cumbersome to update all of them.
* Other than this, when using this pattern, the business logic related to one particular object gets spread over all visitor implementations.