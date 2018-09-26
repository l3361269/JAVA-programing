package B;//一定要在最上面，絕對不能刪

import java.util.Scanner;

public class student {
	public String studentName="aa";
	private String pw="1234";
	
	public void getPW() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please key int the code");
		String code=sc.nextLine();
		if(code.equals("1111")) { //string不能用==，要用equal
			System.out.println("password is 1234");
		}
		else {
			System.out.println("ERROR");
		}
	}
}
//-----------------------

class mate{ //要是public才能被別的package import
	
}