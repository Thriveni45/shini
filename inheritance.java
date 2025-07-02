// Superclass
class A {
    int num;

    void getNum() {
        System.out.println("num = " + num);
    }
}

// Subclass
class B extends A {
    int num1;

    void getValue() {
        System.out.println("num1 = " + num1);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.num = 10;      // Accessing inherited member from class A
        b.num1 = 20;     // Accessing member from class B

        b.getNum();      // Call method from class A
        b.getValue();    // Call method from class B
    }
}
out put:
num = 10
num1 = 20