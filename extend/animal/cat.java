package extend.cat;
import extend.animal;
public class cat extends animal{
	String name="cat";
	
	@Override
	public void move() {
		System.out.println("walk lazily");
	}
	
	@Override
	public void food() {//不能把override過來的method存取權限降低
		System.out.println("prefer fish");
	}
	
	public cat(){ 
		//建議子類的建構子都要有super();
		//雖然建構子無參數時，系統會自動補上super();
		super();
		//要給不同package的就要用public
		//除非有繼承關係，就也可以用protected
		System.out.println("creat ok!");
	}

}
