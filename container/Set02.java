package project06;
import java.util.*;

import javax.swing.text.TabableView;

public class Set02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet ts=new TreeSet();
		ts.add("1");
		ts.add("2");
		ts.add("5");
		ts.add(" ");
		ts.add("   ");
		ts.add("apple");
		ts.add("bag");
		ts.add("c");
		ts.add("��");
		ts.add("��");
		System.out.println(ts); //�@�w�n�P�˸�ƫ��A�~�వ�Ƨ�
		
		TreeSet ts2=new TreeSet();
		ts2.add(1);
		ts2.add(5);
		ts2.add(35);
		
		System.out.println(ts2);
		
		//���X
		Iterator it=ts2.iterator();
		while(it.hasNext()) {
			int i=(int)it.next(); //�u�n�S���L�o�Aset����������ƫ��A���Oobject�A�ҥH�n���૬�~����
			if(i>30) {
				System.out.println(i);
			}
		}
	

	}

}
