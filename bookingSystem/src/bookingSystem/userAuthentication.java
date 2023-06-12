package bookingSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class userAuthentication {
	public Map<String, String> users;
    public String currentUser;

    public userAuthentication() {
        users = new HashMap<>();
        currentUser = null;
    }

   
    public void logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            currentUser = username;
            System.out.println("Login successful. Welcome, " + currentUser + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    public void signUp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already exists. Please try again.");
        } else {
            users.put(username, password);
            System.out.println("Sign up successful. You can now log in.");
        }
    }

    public void performAction() {
        UserAction userAction = new UserAction();
        userAction.displayMenu();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userAction.bookVisit(currentUser);
                    break;
                case 2:
                    userAction.editVisit(currentUser);
                    break;
                case 3:
                    currentUser = null;
                    System.out.println("Logged out successfully.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            userAction.displayMenu();
        }
    }

}
