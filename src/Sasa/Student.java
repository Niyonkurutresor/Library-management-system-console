package Sasa;

public class Student extends Person{
	private int number;
    private int levelId;
    private  int marks;
    public Student(String name, int age, String gender, int levelId, int marks) {
        super(name, age, gender);
        this.levelId = levelId;
        this.marks = marks;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    

    public int getLevel() {
        return levelId;
    }

    public int setLevel(int levelId) {
       return this.levelId = levelId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    
    
}
