package A;
//自己package的東西不用import
public class run {
	public static void main(String[] args) {
		mother m=new mother();
		child c1=new child();
		
		System.out.println(m.age);//m只有money不能用
	}

}
