package Sasa;

public abstract class Promote {
public boolean promote(int marks) {
	if(marks>= 50) {
		return true;
	}else {
		return false;
	}
}

abstract public void output();
}
