package extend.cat;
import extend.animal;
public class cat extends animal{
	String name="cat";
	
	@Override
	public void move() {
		System.out.println("walk lazily");
	}
	
	@Override
	public void food() {//�����override�L�Ӫ�method�s���v�����C
		System.out.println("prefer fish");
	}
	
	public cat(){ 
		//��ĳ�l�����غc�l���n��super();
		//���M�غc�l�L�ѼƮɡA�t�η|�۰ʸɤWsuper();
		super();
		//�n�����Ppackage���N�n��public
		//���D���~�����Y�A�N�]�i�H��protected
		System.out.println("creat ok!");
	}

}
