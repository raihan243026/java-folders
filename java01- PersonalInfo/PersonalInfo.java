
public class PersonalInfo {
    public static void main(String[] args) {

        String name = "Raihan";
        String studentId = "E243026";
        int age = 19;
        String email = "raihanchowdhury20004@gmail.com";
        String phone = "+8801036705193";
        String address = "Agrabad, Chattogram";

       
        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);


        System.out.printf("\nFormatted Information:\nName: %s\nStudent ID: %s\nAge: %d\nEmail: %s\nPhone: %s\nAddress: %s\n", name, studentId, age, email, phone, address);
    }
}
