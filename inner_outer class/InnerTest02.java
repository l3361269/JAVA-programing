package project05;

public class InnerTest02 {

	public static void main(String[] args) {
		AA a =new AA() {//inerface�i�H�Q�إߪ���A���O�n�Hoverride���覡->new �غc�l(){override};
			int t=100;

			@Override  //���k��->source->override/implement
			//�boverride��interface����k�~�����䤺�e
			public void test() {
				System.out.println("ok");
				
			}
			
		};//�`�N;!!!!!! �o�ˤ~��
		//System.out.println(a.t); ->ERROR:�u���interface�w�q���F��

	}

}
interface AA{
	void test();//�]��interface�O�����㪺���c�A�ҥH���k���঳{}�A�ӬO����;
}
