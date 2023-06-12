package bookManagmentSystem;
import java.util.Scanner;
public class BookStoreManagementSystem {

	public static void main(String[] args) {
		BookStore bookStore = new BookStore();

        // Adding sample books to the store
        bookStore.addBook(new Book("Java Programming", "John Doe", 29.99, 10));
        bookStore.addBook(new Book("Python Basics", "Jane Smith", 19.99, 5));
        bookStore.addBook(new Book("Web Development", "Adam Johnson", 39.99, 3));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("========= Book Store Management System =========");
            System.out.println("1. Sell a Book");
            System.out.println("2. Display Available Books");
            System.out.println("0. Exit");
            System.out.println("==============================================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the quantity: ");
                    int quantity = scanner.nextInt();
                    bookStore.sellBook(title, quantity);
                    break;
                case 2:
                    bookStore.displayBooks();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();

	}

}
