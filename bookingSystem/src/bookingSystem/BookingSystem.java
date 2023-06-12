package bookingSystem;

import java.util.Scanner;

public class BookingSystem {

	 public static void main(String[] args) {
	        userAuthentication userAuth = new userAuthentication();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n1. Sign up");
	            System.out.println("2. Log in");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	           
	            int choice = scanner.nextInt();
	            
	            

	            if(choice == 1) {
	            	userAuth.signUp();
	            }
	            else if(choice == 2) {
	            	userAuth.logIn();
	            	if(userAuth.currentUser != null) {
	            		userAuth.performAction();
	            	}
	            }
	            else if(choice == 3) {
	            	System.exit(0);
	            }
	        }
	    
	}

}

