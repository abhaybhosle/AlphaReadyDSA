package OOPS;

class Calculator {
    int sum(int a, int b) { // same function name {sum} but having different parameters
        return a + b;
    }

    float sum(float a, float b) { // same function name {sum} but having different parameters
        return a + b;
    }

    int sum(int a, int b, int c) { // same function name {sum} but having different parameters
        return a + b + c;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum(1, 2, 3));
        System.out.println(calc.sum((float) 1.0, (float) 2.6));

    }

}
