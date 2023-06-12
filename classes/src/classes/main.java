package classes;

public class main {

	public static void main(String[] args) {
		Car2 c = new Car2("M", "red");
		Car2 cc = new Car2("l","blue");
		System.out.println(c.speed);		
		System.out.println(c.open);
		c.Opened();
		c.BuletProff();
		System.out.println("color of car is: " + cc.color);
		System.out.println(cc.color);
	}

}
