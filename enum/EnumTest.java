package Enum;

public class EnumTest {

	public static void main(String[] args) {
		//Light l=new Light();-->ERROR:�]��enum���غc�l�Oprivate
		
		//�����ϥ�enum����
		System.out.println(Light.RED.name);
		//����enum���䤤�@�Ӫ���|�P�ɫإ߰_�Ҧ�enum������A�]���|����T��enum�غc�l
		//�����ϥ�enum����
		Light L1=Light.RED; //��"int i = �Y���w�ŧi���ܼ�"�Ӳz��
		System.out.println(L1.name);

	}
}

enum Light {//enum�O�ܫʳ����A����Q�~��(�]����غc�l�@�w�Oprivate)�A�]�����~�ӧO�H
	//�Ĥ@�楲���ŧi�ۤv������
	RED("red"),GREEN("green"),YELLOW("yellow");
	/*�޿赥�P��H�U(������g�H�U����)
	 *  Light RED=new Light("red"):
	 * Light GREEN=new Light("green");
	 * Light YELLOW=new Light("yellow");
	 *�Y���󤣻ݭn��J�Ѽƫh�u�nRED,GREEN,YELLOW
	 */
	
	String name;
	
	//enum���غc�l���s���v���u��Oprivate(�w�]�]�Oprivate)
	Light(String name){
		this.name=name;
		System.out.println("object ok");
	}
	void show() {
		System.out.println(name);
	}	
}


//class QQ extends Light{}-->ERROR:�]��enum���غc�l�Oprivate
