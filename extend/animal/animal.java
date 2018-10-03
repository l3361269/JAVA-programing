package extend;

public class animal {
	String name="animal";
	int leg=4;
	
	protected void move() {
		System.out.println("run slowly");
	}
	public void food() {
		System.out.println("eat everything");
	}
	public animal(){ //default不能給別人用
		System.out.println("creat animal done!");
	}

}
