// Base class
class Grandfather {
    void company() {
        System.out.println("Grandfather owns a family business.");
    }
}

// Derived class
class Father extends Grandfather {
    void car() {
        System.out.println("Father owns a car.");
    }
}

// Further derived class
class Son extends Father {
    void mobile() {
        System.out.println("Son uses a smartphone.");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultilevelInheritance {
    public static void main(String[] args) {
        Son son = new Son();

        // Accessing all methods from the inheritance chain
        son.company(); // From Grandfather
        son.car();     // From Father
        son.mobile();  // From Son
    }
}
