package extend;


//�ۤvpackage���F�褣��import
public class MakePhone {

	public static void main(String[] args) {
		phone02 p2=new phone02();//�|���������phone01()�A����l��phone02()->���إߤ����O����A�إߤl���O����
		phone01 p1=new phone01(6);
		//System.out.println(p2.RAM);//�l�����ק諸�ݩʡA�O����N�u�|���l���ק粒��->�ҥHp2.RAM�Ophone02�w�q��private 1300
		System.out.println(p1.px);//����phone02�A�]���o�Ophone01������
		//System.out.println(p2.super.size);//ERROR-->main�OJVM�����super 
		p2.open();//��k�i�H�Q�O���A���O�O����L�Q�w�q�ɩ��ݪ�class�����e-->�ҥH�Yphone02�S���w�qopen()�A���o�̬Oprint"4.7/2/700"(phone01���������e)
	
	}

}
