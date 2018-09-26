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
		ts.add("田");
		ts.add("甲");
		System.out.println(ts); //一定要同樣資料型態才能做排序
		
		TreeSet ts2=new TreeSet();
		ts2.add(1);
		ts2.add(5);
		ts2.add(35);
		
		System.out.println(ts2);
		
		//走訪
		Iterator it=ts2.iterator();
		while(it.hasNext()) {
			int i=(int)it.next(); //只要沒有過濾，set中元素的資料型態都是object，所以要做轉型才能比較
			if(i>30) {
				System.out.println(i);
			}
		}
	

	}

}
