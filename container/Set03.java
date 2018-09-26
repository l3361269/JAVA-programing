package project06;
import java.util.*;
public class Set03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set中加入的元素是自己定義的類，則要排序時要自己設定排序規則
		TreeSet ts3=new TreeSet(new MyCom());//建構子1(建構子2):建構子2為建構子1中的參數，來強化建構子1
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
//新增子類附加排功能-----------------------
//Comparator:適用於整數
//Comparable:適用於字串 (搭配compareTo)
class MyCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//轉型
		car2 c1=(car2)o1;
		car2 c2=(car2)o2;
		//以c1物件的no(整數)與c2物件的no進行相減,以得到排序的依據
		//0:二者相同
		//1(正):c1較大,排后面
		//-1(負):c1較小,排前面
		return c1.no-c2.no;//c1:小->大 //c1是該次要放入的元素，c2是以在set的元素
		//return c2.no-c1.no;//c1:大->小
	    
		//比較字串
		//return c1.ID.compareTo(c2.ID);//c1:小->大
	}
	
	
}
