package project03;

public class con02 {

	public static void main(String[] args) {
		Member m1=new Member("abc",123);
		Member m2=new Member("def",456);
		System.out.println(m1.money);
		System.out.println(m2.money);
		
		
		//m1.Member("A",144); ->不行，建構子只能在最一開始宣告變數時被執行
		m2.money=789;
		System.out.println(m2.money);

	}
}
class Member{
	String name;
	int money;
	//建構子(constructor)是建立物件時第一個被執行的方法
	//建構子在CPU中的處理方式和method不一盎，不能在前面加上void、string之類的
	Member(String name, int money) {	
		this.name = name;
		this.money = money;
		welcome();
	}
	void welcome(){
		System.out.println("Set up successfully");
	}
	
}

