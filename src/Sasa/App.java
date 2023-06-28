package Sasa;

import java.util.*;

public class App{
	Promotec pro = new Promotec();
	
	List<Level> levels = new ArrayList<Level>();
	List<Student> students =new ArrayList<Student>();
	Map <Integer,String> mp = new HashMap<Integer, String>();

	
	public void addLevels(int id, String name) {
		Level lv = new Level(id,name);
		levels.add(lv);
		
	}

	public void createStudent(String name, int age, String gender, int level, int marks) {
		Student st = new Student(name,age,gender, level, marks);
		students.add(st);
	}
	
	public Map<Integer,String> displayAllLevels() {
		String k = null;
		for(Level level: levels) {
			 mp.put(level.getId(),level.getName());
		}
		return mp;
	}
	

	public void displayAllStudents() {
		for(Student student: students) {
			System.out.println("Student Name: "+student.getName());
			System.out.println("Student age: "+student.getAge());
			System.out.println("Student gender: "+student.getGender());
			System.out.println("Student marsks: "+student.getMarks());
			System.out.print("desision:  ");
			boolean promoted = pro.promote(student.getMarks());
			if(promoted == true) {
				System.out.println("promot");
				student.setLevel(student.getLevel()+1);
				System.out.println("Level initiated:" + mp.get(student.getLevel()));
			}else {
				System.out.println("repat");
				System.out.println("Level initiated:" + mp.get(student.getLevel()));
			}
			
			System.out.println("------------------");
		}
	}
	
	
}
