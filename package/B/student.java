package B;//�@�w�n�b�̤W���A���藍��R

import java.util.Scanner;

public class student {
	public String studentName="aa";
	private String pw="1234";
	
	public void getPW() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please key int the code");
		String code=sc.nextLine();
		if(code.equals("1111")) { //string�����==�A�n��equal
			System.out.println("password is 1234");
		}
		else {
			System.out.println("ERROR");
		}
	}
}
//-----------------------

class mate{ //�n�Opublic�~��Q�O��package import
	
}