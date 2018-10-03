package extend.dog;
import extend.animal;
public class dog extends animal{
	String name="dog";//屬性建立在物件區(各自獨立建立，不干擾)
	//屬性沒有override的問題
	//method建立在method區的記憶體-->有override的問題
	@Override
	public void move() {
		System.out.println("run fast");
		//預設:super.move();
	}
	
	
	@Override
	public void food() {
		System.out.println("prefer bone");
	}

	public dog() {
		super();
	}

}
