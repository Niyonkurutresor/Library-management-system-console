import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class usersAuth {
    private Map<String, String> users;
    private String currentUser;

    public usersAuth() {
        users = new HashMap<>();
        currentUser = null;
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

    public void performAction() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Perform Action");
            System.out.println("2. Log out");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Performing action for user: " + currentUser);
                    // Perform the desired action for the logged-in user
                    break;
                case 2:
                    currentUser = null;
                    System.out.println("Logged out successfully.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        usersAuth userAuth = new usersAuth();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Sign up");
            System.out.println("2. Log in");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    userAuth.signUp();
                    break;
                case 2:
                    userAuth.logIn();
                    if (userAuth.currentUser != null) {
                        userAuth.performAction();
                    }
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
