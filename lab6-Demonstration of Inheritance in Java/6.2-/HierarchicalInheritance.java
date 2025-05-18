// Superclass
class Person {
    void displayInfo() {
        System.out.println("I am a person.");
    }
}

// Subclass: Doctor
class Doctor extends Person {
    void treatPatients() {
        System.out.println("I treat patients and diagnose diseases.");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    void teachStudents() {
        System.out.println("I teach students and prepare lessons.");
    }
}

// Subclass: Engineer
class Engineer extends Person {
    void buildSystems() {
        System.out.println("I design and build software or systems.");
    }
}

// Main class to test the hierarchy
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        Teacher teach = new Teacher();
        Engineer eng = new Engineer();

        System.out.println("Doctor:");
        doc.displayInfo();
        doc.treatPatients();

        System.out.println("\nTeacher:");
        teach.displayInfo();
        teach.teachStudents();

        System.out.println("\nEngineer:");
        eng.displayInfo();
        eng.buildSystems();
    }
}
