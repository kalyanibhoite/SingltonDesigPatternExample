# Singlton Design Pattern Example
Implementations of the singleton pattern ensure that only one instance of the singleton class ever exists and typically provide global access to that instance.
Typically, this is accomplished by: Declaring all constructors of the class to be private, which prevents it from being instantiated by other objects
Providing a static method that returns a reference to the instance
The instance is usually stored as a private static variable; the instance is created when the variable is initialized, at some point before when the static method is first called.
Thanks
