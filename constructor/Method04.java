package project03;
import java.util.*;


public class Method04 {
	
	String ID="";//如果沒有初始化->只是宣告變數，但沒有開屬於他的記憶體 
	
	void setID(String s) {
		if(s.matches(".{10}")) { //match是比對 ，在()中要有""，在""裡面輸入比對標準 //.是任一值 {10}是有10個字元
			this.ID=s; //this.是指取得這裡的記憶體 建議都要寫this才不會搞混
		}
		else {
			System.out.println("ERROR");
		}
	}
	
	String getID(){ 
		if(ID.equals("")) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("EPlease key in the ID");
			String ss=scanner.nextLine();
			setID(ss);
			return ss;
		}
		else {
			return ID;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method04 m=new Method04();
		//m.setID("L123456789");
		System.out.println(m.getID());

	}

}
