package project03;

public class Method05 {
	public static void main(String[] args) {
		//c1代表Car這個class, 可管理 new Car相關的空間
		//Car空間內的佈置,以Car()為主
		car c1=new car();//當建構子(car())無參數時,可省略
		car c2=new car("紅");
		c1.color="y";
		System.out.println(c1.color);
		System.out.println(c2.color);
	}

}
class car{ //public的class只能在他自己的file裡(也就是說一個file只能有一個public的class)
	String color="白";
	
	car(){} //建構子 
	//建構子必須和class名稱相同
	//若沒有定義建構子,JVM(虛擬主機)會自動補上無參數的建構子(預設建構子->car(){})
	car(String c){
		this.color=c;
	}
}
