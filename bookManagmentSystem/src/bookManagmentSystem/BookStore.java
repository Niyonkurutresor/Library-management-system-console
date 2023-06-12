package bookManagmentSystem;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	private List<Book> books;

    public BookStore() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void sellBook(String title, int quantity) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (book.getQuantity() >= quantity) {
                    book.setQuantity(book.getQuantity() - quantity);
                    System.out.println(quantity + " copies of \"" + book.getTitle() + "\" sold successfully.");
                } else {
                    System.out.println("Insufficient stock for \"" + book.getTitle() + "\".");
                }
                return;
            }
        }
        System.out.println("Book not found: \"" + title + "\".");
    }

    public void displayBooks() {
        System.out.println("\nAvailable Books:\n");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Price: $" + book.getPrice());
            System.out.println("Quantity: " + book.getQuantity());
            System.out.println("--------------------");
        }
    }
}
