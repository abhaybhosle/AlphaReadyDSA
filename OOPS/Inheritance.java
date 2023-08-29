// SINGLE_LEVEL_INHERITANCE
// package OOPS;


// class Animal { // Base class
//     String color;
//     String name;
//     int age;

//     void eat() {
//         System.out.println("Eats");
//     }

//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// class Fish extends Animal { // Derived class or Sub class

//     // extends key word is used to get all properties & methods from Base class.
//     int fins;

//     void Swims() {
//         System.out.println("Fish swims in water ");
//     }

// }

// public class Inheritance {
//     public static void main(String[] args) {
//         Fish shark = new Fish();
//         shark.eat();
//         shark.breathe();
//         // shark.Swims();

//     }

// }

// // MULTI_LEVEL_INHERITANCE

// // package OOPS;

// // class Animal { // Base class
// //     String color;
// //     String name;
// //     int age;

// //     void eat() {
// //         System.out.println("Eats");
// //     }

// //     void breathe() {
// //         System.out.println("breathes");
// //     }
// // }

// // class Mammal extends Animal {
// //     int legs;
// // }

// // class Dog extends Mammal {
// //     String breed;
// // }

// // public class Inheritance {
// //     public static void main(String[] args) {
// //         Dog dobby = new Dog();
// //         dobby.eat();
// //         dobby.breathe();
// //         dobby.legs = 4;
// //         System.out.println(dobby.legs);
// //         // dobby.breed= "German";
// //         // System.out.println(dobby.breed);
// //     }
// // }


// HIERARCHIAL INHERITANCE
// package OOPS;

// class Animal { // Base class
//     String color;
//     String name;
//     int age;

//     void eat() {
//         System.out.println("Eats");
//     }

//     void breathe() {
//         System.out.println("breathes");
//     }
// }

// class Fish extends Animal {
//     void swim() {
//         System.out.println("Fishes swim in water");
//     }
// }

// class Bird extends Animal {
//     void fly() {
//         System.out.println("Birds fly in the air");
//     }

// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Bow Bow ");
//     }
// }

// public class Inheritance {
//     public static void main(String[] args) {
//         // you can create obj for any extends  class and get the properties and methods of Base class..
//         Bird bb = new Bird();
//         bb.eat();
//         bb.breathe();
//         bb.fly();

//         Dog dd = new Dog();
//         dd.color = "Black";
//         System.out.println(dd.color);
//         dd.breathe();
//         dd.bark();
//     }
// }



// // HYBRID INHERITANCE
// // package OOPS;

// // class Animal { // Base class
// //     String color;
// //     String name;
// //     int age;

// //     void eat() {
// //         System.out.println("Eats");
// //     }

// //     void breathe() {
// //         System.out.println("breathes");
// //     }
// // }

// // class Fish extends Animal {
// //     void swim() {
// //         System.out.println("Fishes swim in water");
// //     }
// // }
// // class shark extends Fish{  // derived class 1 from Fish
// //     void BodyWeight(){
// //         System.out.println("Shark weight is in tonnes ");
// //     }
// // }
// // class Pirana extends Fish{ //// derived class 2 from Fish
// //     void Teeth(){
// //         System.out.println("Pirana teeth are dangerous ");
// //     }
// // }

// // class Bird extends Animal {
// //     void fly() {
// //         System.out.println("Birds fly in the air");
// //     }

// // }
// // class Crow extends Bird{  //  derived class 1 from Bird
// //     void Crowcolor(){
// //         System.out.println("Crow is black in color");
// //     }
// // }
// // class Pigeon extends Bird{  //  derived class 2 from Bird
// //     void legss(){
// //         System.out.println("some birds have 8 legs");
// //     }
// // }
// // class Dog extends Animal {
// //     void bark() {
// //         System.out.println("Bow Bow ");
// //     }
// // }
// // class German extends Dog{  //  derived class 1 from Dog
// //     void cry(){
// //         System.out.println("dogs to dry ");
// //     }
// // }
// // class gollu extends Dog{ //  derived class 2 from Dog
// //     void eyes(){
// //         System.out.println("Dog have 2 eyes ");
// //     }
// // }
// // public class Inheritance{
// //     public static void main(String[] args) {
// //         gollu gg = new gollu();
// //         gg.eat();
// //         gg.bark();
// //         gg.eyes();
// //     }
// // }