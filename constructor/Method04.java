package project03;
import java.util.*;


public class Method04 {
	
	String ID="";//�p�G�S����l��->�u�O�ŧi�ܼơA���S���}�ݩ�L���O���� 
	
	void setID(String s) {
		if(s.matches(".{10}")) { //match�O��� �A�b()���n��""�A�b""�̭���J���з� //.�O���@�� {10}�O��10�Ӧr��
			this.ID=s; //this.�O�����o�o�̪��O���� ��ĳ���n�gthis�~���|�d�V
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
