package extend.dog;
import extend.animal;
public class dog extends animal{
	String name="dog";//�ݩʫإߦb�����(�U�ۿW�߫إߡA���z�Z)
	//�ݩʨS��override�����D
	//method�إߦbmethod�Ϫ��O����-->��override�����D
	@Override
	public void move() {
		System.out.println("run fast");
		//�w�]:super.move();
	}
	
	
	@Override
	public void food() {
		System.out.println("prefer bone");
	}

	public dog() {
		super();
	}

}
