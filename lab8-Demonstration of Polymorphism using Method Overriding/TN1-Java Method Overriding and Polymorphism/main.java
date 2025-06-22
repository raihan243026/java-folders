class Animal {
    public void sound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        genericAnimal.sound();
        dog.sound();
        cat.sound();
    }
}
