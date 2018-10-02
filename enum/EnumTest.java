package Enum;

public class EnumTest {

	public static void main(String[] args) {
		//Light l=new Light();-->ERROR:因為enum的建構子是private
		
		//直接使用enum物件
		System.out.println(Light.RED.name);
		//執行enum的其中一個物件會同時建立起所有enum的物件，因此會執行三次enum建構子
		//間接使用enum物件
		Light L1=Light.RED; //用"int i = 某早已宣告的變數"來理解
		System.out.println(L1.name);

	}
}

enum Light {//enum是很封閉的，不能被繼承(因為其建構子一定是private)，也不能繼承別人
	//第一行必須宣告自己的物件
	RED("red"),GREEN("green"),YELLOW("yellow");
	/*邏輯等同於以下(但不能寫以下那樣)
	 *  Light RED=new Light("red"):
	 * Light GREEN=new Light("green");
	 * Light YELLOW=new Light("yellow");
	 *若物件不需要輸入參數則只要RED,GREEN,YELLOW
	 */
	
	String name;
	
	//enum的建構子的存取權限只能是private(預設也是private)
	Light(String name){
		this.name=name;
		System.out.println("object ok");
	}
	void show() {
		System.out.println(name);
	}	
}


//class QQ extends Light{}-->ERROR:因為enum的建構子是private
