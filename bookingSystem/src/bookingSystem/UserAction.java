package bookingSystem;

import java.util.Scanner;

public class UserAction {

	public void displayMenu() {
        System.out.println("\nWelcome on Visitors Booking");
        System.out.println("1. Book Visit");
        System.out.println("2. Edit Visit");
        System.out.println("3. Log out");
    }

    public void bookVisit(String username) {
    	
        // Add your implementation for booking a visit
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Available Visit in this week;");
        System.out.println("\t1.Lake Kivu");
        System.out.println("\t\tDate:5/6/2023");
        System.out.println("\t2.Volcanoes National Park");
        System.out.println("\t\tDate:5/6/2023");
        System.out.println("\t3.Lake Muhazi");
        System.out.println("\t\tDate:5/6/2023");
        System.out.println("\t4.Water Spring");
        System.out.println("\t\tDate:5/6/2023");
        
        Visits visit = new Visits();
        System.out.print("\nSelect Tour: ");
        String choice = scan.nextLine();
        
        	visit.tour(choice);
        System.out.println("\tThank you " + username + " you book visit successfuly");
        System.exit(0);
    }

    public void deleteVisit(String username) {
        System.out.println("Deleting a visit for user: " + username);
        // Add your implementation for deleting a visit
    }

    public void editVisit(String username) {
        System.out.println("Editing a visit for user: " + username);
        // Add your implementation for editing a visit
    }
}
