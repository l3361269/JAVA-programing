package project05;

public class InnerTest05 {

	public static void main(String[] args) {
		//new Outer02();
		Outer02 o2=new Outer02();
		o2.test01();
		

	}

}
class Outer02{
	int a=5;
	void test01() {
		int a =6; //�p�G�M�ת����O1.7�N�n�[�Wfinal�~��Q����������k�ΡA��android�O�ϥ�1.7���A�ҥH�]�O�o��
		class Inner02{
			//int a=7;
			void test02() {
				//int a=8;
				System.out.println(a);
			}
		}
		new Inner02().test02();
	}
	/*Inner02 a=new Inner02();
	a.test02();->ERROR:�]���������O�w�q�b��k���A�X�F��k�N����ΤF(���ެO�ݩʡB���������)*/
}
