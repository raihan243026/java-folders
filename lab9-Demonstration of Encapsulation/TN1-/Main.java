class Student { 
    private String name;
    private String id;
    private double cgpa;

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Student name cannot be empty or null. Value not set.");
        }
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        if (id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            System.out.println("Error: Student ID cannot be empty or null. Value not set.");
        }
    }

    public String getId() {
        return id;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Error: CGPA must be between 0.0 and 4.0. Value not set.");
        }
    }

    public double getCgpa() {
        return cgpa;
    }

    public void displayStudentDetails() {
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("CGPA: " + getCgpa());
        System.out.println("-----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Demonstrating Student Class with Encapsulation\n");

        Student student1 = new Student();

        System.out.println("Setting details for Student 1:");
        student1.setName("Raihan Chowdhury");
        student1.setId("E243026");
        student1.setCgpa(3.95);

        student1.displayStudentDetails();
        System.out.println("\n");

        Student student2 = new Student();

        System.out.println("Setting details for Student 2 (with some invalid attempts):");
        student2.setName("R");
        student2.setId("E243062");
        student2.setCgpa(4.2);
        student2.setCgpa(3.99);

        student2.displayStudentDetails();
        System.out.println("\n");

        System.out.println("Direct access using getters for Student 1:");
        System.out.println("Student 1's Name: " + student1.getName());
        System.out.println("Student 1's ID: " + student1.getId());
        System.out.println("Student 1's CGPA: " + student1.getCgpa());
    }
}
