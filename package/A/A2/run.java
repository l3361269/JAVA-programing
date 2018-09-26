package A.A2;
//在A package底下的A2 paclage->建立時要取名為A.A2
//A.A2的存取權限視為和A不一樣的package
//所以也要import A package的東西進來
//import A.child;
import A.mother;

public class run {
	public static void main(String[] args) {
		mother m=new mother();
		//child c1=new child();
		
		System.out.println(m.name);//只有m的name是public可以存取，其他都不行
		
	}

}
