package project06;
import java.util.*;
public class Set03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set���[�J�������O�ۤv�w�q�����A�h�n�ƧǮɭn�ۤv�]�w�ƧǳW�h
		TreeSet ts3=new TreeSet(new MyCom());//�غc�l1(�غc�l2):�غc�l2���غc�l1�����ѼơA�ӱj�ƫغc�l1
		ts3.add(new car2("a",1));
		ts3.add(new car2("d",2));
		ts3.add(new car2("b",2));
		ts3.add(new car2("b",3));
		ts3.add(new car2("c",3));
		ts3.add(new car2("a",1));
		System.out.println(ts3);
		

	}

}
class car2{
	String ID;
	int no;
	public car2(String iD, int no) {
		super();
		ID = iD;
		this.no = no;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ID;
	}
	
}
//�s�W�l�����[�ƥ\��-----------------------
//Comparator:�A�Ω���
//Comparable:�A�Ω�r�� (�f�tcompareTo)
class MyCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//�૬
		car2 c1=(car2)o1;
		car2 c2=(car2)o2;
		//�Hc1����no(���)�Pc2����no�i��۴�,�H�o��ƧǪ��̾�
		//0:�G�̬ۦP
		//1(��):c1���j,�ƦZ��
		//-1(�t):c1���p,�ƫe��
		return c1.no-c2.no;//c1:�p->�j //c1�O�Ӧ��n��J�������Ac2�O�H�bset������
		//return c2.no-c1.no;//c1:�j->�p
	    
		//����r��
		//return c1.ID.compareTo(c2.ID);//c1:�p->�j
	}
	
	
}
