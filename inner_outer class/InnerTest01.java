package project05;

public class InnerTest01 {

	public static void main(String[] args) {
		Outer01.Inner01 i=new Outer01().new Inner01();
		i.getA();
		
		Outer01 o1=new Outer01();
		Outer01.Inner01 i1=o1.new Inner01();
		Outer01.Inner01 i2=o1.new Inner01();
		o1.getA();

	}

}

class Outer01{//�~����
	int b= 100;
	void getA() {
		int b=499;
		System.out.println("�~��������k���ϰ��ܼ�: "+b); //499
		System.out.println("�~���������ݩ��ܼ�: "+this.b);//100 (this:����k�Ҧb��class������)
		System.out.println("�����������ݩ��ܼ�: "+new Inner01().b);//500 (���������C�@���A�ҥH�n�إߤ���������)
		//�~�����L�k���o����������k���ϰ��ܼ�(999)
	}
	class Inner01{ //������
		private int b=500;
		
		void getA() {
			int b=999;
			System.out.println("����������k���ϰ��ܼ�: "+b); //999
			System.out.println("�����������ݩ��ܼ�: "+this.b);//500 (this:����k�Ҧb��class������)
			System.out.println("�~���������ݩ��ܼ�: "+Outer01.this.b);//100 (this:�����class������O����(�ҥH�������إ߸�class������))
		    //�������L�k���o�~��������k���ϰ��ܼ�(499)
		}
	}
}
