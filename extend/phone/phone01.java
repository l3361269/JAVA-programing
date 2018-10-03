package extend;

public class phone01 {
	float size=4.7F;//小數有兩種形式:double(8 byte)、float(4 byte)，要指定小數為float型態就要在數字後面加上"F"
	private int RAM=2;
	int px=700;
	phone01(int RAM){
		System.out.println("phone01 OK");//constructor只能自己class用，但屬性、方法可以給別人繼承
	}
	
	final void open() {//void和方法一定要寫在一起(返回值和方法要寫在一起)
		System.out.println(size+"/"+RAM+"/"+px);
	}

}
