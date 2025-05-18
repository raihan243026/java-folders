public class Main {
    // Inner class for IDCard
    static class IDCard {
        String name;
        String id;
        String department;
        String institution;
        public IDCard(String name, String id, String department, String institution) {
            this.name = name;
            this.id = id;
            this.department = department;
            this.institution = institution;
        }
        public void showID() {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Department: " + department);
            System.out.println("Institution: " + institution);
        }
    }
    public static void main(String[] args) {
        IDCard studentID = new IDCard("Raihan Chowdhury", "E243026", "Computer Communication Engineering", "International Islamic University Chittagong (IIUC)");
        studentID.showID();
    }
}