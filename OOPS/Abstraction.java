
package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Cat cc = new Cat(); // First parent class constructor will be called after that Derived class
                            // Constructor will be called.
        // cc.eat();
        // cc.walks();
        cc.talks();

    }

}

abstract class Animal {
    Animal() {
        System.out.println("I am Animal constructor ");
    }

    void eat() {
        System.out.println("eats");
    }

    abstract void walks();
}

class Dog extends Animal {
    Dog() {
        System.out.println("I am Dog Constructor");
    }

    public void walks() {
        System.out.println("Dogs walks");
    }

}

class Cat extends Dog {
    Cat() {
        System.out.println("I am cat constructor");
    }

    // public void walks(){
    // System.out.println("Cats walks");
    // }
    public void talks() {
        System.out.println("Cat meoww");
    }

}