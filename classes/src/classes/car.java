package classes;

public class car {
	String type = "bmw";
	int sits = 2;
	int height = 4;
	float speed = 203.23f;
	
	static boolean open = false;
	
	static void Opened() {
		try {
			open = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void close() {
		try {
			open = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
