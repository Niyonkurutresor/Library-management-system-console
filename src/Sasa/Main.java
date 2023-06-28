package Sasa;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// student(name,age,gender,marks,level)
		// if marks > 50, increase the level of student, add student in array of promoted student
		//else if  marks < 50 add student in array of repeat student
		
		App ap = new App();
		
		ap.addLevels(1, "Level 1");
		ap.addLevels(2, "Level 2");
		ap.addLevels(3, "Level 3");
		ap.addLevels(4, "Level 4");
		
		ap.createStudent("Niyonkuru", 30, "Male", 3, 50);
		ap.createStudent("Kavuyo", 20, "female", 2, 0);
		ap.createStudent("Bosco", 20, "Male", 3, 40);
		
		ap.displayAllLevels();
		ap.displayAllStudents();
		
		
		
		
		
		
	}

}
