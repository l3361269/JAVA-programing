package B;

//import A.child; ->ERROR:這個class不是public，所以別的package不能用
import A.mother;

public class Run {

	public static void main(String[] args) {
		mother m=new mother();
		//child c1=new child();
		
		System.out.println(m.name); //m只剩name可以用

	}

}
