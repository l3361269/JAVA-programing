package extend;


//自己package的東西不用import
public class MakePhone {

	public static void main(String[] args) {
		phone02 p2=new phone02();//會先執行父類phone01()再執行子類phone02()->先建立父類記憶體再建立子類記憶體
		phone01 p1=new phone01(6);
		//System.out.println(p2.RAM);//子類有修改的屬性，記憶體就只會有子類修改完的->所以p2.RAM是phone02定義的private 1300
		System.out.println(p1.px);//不管phone02，因為這是phone01的物件
		//System.out.println(p2.super.size);//ERROR-->main是JVM不能用super 
		p2.open();//方法可以被記成，但是是執行他被定義時所屬的class的內容-->所以若phone02沒有定義open()，那這裡是print"4.7/2/700"(phone01父類的內容)
	
	}

}
