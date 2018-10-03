package extend;

public final class phone02 extends phone01{//class 如果final則繼承此類的都不能再更改此類
	private int px=1300;//子類可以修改父類的屬性(但是一樣要宣告變數)
	float size=5.5F;
	//子類和父類的屬性是開兩個不同的物件記憶體去建立的，所以屬性在定義時是互相獨立的，因此子類定義的屬性會取代掉父類的屬性
	phone02(){
		//super();//(這個可以省略，程式會自己補上)代表上一層class的建構子
		super(4);//如果上一層父類有要傳入參數，這裡括號就要填入參數值
		//super只能用在子類裡面
		System.out.println("phone02 ok");
	}
	/*void open(){//phone01的open用final，而因為方法的記憶體只有一個一起共用，所以子類就不能再更改定義
		System.out.println(size+"/"+RAM+"/"+px);//如果父類有定義private那當然非父類的地方都不能print出private的
	}*/
	void open(int i) {
		//此方法跟父類的open()不一樣，所以不受父類final限制
	}

}
