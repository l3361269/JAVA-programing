package project06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
public class Set01 {
	public static void main(String[] args) {
		//Set�����J�ۦP������(�|�̾ڨ�ȨӧP�_�O�_�ۦP)
		//Set�����������̥[�J�����Ǩө�m(�����S��index)
		//�ӬO�H��O�����m�ө�m
		//�����Y��JAVA���API��(ex.String�Bchar�B�򥻸�ƫ��A��)�A�h�|�����ݨ�ȨӧP��O�_�ۦP
		HashSet hs = new HashSet();
		hs.add("JAVA");
		hs.add(12.8);
		hs.add('b');
		hs.add("JAVA");
		hs.add(12.8);
		hs.add('b');
		hs.add(new car());
		hs.add(new car());
		System.out.println(hs);
		//---
		//���X
		/*1.for�g�kI
		for(int i =0;i<hs.size();i++) { //set�S�����ǡA�ҥH����H����(��index)�Ӽg
			System.out.println();
		}*/
		/*2.for�g�kII
		for(Object o:hs) { //�Hset���e���Ӽg�O�i�H��
			if(o<=30) {} //���O�Yset�S���L�o�L�A�h����������k
		}*/
		//3.iterator
		Iterator it=hs.iterator();//=�k�������:�إ�hs���ƥ�(iterator)�A���=���䪺Iterator�e���� �W�٥sit
		while(it.hasNext()) {//boolean hasNext():�p�G�٦��U�@�Ӥ����Nreturn true�A�]�N�O����next()�^�ǥX�F��(�Ӥ��Oexception)���ܡA�N�|return true
			//hs.add(222);//����b�ާ@�ƥ��� �ާ@��e��(�]���ƥ��|�������F��e��)
			System.out.println(it.next());
			it.remove();//�ާ@�ƥ��ɷ|�P�B�ާ@���e��
		}
		System.out.println(hs);//
		
	}

}
class car{
  //�ۤv������override:�ﱼ�w�]
  //��������k�O���ݳQ�I�s �~�|�Ψ쪺
	@Override
	public String toString() { //��ܳo�Ӫ��󪺦W��(�쥻�w�]�O�O�����})
		// TODO Auto-generated method stub
		return "car";
	}

	@Override
	public boolean equals(Object arg0) { //��磌��O�_�P�w�s�b�����󪺰O�����}�ۦP
		// TODO Auto-generated method stub
		return true;//�令���޵��G�p��return true(�^���O�����m�@��)
	}

	@Override
	public int hashCode() { //�^�Ǧ�����hashcode
		// TODO Auto-generated method stub
		//return super.hashCode(); //default
		return 100; //���޹�ں��M�A���^��100
	}
	
	//set�b�[�Jelement�ɡA�|�I�sequals�Bhashcode�A��double check���󪺰O�����m�O�_�ۦP
	//���ާڭ̦��B����override�ﱼ�w�]�A�F�Lset�F
	//���N��u���ͥX�@��car�Ӥw�A��ڤW�O�ŧi�X���N�إߤF�X��car
	
	
}
