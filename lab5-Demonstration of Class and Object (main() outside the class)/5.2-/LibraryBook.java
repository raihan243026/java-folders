public class LibraryBook { 
    String title; 
    String author; 
    int bookID; 
 
    // Constructor using 'this' keyword 
    LibraryBook(String title, String author, int bookID) { 
        this.title = title; 
        this.author = author; 
        this.bookID = bookID; 
    } 
 
    // Method to display book information 
    void displayBookInfo() { 
        System.out.println("Book ID : " + bookID); 
        System.out.println("Title   : " + title); 
        System.out.println("Author  : " + author); 
        System.out.println("---------------------------"); 
    } 
 
    // Main method to run the program 
    public static void main(String[] args) { 
        // Create book objects 
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 
101); 
        LibraryBook book2 = new LibraryBook("A Tale of Two Cities", "Charles 
Dickens", 102); 
 
        // Display book information 
        book1.displayBookInfo(); 
        book2.displayBookInfo(); 
    } 
} 