# java-code
Java is a high-level, object-oriented programming language used to build applications for web, mobile, desktop, and enterprise systems. It was created by Sun Microsystems in 1995 and is now owned by Oracle Corporation.

for example: 

// File: HelloWorld.java

// Class definition
public class HelloWorld {

    // Main method - program entry point
    public static void main(String[] args) {

        // Creating an object of the Person class
        Person person = new Person("Sarah", 25);

        // Calling a method
        person.greet();
    }
}

// Another class (Object-Oriented Example)
class Person {

    // Instance variables (attributes)
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void greet() {
        System.out.println("Hello, my name is " + name + 
                           " and I am " + age + " years old.");
    }
}
