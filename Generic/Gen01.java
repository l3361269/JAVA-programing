package project06;

public class Gen01 {
//泛型:指定類型
	public static void main(String[] args) {
		Drink<Integer> d1=new Drink<Integer>();//<>內要放入物件等級的類型，所以是Integer(不是int)
		d1.price=50;
		
		Drink d2=new Drink();//沒有指定<>是什麼，則為指定型態的那個東西的型態就是object
		d2.price=50;
		//d2.price+=5;//ERROR:物件沒法做運算

	}

}
class Drink<T>{ //<>是指定要是什麼資料類型的意思，T是隨便寫的(但是常寫T或E)，也可以是a什麼的
	String name;
	T price;//因為price的資料類型還不確定 所以用T這個還不限定的類型
}
