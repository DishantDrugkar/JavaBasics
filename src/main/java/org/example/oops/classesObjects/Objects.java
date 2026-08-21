package org.example.oops.classesObjects;

public class Objects {
    public static void main(String[] args) {
        System.out.println("Main method is running");

        Dog dog = new Dog();
        dog.dog();
    }
}
class Dog{

    public void dog(){
        System.out.println("Dog barks");
    }
}